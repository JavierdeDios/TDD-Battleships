package BattleshipTests;

import BattleshipGame.Controlador.Gameboard;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class GameboardTests {
    Gameboard tauler;

    @BeforeEach
    //set up gameboard
    void setUpGameboard() {
        tauler = new Gameboard();
    }

    //test caixa negra setters i getters
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 9})
    void SetterGetterCellValueTest(int i) {
        tauler.setCellValue(i, i, i); //(x, y, value)
        assertEquals(i, tauler.getCellValue(i, i));
    }

    //test caixa negra canvi de valor de show
    @Test
    void SwitchShowCellTest() {
        tauler.showCell(0, 0);
        assertEquals(true, tauler.getCellShow(0, 0));
        assertEquals(false, tauler.getCellShow(0, 1));
    }

    //Test caixa negra, blanca amb pairwise, decision, condicion i path coverage. Comprova que vaixells de diferentes mides es col.loquen correctament
    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePlaceShip")
    void PlaceShipTest(int x, int y, char orientation, int len, boolean resultat) {
        assertEquals(resultat, tauler.placeShip(x, y, orientation, len));
    }

    //Test caixa negra, blanca amb valors frontera, decision, condicion i path coverage. Comprova que vaixells de diferentes mides es col.loquen correctament a les vores del tauler
    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePlaceShipBoundaries")
    void PlaceShipBoundariesTest(int x, int y, char orientation, int len, boolean resultat) {
        assertEquals(resultat, tauler.placeShip(x, y, orientation, len));
    }

    //Test caixa negra, amb valors frontera i particio equivalent. Comprova que col.lisions hortizontals
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    void PlaceShipHorizontalCollisionTest(int i) {
        tauler.setCellValue(0, i, 1);
        assertEquals(i>=5, tauler.placeShip(0, 0, 'h', 5));
    }

    //Test caixa negra, amb valors frontera i particio equivalent. Comprova que col.lisions verticals
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    void PlaceShipVerticalCollisionTest(int i) {
        tauler.setCellValue(i, 0, 1);
        assertEquals(i>=5, tauler.placeShip(0, 0, 'v', 5));
    }

    //Test caixa negra, amb valors frontera i particio equivalent. Comprova que vaixells hortizontals es col.loquen correctament
    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePlaceShipHorizontal")
    void PlaceShipPlacementHorizontalTest(int x, int y, int length, boolean result) {
        assertEquals(result, tauler.placeShip(x, y, 'h', length));
        if(!result) {
            for(int i = 0; i < 10; i++) {
                assertEquals(0, tauler.getCellValue(0, i));
            }
        }
        else {
            for(int i = 0; i < 10; i++) {
                if (i >= y && i < y + length) {
                    assertEquals(1, tauler.getCellValue(0, i));
                } else {
                    assertEquals(0, tauler.getCellValue(0, i));
                }
            }
        }
    }

    //Test caixa negra, amb valors frontera i particio equivalent. Comprova que vaixells verticals es col.loquen correctament
    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePlaceShipVertical")
    void PlaceShipPlacementVerticalTest(int x, int y, int length, boolean result) {
        assertEquals(result, tauler.placeShip(x, y, 'v', length));
        if(!result) {
            for(int i = 0; i < 10; i++) {
                assertEquals(0, tauler.getCellValue(i, 0));
            }
        }
        else {
            for(int i = 0; i < 10; i++) {
                if (i >= x && i < x + length) {
                    assertEquals(1, tauler.getCellValue(i, 0));
                } else {
                    assertEquals(0, tauler.getCellValue(i, 0));
                }
            }
        }
    }

    //Test caixa negra, amb valors frontera i particio equivalent. Comprova que col.lisions entre vaixells
    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePlaceShipCollision")
    void PlaceShipPlacementShipCollisionTest(int x, int y, char orientation, int length, boolean result) {
        assertEquals(true, tauler.placeShip(0, 5, 'v', 5));
        assertEquals(true, tauler.placeShip(5, 4, 'v', 5));

        assertEquals(true, tauler.placeShip(4, 0, 'h', 5));
        assertEquals(true, tauler.placeShip(5, 5, 'h', 5));

        assertEquals(result, tauler.placeShip(x, y, orientation, length));
    }

    //Test caixa negra amb particio equivalent i test de valors frontera. Comprova que es registren atacs correctament a diferents punts del tauler
    @Test
    void attackPointTest() {
        tauler.setCellValue(0,1, 1);
        tauler.showCell(0,0);
        assertEquals(-1, tauler.attackPoint(0, 0)); //Ja mostrat
        assertEquals(0, tauler.attackPoint(0, 2)); //Aigua
        assertEquals(-1, tauler.attackPoint(0, 2)); //Ja mostrat
        assertEquals(1, tauler.attackPoint(0, 1)); //Tocat
        assertEquals(-1, tauler.attackPoint(0, 1)); //Ja mostrat

        tauler.placeShip(1, 0, 'v', 3);
        assertEquals(1, tauler.attackPoint(1, 0)); //Tocat
        assertEquals(1, tauler.attackPoint(2, 0)); //Tocat
        assertEquals(1, tauler.attackPoint(3, 0)); //Tocat
        assertEquals(0, tauler.attackPoint(4, 0)); //Aigua
        assertEquals(-1, tauler.attackPoint(1, 0)); //Ja mostrat
        assertEquals(-1, tauler.attackPoint(2, 0)); //Ja mostrat
        assertEquals(-1, tauler.attackPoint(3, 0)); //Ja mostrat
        assertEquals(-1, tauler.attackPoint(4, 0)); //Ja mostrat
    }

    //Test caixa negra amb particio equivalent i test de valors frontera. Comprova si el vaixell s'enfonsa correctament
    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourceSunkShip")
    void isSunkTest(int x, int y, char orientation, int length) {
        tauler.placeShip(x, y, orientation, length);
        if (orientation == 'h') {
            for(int i = y; i < length + y; i++) {
                assertEquals(false, tauler.isSunk(x, y, orientation, length));
                tauler.attackPoint(x, i);
            }
            assertEquals(true, tauler.isSunk(x, y, orientation, length));
            for(int i = y; i < length + y; i++) {
                assertEquals(2, tauler.getCellValue(x, i));
            }
        } else {
            for(int i = x; i < length + x; i++) {
                assertEquals(false, tauler.isSunk(x, y, orientation, length));
                tauler.attackPoint(i, y);
            }
            assertEquals(true, tauler.isSunk(x, y, orientation, length));
            for(int i = x; i < length + x; i++) {
                assertEquals(2, tauler.getCellValue(i, y));
            }
        }
    }
}
