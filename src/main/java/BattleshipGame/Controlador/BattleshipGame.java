package BattleshipGame.Controlador;

import BattleshipGame.Model.IRandomAttack;
import BattleshipGame.Model.IRandomShip;
import BattleshipGame.Model.IUserInputs;
import BattleshipGame.Model.UserInputs;

import java.io.IOException;


public class BattleshipGame {

    private IRandomShip randShip;
    private IRandomAttack randAttack;
    private IUserInputs userShip;



    public static void main(String[] args) throws InterruptedException, IOException {

        UserInputs user = new UserInputs();
        int numShips = 0;
        System.out.println("Escull el numero de vaixells (1-9): ");
        numShips = user.getNumberOfShips();
        System.out.print("Has escollit jugar amb ");
        System.out.print(numShips);
        System.out.println(" vaixells.");



    }

}
