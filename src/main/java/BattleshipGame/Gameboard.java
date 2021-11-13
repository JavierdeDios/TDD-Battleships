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
        if (orientation == 'h' && y + length <= 10) {
            for(int i = y; i < y + length; i++) {
                if (this.getCellValue(x, i) != 0) {
                    return false;
                }
            }
            for(int i = y; i < y + length; i++) {
                this.setCellValue(x, i, 1);
            }
            return true;
        }

        if (orientation == 'v' && x + length <= 10) {
            for(int i = x; i < x + length; i++) {
                if (this.getCellValue(i, y) != 0) {
                    return false;
                }

            }
            for(int i = x; i < x + length; i++) {
                this.setCellValue(i, y, 1);
            }
            return true;
        }
        return false;
    }

    public int attackPoint(int x, int y) {
        if (this.getCellShow(x, y)) {
            return -1;
        } else {
            this.showCell(x, y);
            return this.getCellValue(x, y);
        }
    }

    public boolean isSunk(int x, int y, char orientation, int length) {
        if (orientation == 'h') {
            for(int i = y; i < y + length; i++) {
                if (!this.getCellShow(x, i)) {
                    return false;
                }
            }
            for(int i = y; i < y + length; i++) {
                this.setCellValue(x, i, 2);
            }
        } else {
            for(int i = x; i < x + length; i++) {
                if (!this.getCellShow(i, y)) {
                    return false;
                }
            }
            for(int i = x; i < x + length; i++) {
                this.setCellValue(i, y, 2);
            }
        }
        return true;
    }

}
