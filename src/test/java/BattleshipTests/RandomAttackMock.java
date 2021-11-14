package BattleshipTests;

import BattleshipGame.Model.IRandomAttack;

public class RandomAttackMock implements IRandomAttack {

    private int randomAttackX;
    private int randomAttackY;

    void setAttack(int x, int y) {
        this.randomAttackX = x;
        this.randomAttackY = y;
    }

    public int getRandomAttackX() {
        return this.randomAttackX;
    }

    public int getRandomAttackY() {
        return this.randomAttackY;
    }
}
