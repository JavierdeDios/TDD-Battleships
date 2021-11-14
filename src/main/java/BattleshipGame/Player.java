package BattleshipGame;

import BattleshipGame.Gameboard;
import BattleshipGame.Ship;
import java.util.*;

public class Player {
    private Gameboard m_board;
    private int m_NshipsAlive;
    private ArrayList<Ship> m_arrayShips;

    public Player() {
        this.m_board = new Gameboard();
        this.m_NshipsAlive = 0;
        this.m_arrayShips = new ArrayList<Ship>();
    }

    public int getM_NshipsAlive() { return this.m_NshipsAlive; }
    public ArrayList<Ship> getM_arrayShip() { return this.m_arrayShips; }

    public void addNshipsAlive() { this.m_NshipsAlive++; }
    public void decNshipsAlive() { this.m_NshipsAlive--; }

    public void addShipArray(Ship ship) { this.m_arrayShips.add(ship); }

    public boolean addShip(int x, int y, char orientation, int length) {
        if (m_board.placeShip(x, y, orientation, length)) {
            Ship ship = new Ship(x, y, orientation, length);
            this.addShipArray(ship);
            this.addNshipsAlive();
            return true;
        }
        return false;
    }

    public int makeAttack(int x, int y) {
        /*if (this.m_board.attackPoint(x, y) == 1) {

        }
        return this.m_board.attackPoint(x, y);*/
        return 0;
    }

}
