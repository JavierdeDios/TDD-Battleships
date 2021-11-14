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

    public void addNshipsAlive() { this.m_NshipsAlive++; }
    public void decNshipsAlive() { this.m_NshipsAlive--; }

    public void addShipArray(int i, Ship ship) { this.m_arrayShip[i] = ship; }

    public boolean addShip(int x, int y, char orientation, int length) {
        if (m_board.placeShip(x, y, orientation, length)) {
            Ship ship = new Ship(x, y, orientation, length);
            this.addShipArray(this.getM_NshipsAlive(), ship);
            this.addNshipsAlive();
            return true;
        }
        return false;
    }
}
