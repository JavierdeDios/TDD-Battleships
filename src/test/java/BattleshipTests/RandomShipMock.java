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
        return this.positionsXQueue.poll();
    }

    @Override
    public int getRandomY() {
        return this.positionsYQueue.poll();
    }

    @Override
    public char getRandomOrientation() { return this.orientationsQueue.poll(); }
}
