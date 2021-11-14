package BattleshipTests;

import BattleshipGame.Model.IRandom;

public class RandomMock implements IRandom {

    private int randomX;
    private int randomY;
    private char randomOrientation;

    @Override
    public int getRandomX() {
        return 0;
    }

    @Override
    public int getRandomY() {
        return 0;
    }

    @Override
    public char getRandomOrientation() {
        return 'v';
    }
}
