package BattleshipGame;
import BattleshipGame.Cell;

public class Gameboard {
    private Cell[][] board;

    public Gameboard() {
        this.board = new Cell[10][10];
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                this.board[i][j] = new Cell();
            }
        }
    }

    public void setCellValue(int x, int y, int value) { this.board[x][y].setM_value(value); }
    public void showCell(int x, int y) { this.board[x][y].setM_show(true); }

    public int getCellValue(int x, int y) { return this.board[x][y].getM_value(); }
    public boolean getCellShow(int x, int y) { return this.board[x][y].getM_show(); }

    public boolean placeShip(int x, int y, int orientation, int length) {
        if (orientation == 'h') {
            if (x + length <= 10) {
                return true;
            }
        }
        if (orientation == 'v') {
            if (y + length <= 10) {
                return true;
            }
        }
        return false;
    }

}
