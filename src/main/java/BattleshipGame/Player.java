package BattleshipGame;

import BattleshipGame.Gameboard;
import BattleshipGame.Ship;

public class Player {
    private Gameboard m_board;
    private int m_NshipsAlive;
    private Ship m_arrayShip[];

    public Player() {
        this.m_board = new Gameboard();
        this.m_NshipsAlive = 0;
        this.m_arrayShip = new Ship[5];
    }

    public int getM_NshipsAlive() { return this.m_NshipsAlive; }
    public Ship[] getM_arrayShip() { return this.m_arrayShip; }

    public boolean addShip(int x, int y, char orientation, int length) {
        return false;
    }
}
