package BattleshipTests;

import BattleshipGame.Controlador.Ship;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShipTests {
    Ship ship;

    @BeforeEach
    void setUpShip() {
        ship = new Ship();
    }

    @Test
    void setShipTest() {
        assertEquals(-1, ship.getM_x());
        assertEquals(-1, ship.getM_y());
        assertEquals(' ', ship.getM_orientation());
        assertEquals(0, ship.getM_length());
        assertEquals(false, ship.getM_sunk());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    void SetterGetterXTest(int i) {
        ship.setM_x(i);
        assertEquals(i, ship.getM_x());

        ship.setM_x(i + 1);
        assertEquals(i + 1, ship.getM_x());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    void SetterGetterYTest(int i) {
        ship.setM_y(i);
        assertEquals(i, ship.getM_y());

        ship.setM_y(i + 1);
        assertEquals(i + 1, ship.getM_y());
    }

    @Test
    void SetterGetterOrientationTest() {
        ship.setM_orientation('h'); //Horizontal
        assertEquals('h', ship.getM_orientation());

        ship.setM_orientation('v'); // Vertical
        assertEquals('v', ship.getM_orientation());
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5})
    void SetterGetterLengthTest(int i) {
        ship.setM_length(i);
        assertEquals(i, ship.getM_length());

        ship.setM_length(i + 1);
        assertEquals(i + 1, ship.getM_length());
    }

    @Test
    void initializeShipTest() {
        ship = new Ship(5, 4, 'h', 3);
        assertEquals(5, ship.getM_x());
        assertEquals(4, ship.getM_y());
        assertEquals('h', ship.getM_orientation());
        assertEquals(3, ship.getM_length());

        ship = new Ship(4, 7, 'v', 2);
        assertEquals(4, ship.getM_x());
        assertEquals(7, ship.getM_y());
        assertEquals('v', ship.getM_orientation());
        assertEquals(2, ship.getM_length());
    }

    @Test
    void isThisShipTest() {
        ship = new Ship(0, 0, 'h', 5);
        assertEquals(true, ship.isThisShip(0, 0));
        assertEquals(true, ship.isThisShip(0, 1));
        assertEquals(true, ship.isThisShip(0, 2));
        assertEquals(true, ship.isThisShip(0, 3));
        assertEquals(true, ship.isThisShip(0, 4));
        assertEquals(false, ship.isThisShip(0, 5));
        assertEquals(false, ship.isThisShip(1, 0));
        assertEquals(false, ship.isThisShip(1, 1));
        assertEquals(false, ship.isThisShip(1, 2));
        assertEquals(false, ship.isThisShip(1, 3));
        assertEquals(false, ship.isThisShip(1, 4));

        ship = new Ship(0, 0, 'v', 5);
        assertEquals(true, ship.isThisShip(0, 0));
        assertEquals(true, ship.isThisShip(1, 0));
        assertEquals(true, ship.isThisShip(2, 0));
        assertEquals(true, ship.isThisShip(3, 0));
        assertEquals(true, ship.isThisShip(4, 0));
        assertEquals(false, ship.isThisShip(5, 0));
        assertEquals(false, ship.isThisShip(0, 1));
        assertEquals(false, ship.isThisShip(0, 2));
        assertEquals(false, ship.isThisShip(0, 3));
        assertEquals(false, ship.isThisShip(0, 4));
    }
}
