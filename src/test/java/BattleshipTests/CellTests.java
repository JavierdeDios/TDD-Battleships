package BattleshipTests;

import BattleshipGame.Cell;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CellTests {
    Cell cell;

    @BeforeEach
    void setUpCell() {
        cell = new Cell();
    }

    @Test
    void SetCellTest() {
        assertEquals(0, cell.getM_value());
        assertEquals(false, cell.getM_show());
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
