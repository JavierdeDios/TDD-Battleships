package BattleshipTests;

import BattleshipGame.Model.RandomAttack;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomAttackTest {
    @Test
    void getRandomXYOrientationTest() {
        RandomAttack rand = new RandomAttack();
        for(int i = 0; i < 50; i++) {
            rand.generateRandomAttack();
            assertEquals(true, (rand.getRandomAttackX() < 10 && rand.getRandomAttackX() >= 0));
            assertEquals(true, (rand.getRandomAttackY() < 10 && rand.getRandomAttackY() >= 0));
        }

    }

    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourceMockPositions")
    void getMockXYOrientationTest(int x, int y, char orientation) {
        RandomAttackMock rand = new RandomAttackMock();
        rand.setAttack(x, y);
        assertEquals(x, rand.getRandomAttackX());
        assertEquals(y, rand.getRandomAttackY());
    }
}
