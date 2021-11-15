package BattleshipGame.Controlador;

public class Gameboard {
    private Cell[][] board; //matriu d'elements cell que formen el tauler de joc

    public Gameboard() { //constructor per defecte
        this.board = new Cell[10][10];
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                this.board[i][j] = new Cell();
            }
        }
    }

    public void setCellValue(int x, int y, int value) { this.board[x][y].setM_value(value); } //setter valor value d'un element cell del tauler
    public void showCell(int x, int y) { this.board[x][y].setM_show(true); } //setter valor show d'un element cell del tauler

    public int getCellValue(int x, int y) { return this.board[x][y].getM_value(); } //getter valor value d'un element cell del tauler
    public boolean getCellShow(int x, int y) { return this.board[x][y].getM_show(); } //getter valor show d'un element cell del tauler

    public boolean placeShip(int x, int y, int orientation, int length) { //funcio per col.locar un vaixell amb orientacio 'orientation' i longuitud 'length', en la posicio x, y
        if (orientation == 'h' && y + length <= 10 && x >= 0 && y >= 0) {
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

        if (orientation == 'v' && x + length <= 10 && x >= 0 && y >= 0) {
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

    public int attackPoint(int x, int y) { //funcio que realitza un atac a la posicio x,y
        if (this.getCellShow(x, y)) {
            return -1;
        } else {
            this.showCell(x, y);
            return this.getCellValue(x, y);
        }
    }

    public boolean isSunk(int x, int y, char orientation, int length) { //comprova si el vaixel amb orientacio 'orientation' i longuitud 'length', en la posicio x, y, esta enfonsat o no
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
