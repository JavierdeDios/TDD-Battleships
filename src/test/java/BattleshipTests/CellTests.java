package BattleshipTests;

import BattleshipGame.Cell;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void SetterGetterValueTest() {
        //Add a 2 to the value
        cell.setM_value(2);
        assertEquals(2, cell.getM_value());
    }

    @Test
    void SetterGetterShowTest() {
        //Switch from false to true
        cell.setM_show(true);
        assertEquals(true, cell.getM_show());
    }
}
