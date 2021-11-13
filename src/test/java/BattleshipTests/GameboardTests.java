package BattleshipTests;

import BattleshipGame.Gameboard;
import BattleshipGame.Cell;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class GameboardTests {

    Gameboard tauler;

    @BeforeEach
    void setUpGameboard() {
        tauler = new Gameboard();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 9})
    void SetterGetterCellValueTest(int i) {
        tauler.setCellValue(i, i, i); //(x, y, value)
        assertEquals(i, tauler.getCellValue(i, i));
    }

    @Test
    void SwitchShowCellTest() {
        tauler.showCell(0, 0);
        assertEquals(true, tauler.getCellShow(0, 0));
        assertEquals(false, tauler.getCellShow(0, 1));
    }

    //Pairwise test per a totes les longituds de vaixells.
    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePlaceShip")
    void PlaceShipTest(int x, int y, char orientation, int len, boolean resultat) {
        assertEquals(resultat, tauler.placeShip(x, y, orientation, len));
    }


    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePlaceShipBoundaries")
    void PlaceShipBoundariesTest(int x, int y, char orientation, int len, boolean resultat) {
        assertEquals(resultat, tauler.placeShip(x, y, orientation, len));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    void PlaceShipHorizontalCollisionTest(int i) {
        tauler.setCellValue(0, i, 1);
        assertEquals(i>=5, tauler.placeShip(0, 0, 'h', 5));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    void PlaceShipVerticalCollisionTest(int i) {
        tauler.setCellValue(i, 0, 1);
        assertEquals(i>=5, tauler.placeShip(0, 0, 'v', 5));
    }

    // Tests funcio placeShip que testejen l'inserció
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

    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePlaceShipCollision")
    void PlaceShipPlacementShipCollisionTest(int x, int y, char orientation, int length, boolean result) {
        assertEquals(true, tauler.placeShip(0, 5, 'v', 5));
        assertEquals(true, tauler.placeShip(5, 4, 'v', 5));

        assertEquals(true, tauler.placeShip(4, 0, 'h', 5));
        assertEquals(true, tauler.placeShip(5, 5, 'h', 5));

        assertEquals(result, tauler.placeShip(x, y, orientation, length));
    }

    @Test
    void attackPointTest(int x, int y, int resultat) {
        tauler.setCellValue(0,1, 1);
        tauler.showCell(0,0);
        assertEquals(-1, tauler.attackPoint(0, 0)); //Ja mostrada
        assertEquals(0, tauler.attackPoint(0, 2)); //Aigua
        assertEquals(-1, tauler.attackPoint(0, 2)); //Ja mostrat
        assertEquals(1, tauler.attackPoint(0, 1)); //Tocat
        assertEquals(-1, tauler.attackPoint(0, 1)); //Ja mostrat
    }

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
        } else {
            for(int i = x; i < length + x; i++) {
                assertEquals(false, tauler.isSunk(x, y, orientation, length));
                tauler.attackPoint(i, y);
            }
            assertEquals(true, tauler.isSunk(x, y, orientation, length));
        }
    }
}
