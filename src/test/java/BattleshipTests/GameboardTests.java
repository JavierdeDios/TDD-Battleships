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
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePlaceShips")
    void PlaceShipTest(int x, int y, char orientation, int len, boolean resultat) {
        assertEquals(resultat, tauler.placeShip(x, y, orientation, len));
    }

}
