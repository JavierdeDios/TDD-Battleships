package BattleshipGame.Controlador;

import java.util.*;

public class Player {
    private Gameboard m_board; //tauler del jugador
    private int m_NshipsAlive; //nombre de vaixells vius dels que disposa el jugador
    private ArrayList<Ship> m_arrayShips; // llistat de vaixells disponibles del jugador

    public Player() { // constructor per defecte
        this.m_board = new Gameboard();
        this.m_NshipsAlive = 0;
        this.m_arrayShips = new ArrayList<Ship>();
    }

    public int getM_NshipsAlive() { return this.m_NshipsAlive; } //getter nombre de vaixells vius
    public ArrayList<Ship> getM_arrayShip() { return this.m_arrayShips; } //getter llistat de vaixells vius

    public void addNshipsAlive() { this.m_NshipsAlive++; } //incrementa nombre de vaixells vius
    public void decNshipsAlive() { this.m_NshipsAlive--; } //decrementa nombre de vaixells vius

    public void addShipArray(Ship ship) { this.m_arrayShips.add(ship); } //afegeix el vaixell Ship a la llista de vaixells

    public boolean addShip(int x, int y, char orientation, int length) {
        if (m_board.placeShip(x, y, orientation, length)) {
            Ship ship = new Ship(x, y, orientation, length);
            this.addShipArray(ship);
            this.addNshipsAlive();
            return true;
        }
        return false;
    }

    public int findShip(int x, int y) {
        ArrayList<Ship> ships = this.getM_arrayShip();
        for(int i = 0; i < this.getM_NshipsAlive(); i++) {
            if (ships.get(i).isThisShip(x, y)) {
                return i;
            }
        }
        return -1;
    }

    public int makeAttack(int x, int y) {
        int resultat = this.m_board.attackPoint(x, y);
        if (resultat == 1) {
            int shipHit = this.findShip(x, y);
            Ship ship = this.getM_arrayShip().get(shipHit);
            if(this.m_board.isSunk(ship.getM_x(), ship.getM_y(), ship.getM_orientation(), ship.getM_length())) {
                ship.setM_sunk();
                this.m_arrayShips.set(shipHit, ship);
                this.decNshipsAlive();
            }
        }
        return resultat;
    }

    public boolean hasLost() {
        if (!this.getM_arrayShip().isEmpty() && this.getM_NshipsAlive() == 0) {
            return true;
        }
        return false;
    }
}
