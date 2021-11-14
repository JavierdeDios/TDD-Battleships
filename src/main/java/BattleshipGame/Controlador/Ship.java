package BattleshipGame.Controlador;

public class Ship {
    private int m_x;
    private int m_y;
    private char m_orientation;
    private int m_length;
    private boolean m_sunk;

    public Ship() {
        this.m_x = -1;
        this.m_y = -1;
        this.m_orientation = ' ';
        this.m_length = 0;
        this.m_sunk = false;
    }

    public Ship(int x, int y, char orientation, int length) {
        this.m_x = x;
        this.m_y = y;
        this.m_orientation = orientation;
        this.m_length = length;
        this.m_sunk = false;
    }

    public void setM_x(int m_x) { this.m_x = m_x; }
    public void setM_y(int m_y) { this.m_y = m_y; }
    public void setM_orientation(char m_orientation) { this.m_orientation = m_orientation; }
    public void setM_length(int m_length) { this.m_length = m_length; }
    public void setM_sunk() { this.m_sunk = true; }

    public int getM_x() { return m_x; }
    public int getM_y() { return m_y; }
    public char getM_orientation() { return m_orientation; }
    public int getM_length() { return m_length; }
    public boolean getM_sunk() { return this.m_sunk; }

    public boolean isThisShip(int x, int y) {
        if (this.m_orientation == 'h') {
            return ((this.m_x == x) && (y >= this.m_y) && (y < (this.m_y + this.m_length)));
        } else {
            return ((this.m_y == y) && (x >= this.m_x) && (x < (this.m_x + this.m_length)));
        }
    }
}
