package BattleshipTests;

import BattleshipGame.Model.RandomShip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomShipTests {

    @Test
    void getRandomXYOrientationTest() {
        RandomShip rand = new RandomShip();
        for(int i = 0; i < 25; i++) {
            assertEquals(true, (rand.getRandomX() < 10 && rand.getRandomX() >= 0));
            assertEquals(true, (rand.getRandomY() < 10 && rand.getRandomY() >= 0));
            char k = rand.getRandomOrientation();
            assertEquals(true, k == 'h' || k == 'v');
        }

    }
    /*
    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourceMockPositions")
    void getMockXYOrientationTest(int x, int y, char orientation) {
        RandomShipMock rand = new RandomShipMock();
        rand.setParameters(x, y, orientation);
        assertEquals(x, rand.getRandomX());
        assertEquals(y, rand.getRandomY());
        assertEquals(orientation, rand.getRandomOrientation());
    }*/
}
