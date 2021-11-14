package BattleshipGame.Model;

public class Random implements IRandom {

    private int randomX;
    private int randomY;
    private char randomOrientation;

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

    public void generateValues() {
        java.util.Random rand = new java.util.Random();
        this.randomX = rand.nextInt(10);
        this.randomY = rand.nextInt(10);
        this.randomOrientation = rand.nextInt(101) < 51 ? 'h' : 'v';
    }

}
