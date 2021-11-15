package BattleshipGame.Controlador;

import BattleshipGame.Model.*;

import java.io.IOException;
import java.util.ArrayList;


public class BattleshipGame {

    private IRandomShip randShip;
    private IUserInputs userShip;

    public static void main(String[] args) throws InterruptedException, IOException {

        UserInputs user = new UserInputs();
        RandomShip rand = new RandomShip();

        int numShips = 0;
        int torn = 0; //comença jugant el jugador.

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
                        System.out.println(maquina.getM_arrayShip().get(0).getM_x());
                        System.out.println(maquina.getM_arrayShip().get(0).getM_y());
                        System.out.println(maquina.getM_arrayShip().get(0).getM_orientation());
                        System.out.println();
                        System.out.println();
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

        System.out.println("COMENÇA LA PARTIDA...");

        boolean acabar = false;
        while (!acabar) {
            // print tauler

            System.out.println();
            System.out.println();
            if (torn == 0) { // JUGA EL JUGADOR
                int x, y, atac, nShipsAlive = maquina.getM_NshipsAlive();
                while (true) {
                    System.out.println("Selecciona la posició X del teu atac (0 - 9): ");
                    x = user.getUserShipX();
                    System.out.println("Selecciona la posició X del teu atac (0 - 9): ");
                    y = user.getUserShipY();
                    System.out.println();

                    atac = maquina.makeAttack(x, y);
                    if (atac == -1) {
                        System.out.println("Aquesta casella ja ha sigut descoberta, prova amb un altre");
                        continue;
                    }
                    break;
                }
                System.out.print("L'atac a la posicio ("); System.out.print(x); System.out.print(", "); System.out.print(y); System.out.print(") es ... ");
                if (atac == 0) {
                    System.out.println(" AIGUA, canvi de torn.");
                    torn = 1;
                } else {
                    if (nShipsAlive > maquina.getM_NshipsAlive()) {
                        System.out.print(" TOCAT i ENFONSAT.");
                        if (maquina.getM_NshipsAlive() == 0) {
                            System.out.println();
                            System.out.println("ENHORABONA, HAS GUANYAT A LA MAQUINA!");
                            acabar = true;
                        } else {
                            System.out.println(" Segueixes jugant");
                        }
                    } else {
                        System.out.println(" TOCAT. Segueixes jugant.");
                    }
                }
            }
            else { // JUGA LA MAQUINA
                int x, y, atac, nShipsAlive = jugador.getM_NshipsAlive();
                while (true) {
                    System.out.print("La maquina ha atacat la posicio (");
                    x = rand.getRandomX(); y = rand.getRandomY();
                    System.out.print(x); System.out.print(", "); System.out.print(y); System.out.println(").");
                    System.out.println();
                    atac = jugador.makeAttack(x, y);
                    if (atac == -1) {
                        System.out.println("Aquesta casella ja ha sigut descoberta, prova amb un altre");
                        continue;
                    }
                    break;
                }
                System.out.print("L'atac a la posicio ("); System.out.print(x); System.out.print(", "); System.out.print(y); System.out.print(") es ... ");
                if (atac == 0) {
                    System.out.println(" AIGUA, canvi de torn.");
                    torn = 0;
                } else {
                    if (nShipsAlive > jugador.getM_NshipsAlive()) {
                        System.out.print(" TOCAT i ENFONSAT.");
                        if (jugador.getM_NshipsAlive() == 0) {
                            System.out.println();
                            System.out.println(" T'HA GUANYAT LA MAQUINA, NO M'HO PUC CREURE...");
                            acabar = true;
                        } else {
                            System.out.println(" Segueix jugant la maquina");
                        }
                    } else {
                        System.out.println(" TOCAT. Segueix jugant la maquina.");
                    }
                }
            }
        }
    }


    public static void mainMock(String[] args, IUserInputs user, IRandomShip rand) throws InterruptedException, IOException {

        int numShips = 0;
        int torn = 0; //comença jugant el jugador.

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
                        System.out.println(maquina.getM_arrayShip().get(0).getM_x());
                        System.out.println(maquina.getM_arrayShip().get(0).getM_y());
                        System.out.println(maquina.getM_arrayShip().get(0).getM_orientation());
                        System.out.println();
                        System.out.println();
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

        System.out.println("COMENÇA LA PARTIDA...");

        boolean acabar = false;
        while (!acabar) {
            // print tauler

            System.out.println();
            System.out.println();
            if (torn == 0) { // JUGA EL JUGADOR
                int x, y, atac, nShipsAlive = maquina.getM_NshipsAlive();
                while (true) {
                    System.out.println("Selecciona la posició X del teu atac (0 - 9): ");
                    x = user.getUserShipX();
                    System.out.println("Selecciona la posició X del teu atac (0 - 9): ");
                    y = user.getUserShipY();
                    System.out.println();

                    atac = maquina.makeAttack(x, y);
                    if (atac == -1) {
                        System.out.println("Aquesta casella ja ha sigut descoberta, prova amb un altre");
                        continue;
                    }
                    break;
                }
                System.out.print("L'atac a la posicio ("); System.out.print(x); System.out.print(", "); System.out.print(y); System.out.print(") es ... ");
                if (atac == 0) {
                    System.out.println(" AIGUA, canvi de torn.");
                    torn = 1;
                } else {
                    if (nShipsAlive > maquina.getM_NshipsAlive()) {
                        System.out.print(" TOCAT i ENFONSAT.");
                        if (maquina.getM_NshipsAlive() == 0) {
                            System.out.println();
                            System.out.println("ENHORABONA, HAS GUANYAT A LA MAQUINA!");
                            acabar = true;
                        } else {
                            System.out.println(" Segueixes jugant");
                        }
                    } else {
                        System.out.println(" TOCAT. Segueixes jugant.");
                    }
                }
            }
            else { // JUGA LA MAQUINA
                int x, y, atac, nShipsAlive = jugador.getM_NshipsAlive();
                while (true) {
                    System.out.print("La maquina ha atacat la posicio (");
                    x = rand.getRandomX(); y = rand.getRandomY();
                    System.out.print(x); System.out.print(", "); System.out.print(y); System.out.println(").");
                    System.out.println();
                    atac = jugador.makeAttack(x, y);
                    if (atac == -1) {
                        System.out.println("Aquesta casella ja ha sigut descoberta, prova amb un altre");
                        continue;
                    }
                    break;
                }
                System.out.print("L'atac a la posicio ("); System.out.print(x); System.out.print(", "); System.out.print(y); System.out.print(") es ... ");
                if (atac == 0) {
                    System.out.println(" AIGUA, canvi de torn.");
                    torn = 0;
                } else {
                    if (nShipsAlive > jugador.getM_NshipsAlive()) {
                        System.out.print(" TOCAT i ENFONSAT.");
                        if (jugador.getM_NshipsAlive() == 0) {
                            System.out.println();
                            System.out.println(" T'HA GUANYAT LA MAQUINA, NO M'HO PUC CREURE...");
                            acabar = true;
                        } else {
                            System.out.println(" Segueix jugant la maquina");
                        }
                    } else {
                        System.out.println(" TOCAT. Segueix jugant la maquina.");
                    }
                }
            }
        }
    }

}
