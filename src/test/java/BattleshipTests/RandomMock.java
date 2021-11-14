package BattleshipTests;

import BattleshipGame.Model.IRandom;

public class RandomMock implements IRandom {

    private int randomX;
    private int randomY;
    private char randomOrientation;

    void setParameters(int x, int y, char orientation) {
        this.randomOrientation = orientation;
        this.randomX = x;
        this.randomY = y;
    }

    @Override
    public int getRandomX() {
        return this.randomX;
    }

    @Override
    public int getRandomY() {
        return this.randomY;
    }

    @Override
    public char getRandomOrientation() {
        return this.randomOrientation;
    }
}
