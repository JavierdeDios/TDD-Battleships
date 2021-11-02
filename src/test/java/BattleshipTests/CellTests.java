package BattleshipTests;

import BattleshipGame.Cell;

import org.junit.jupiter.api.*;

public class CellTests {
    Cell cell;

    @BeforeEach
    void setUpCell() {
        cell = new Cell();
    }

    @Test
    void SetCellTest() {
        AssertTrue(cell.value == 0);
        AssertFalse(cell.show);
    }
    /*
    @Test
    void SetCellValueTest() {

    }

    @Test
    void SetCellShowTest() {

    }
    */
}
