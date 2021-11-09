package BattleshipTests;

import BattleshipGame.Ship;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
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
    }

    @Test
    void SetterGetterXTest() {
        ship.setM_x(5);
        assertEquals(5, ship.getM_x());
    }

    @Test
    void SetterGetterYTest() {
        ship.setM_y(2);
        assertEquals(2, ship.getM_y());
    }

    @Test
    void SetterGetterOrientationTest() {
        ship.setM_orientation('h'); //Horizontal
        assertEquals('h', ship.getM_orientation());

        ship.setM_orientation('v'); // Vertical
        assertEquals('v', ship.getM_orientation());
    }

    @Test
    void SetterGetterLengthTest() {
        ship.setM_length(5);
        assertEquals(5, ship.getM_length());
    }

    @Test
    void initializeShipTest() {
        ship = new Ship(5, 4, 'h', 3);

        assertEquals(5, ship.getM_x());
        assertEquals(4, ship.getM_y());
        assertEquals('h', ship.getM_orientation());
        assertEquals(3, ship.getM_length());
    }
}
