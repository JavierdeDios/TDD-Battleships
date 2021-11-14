package BattleshipGame.Model;

import java.util.Random;

public class RandomAttack implements IRandomAttack {

    private int randomAttackX;
    private int randomAttackY;

    public int getRandomAttackX() {
        return this.randomAttackX;
    }

    public int getRandomAttackY() {
        return this.randomAttackY;
    }

    public void generateRandomAttack() {
        Random rand = new Random();
        this.randomAttackX = rand.nextInt(10);
        this.randomAttackY = rand.nextInt(10);
    }
}
