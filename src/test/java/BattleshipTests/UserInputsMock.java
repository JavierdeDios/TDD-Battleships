package BattleshipTests;

import BattleshipGame.Model.IUserInputs;

import java.util.Queue;

public class UserInputsMock implements IUserInputs {

    int userShipX;
    int userShipY;
    char userShipOrientation;
    int userNumberOfShips;

    Queue<Integer> userShipXQueue;
    Queue<Integer> userShipYQueue;
    Queue<Character> userShipOrientationQueue;
    Queue<Integer> userNumberOfShipsQueue;

    void setParameters(int x, int y, char orientation) {
        this.userShipOrientation = orientation;
        this.userShipX = x;
        this.userShipY = y;
    }

    void setNumberOfShipsQueue(Queue<Integer> q) {
        this.userNumberOfShipsQueue = q;
    }
    void setuserShipXQueue(Queue<Integer> q) { this.userShipXQueue = q; }
    void setuserShipYQueue(Queue<Integer> q) { this.userShipYQueue = q; }
    void setuserShipOrientationQueue(Queue<Character> q) { this.userShipOrientationQueue = q; }

    @Override
    public int getUserShipX() {
        while (true) {
            int i = userShipXQueue.poll();
            if (i >= 0 && i < 10) {
                return i;
            } else {
                if (i < 0) {
                    System.out.println("Numero introduit menor a 0. Torna-ho a intentar.");
                } else {
                    System.out.println("Numero introduit mes gran que 9. Torna-ho a intentar.");
                }
            }
        }
    }

    @Override
    public int getUserShipY() {
        while (true) {
            int i = userShipYQueue.poll();
            if (i >= 0 && i < 10) {
                return i;
            } else {
                if (i < 0) {
                    System.out.println("Numero introduit menor a 0. Torna-ho a intentar.");
                } else {
                    System.out.println("Numero introduit mes gran que 9. Torna-ho a intentar.");
                }
            }
        }
    }

    @Override
    public char getUserShipOrientation() {
        while (true) {
            char i = userShipOrientationQueue.poll();
            if (i == 'h' || i == 'v') {
                return i;
            } else {
                System.out.println("Orientació no valida, ha de ser h o v. Torna-ho a intentar");
            }
        }
    }

    @Override
    public int getNumberOfShips() {
        while (true) {
            int i = userNumberOfShipsQueue.poll();
            if (i >= 1 && i < 10) {
                return i;
            } else {
                if (i < 1) {
                    System.out.println("Numero introduit menor a 1. Torna-ho a intentar.");
                } else {
                    System.out.println("Numero introduit mes gran que 9. Torna-ho a intentar.");
                }
            }
        }
    };

}
