package BattleshipTests;

import BattleshipGame.Cell;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void SetterGetterValueTest(int i) { //Test possible values in variable value from class cell
        cell.setM_value(i);
        assertEquals(i, cell.getM_value());

        cell.setM_value(i+1);
        assertEquals(i+1, cell.getM_value());
    }

    @Test
    void SetterGetterShowTest() { //Test possible values in variable show from class cell, assure that you can switch the value
        cell.setM_show(true);
        assertEquals(true, cell.getM_show());

        cell.setM_show(false);
        assertEquals(false, cell.getM_show());

        cell.setM_show(true);
        assertEquals(true, cell.getM_show());
    }
}
