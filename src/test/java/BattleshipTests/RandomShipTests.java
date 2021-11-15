package BattleshipTests;

import BattleshipGame.Model.RandomShip;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Queue;

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
}
