package BattleshipGame.Model;

public class RandomShip implements IRandomShip {


    @Override
    public int getRandomX() {
        java.util.Random rand = new java.util.Random();
        return rand.nextInt(10);
    }

    @Override
    public int getRandomY() {

        java.util.Random rand = new java.util.Random();
        return rand.nextInt(10);
    }

    @Override
    public char getRandomOrientation() {
        java.util.Random rand = new java.util.Random();
        int numero = rand.nextInt(101);
        if (numero % 2 == 0) {
            return "hv".charAt(0);
        }
        return "hv".charAt(1);
    }

}
