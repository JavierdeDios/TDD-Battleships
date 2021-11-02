package BattleshipGame;

public class Cell {
    private int m_value;
    private boolean m_show;

    public Cell() {
        this.m_value = 0;
        this.m_show = false;
    }

    public int getM_value() { return this.m_value; }
    public boolean getM_show() { return this.m_show; }
}
