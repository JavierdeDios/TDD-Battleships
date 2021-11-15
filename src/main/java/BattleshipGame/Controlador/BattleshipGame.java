package BattleshipGame.Controlador;

import BattleshipGame.Model.*;

import java.io.IOException;


public class BattleshipGame {

    private IRandomShip randShip;
    private IRandomAttack randAttack;
    private IUserInputs userShip;



    public static void main(String[] args) throws InterruptedException, IOException {

        UserInputs user = new UserInputs();
        RandomShip rand = new RandomShip();
        int numShips = 0;

        Player jugador = new Player();
        Player maquina = new Player();

        System.out.println("###################################################################");
        System.out.println("###								                                ###");
        System.out.println("###     BENVINGUTS AL JOC  D'ENFONSAR VAIXELLS FINS GUANYAR     ###");
        System.out.println("###								                                ###");
        System.out.println("###################################################################");
        System.out.println();
        System.out.println("Aquest joc es el tipic 'hundir la flota', per jugar has de seguir els seguents passos: ");
        System.out.println("    1.  Escollir el numero de vaixells per jugar (1 - 9)");
        System.out.println("    2.  Posicionar els vaixells un a un");
        System.out.println("    3.  Començar a atacar l'armada del contrincant");
        System.out.println("    4.  Guanyar");
        System.out.println();
        System.out.println("Vinga a jugar: ");
        System.out.println();
        System.out.println("Escull el numero de vaixells (1-9): ");
        numShips = user.getNumberOfShips();
        System.out.print("Has escollit jugar amb "); System.out.print(numShips); System.out.println(" vaixells.");
        System.out.println();
        System.out.println("Ara toca escollir la longitud de cada vaixell que vols colocar");
        int i = 1;
        while (i <= numShips) {
            int longitud, x, y;
            char orientation;
            System.out.print("Quina longitud (2-5) vols que tingui el vaixell numero "); System.out.print(i); System.out.println("?");
            longitud = user.getUserShipLength();
            System.out.print("El vaixell numero "); System.out.print(i); System.out.print(" tindra una longitud de "); System.out.println(longitud);
            System.out.println("On el voldras colocar? Selecciona el seu eix X (0 - 9)");
            x = user.getUserShipX();
            System.out.println("Quin sera el seu eix Y (0 - 9)?");
            y = user.getUserShipY();
            System.out.println("Finalment quina sera la seva orientacio (h / v)?");
            orientation = user.getUserShipOrientation();
            if (jugador.addShip(x, y, orientation, longitud)) {
                System.out.println("S'ha colocat el vaixell.");
                System.out.println();
                while (true) {
                    if(maquina.addShip(rand.getRandomX(), rand.getRandomY(), rand.getRandomOrientation(), longitud)) {
                        System.out.println("S'ha colocat el vaixell de l'enemic.");
                        break;
                    }
                }
                i++;
            } else {
                System.out.println("Sembla que has colocat el vaixell en una posicio incorrecte, torna-ho a intentar.");
                System.out.println();
                System.out.println();
            }
        }




    }

}
