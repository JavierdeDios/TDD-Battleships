package BattleshipTests;

import BattleshipGame.Model.IRandomShip;

import java.util.Queue;

public class RandomShipMock implements IRandomShip {

    private Queue<Integer> positionsXQueue;
    private Queue<Integer> positionsYQueue;
    private Queue<Character> orientationsQueue;


    public void setPositionsXQueue(Queue<Integer> q) {
        this.positionsXQueue = q;
    }

    public void setPositionsYQueue(Queue<Integer> q) {
        this.positionsYQueue = q;
    }

    public void setOrientationsQueue(Queue<Character> q) {
        this.orientationsQueue = q;
    }

    @Override
    public int getRandomX() {
        while (true) {
            int val = this.positionsXQueue.poll();
            if (val < 10 && val >= 0) {
                return val;
            }
        }
    }

    @Override
    public int getRandomY() {
        while (true) {
            int val = this.positionsYQueue.poll();
            if (val < 10 && val >= 0) {
                return val;
            }
        }
    }

    @Override
    public char getRandomOrientation() {
        while (true) {
            char val = this.orientationsQueue.poll();
            if (val == 'h' || val == 'v') {
                return val;
            }
        }
    }
}
