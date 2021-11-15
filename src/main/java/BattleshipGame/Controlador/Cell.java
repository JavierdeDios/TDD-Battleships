package BattleshipGame.Controlador;

public class Cell {
    private int m_value; // indica l'estat de la cell. 0:aigua, 1:tocat, 2:enfonsat
    private boolean m_show; //indica si l'estat de la cell es mostra o no

    public Cell() { //constructor per defecte
        this.m_value = 0;
        this.m_show = false;
    }

    public void setM_value(int m_value) { this.m_value = m_value; } //setter variable value
    public void setM_show(boolean m_show) { this.m_show = m_show; } //setter variable show

    public int getM_value() { return this.m_value; } //getter variable value
    public boolean getM_show() { return this.m_show; } //getter variable show
}
