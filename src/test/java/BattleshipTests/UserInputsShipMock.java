package BattleshipTests;

import BattleshipGame.Model.IUserInputsShip;

public class UserInputsShipMock implements IUserInputsShip {

    int userShipX;
    int userShipY;
    char userShipOrientation;

    void setParameters(int x, int y, char orientation) {
        this.userShipOrientation = orientation;
        this.userShipX = x;
        this.userShipY = y;
    }

    public int getUserShipX() {
        return this.userShipX;
    }

    public int getUserShipY() {
        return this.userShipY;
    }

    public char getUserShipOrientation() {
        return this.userShipOrientation;
    }

}
