package BattleshipGame;

public class Cell {
    private int m_value;
    private boolean m_show;

    public Cell() {
        this.m_value = 0;
        this.m_show = false;
    }

    public void setM_value(int m_value) { this.m_value = m_value; }
    public void setM_show(boolean m_show) { this.m_show = m_show; }

    public int getM_value() { return this.m_value; }
    public boolean getM_show() { return this.m_show; }
}
