package BattleshipGame.Model;

public class Random implements IRandom {

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
