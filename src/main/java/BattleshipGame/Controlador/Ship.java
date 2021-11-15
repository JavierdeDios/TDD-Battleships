package BattleshipGame.Controlador;

public class Ship {
    private int m_x; //coordenada x de la punta del vaixell
    private int m_y; //coordenada y de la punta del vaixell
    private char m_orientation; //orientacio del vaixell. h: horitzontal, v: vertical
    private int m_length; //longuitd del vaixell
    private boolean m_sunk; //marca si el vaixell esta enfonsat

    public Ship() { //constructor per defecte
        this.m_x = -1;
        this.m_y = -1;
        this.m_orientation = ' ';
        this.m_length = 0;
        this.m_sunk = false;
    }

    public Ship(int x, int y, char orientation, int length) { //constructor per parametres
        this.m_x = x;
        this.m_y = y;
        this.m_orientation = orientation;
        this.m_length = length;
        this.m_sunk = false;
    }

    public void setM_x(int m_x) { this.m_x = m_x; } //setter variable x
    public void setM_y(int m_y) { this.m_y = m_y; } //setter variable y
    public void setM_orientation(char m_orientation) { this.m_orientation = m_orientation; } //setter variable orientation
    public void setM_length(int m_length) { this.m_length = m_length; } //setter variable length
    public void setM_sunk() { this.m_sunk = true; } //setter variable sunk

    public int getM_x() { return m_x; } //getter variable x
    public int getM_y() { return m_y; } //getter variable y
    public char getM_orientation() { return m_orientation; } //getter variable orientation
    public int getM_length() { return m_length; } //getter variable length
    public boolean getM_sunk() { return this.m_sunk; } //getter variable sunk

    public boolean isThisShip(int x, int y) { //funcio que comprova si donades unes coordenades x i y es tracta d'aquest vaixell
        if (this.m_orientation == 'h') {
            return ((this.m_x == x) && (y >= this.m_y) && (y < (this.m_y + this.m_length)));
        } else {
            return ((this.m_y == y) && (x >= this.m_x) && (x < (this.m_x + this.m_length)));
        }
    }
}
