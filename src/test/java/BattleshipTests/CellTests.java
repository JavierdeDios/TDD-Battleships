package BattleshipTests;

import BattleshipGame.Controlador.Cell;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellTests {
    Cell cell;

    @BeforeEach
    //setup de la cell
    void setUpCell() {
        cell = new Cell();
    }

    //Test caixa negra pel constructor de la classe
    @Test
    void SetCellTest() {
        assertEquals(0, cell.getM_value());
        assertEquals(false, cell.getM_show());
    }

    //Tests caixa negra dels setters i getters de la classe cell
    @ParameterizedTest
    //Test amb possibles valors per la variable value
    @ValueSource(ints = {0, 1, 2, 3})
    void SetterGetterValueTest(int i) {
        cell.setM_value(i);
        assertEquals(i, cell.getM_value());

        cell.setM_value(i+1);
        assertEquals(i+1, cell.getM_value());
    }

    @Test
    //Test amb possibles valors de la variable show, ens assegurem que el valor es canvia correctament
    void SetterGetterShowTest() {
        cell.setM_show(true);
        assertEquals(true, cell.getM_show());

        cell.setM_show(false);
        assertEquals(false, cell.getM_show());

        cell.setM_show(true);
        assertEquals(true, cell.getM_show());
    }
}
