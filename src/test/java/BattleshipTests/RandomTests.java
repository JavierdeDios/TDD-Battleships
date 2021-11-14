package BattleshipTests;

import BattleshipGame.Model.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomTests {

    @Test
    void getRandomXYOrientationTest() {
        Random rand = new Random();
        for(int i = 0; i < 25; i++) {
            rand.generateValues();
            assertEquals(true, (rand.getRandomX() < 10 && rand.getRandomX() >= 0));
            assertEquals(true, (rand.getRandomY() < 10 && rand.getRandomY() >= 0));
            assertEquals(true, (rand.getRandomOrientation() == 'h' || rand.getRandomOrientation() == 'v'));
        }

    }

    /*@Test
    void getMockXYOrientationTest() {

    }*/
}
