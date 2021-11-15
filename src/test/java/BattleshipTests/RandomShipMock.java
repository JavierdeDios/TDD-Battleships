package BattleshipTests;

import BattleshipGame.Model.IRandomShip;

import java.util.Queue;

public class RandomShipMock implements IRandomShip {

    private int randomX;
    private int randomY;
    private char randomOrientation;
    private Queue<Integer> positionsXQueue;
    private Queue<Integer> positionsYQueue;
    private Queue<Character> orientationsQueue;

    void setParameters(int x, int y, char orientation) {

        this.randomOrientation = orientation;
        this.randomX = x;
        this.randomY = y;
    }

    void setParametersQueue() {
        this.randomOrientation = this.orientationsQueue.poll();
        this.randomX = this.positionsXQueue.poll();
        this.randomY = this.positionsYQueue.poll();
    }

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
        return this.randomX;
    }

    @Override
    public int getRandomY() {
        return this.randomY;
    }

    @Override
    public char getRandomOrientation() { return this.randomOrientation; }
}
