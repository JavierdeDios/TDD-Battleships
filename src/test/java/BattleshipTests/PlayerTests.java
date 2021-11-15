package BattleshipTests;

import BattleshipGame.Controlador.Player;
import BattleshipGame.Controlador.Ship;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTests {
    Player player;

    @BeforeEach
    //set up player
    void setUpPlayer() {
        player = new Player();
    }

    @Test
    //test caixa negra constructor de classe
    void setPlayerTest() {
        assertEquals(0, player.getM_NshipsAlive());
    }

    @ParameterizedTest
    //test caixa negra amb particio equivalent i valors frontera. Comprova que s'afegeixen correctament vaixells al llistat del vaixells del jugador
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePlaceShip")
    void addShipTest(int x, int y, char orientation, int length, boolean result) {
        int intRes = result ? 1 : 0;
        assertEquals(result, player.addShip(x, y, orientation, length));
        assertEquals(intRes, player.getM_NshipsAlive());
        if (result) {
            ArrayList<Ship> ships = player.getM_arrayShip();
            assertEquals(x, ships.get(0).getM_x());
            assertEquals(y, ships.get(0).getM_y());
            assertEquals(orientation, ships.get(0).getM_orientation());
            assertEquals(length, ships.get(0).getM_length());
        } else {
            ArrayList<Ship> ships = player.getM_arrayShip();
            assertEquals(true, ships.isEmpty());
        }
    }

    @Test
    //test caixa negra i caixa blanca amb particio equivalent, valors frontera i loop testing. Comprova que un vaixell donat, existeix
    void findShipTest() {
        assertEquals(true, player.addShip(0, 0, 'h', 5)); //0
        assertEquals(true, player.addShip(1, 0, 'h', 5)); //1
        assertEquals(true, player.addShip(2, 0, 'v', 5)); //2
        assertEquals(true, player.addShip(2, 1, 'h', 5)); //3
        assertEquals(true, player.addShip(3, 2, 'v', 5)); //4

        assertEquals(0, player.findShip(0, 0));
        assertEquals(0, player.findShip(0, 1));
        assertEquals(0, player.findShip(0, 2));
        assertEquals(0, player.findShip(0, 3));
        assertEquals(0, player.findShip(0, 4));
        assertEquals(-1, player.findShip(0, 5));

        assertEquals(1, player.findShip(1, 0));
        assertEquals(1, player.findShip(1, 1));
        assertEquals(1, player.findShip(1, 2));
        assertEquals(1, player.findShip(1, 3));
        assertEquals(1, player.findShip(1, 4));
        assertEquals(-1, player.findShip(1, 5));

        assertEquals(2, player.findShip(2, 0));
        assertEquals(2, player.findShip(3, 0));
        assertEquals(2, player.findShip(4, 0));
        assertEquals(2, player.findShip(5, 0));
        assertEquals(2, player.findShip(6, 0));
        assertEquals(-1, player.findShip(7, 0));

        assertEquals(3, player.findShip(2, 1));
        assertEquals(3, player.findShip(2, 2));
        assertEquals(3, player.findShip(2, 3));
        assertEquals(3, player.findShip(2, 4));
        assertEquals(3, player.findShip(2, 5));
        assertEquals(-1, player.findShip(2, 6));

        assertEquals(4, player.findShip(3, 2));
        assertEquals(4, player.findShip(4, 2));
        assertEquals(4, player.findShip(5, 2));
        assertEquals(4, player.findShip(6, 2));
        assertEquals(4, player.findShip(7, 2));
        assertEquals(-1, player.findShip(8, 2));
    }

    @Test
    //Test caixa negra amb particio equivalent i valors frontera. Comprova si un atac es exitos o no
    void makeAttackTest() {
        player.addShip(0, 0, 'h', 5);
        assertEquals(1, player.makeAttack(0, 0)); //Tocat
        assertEquals(1, player.getM_NshipsAlive());
        assertEquals(1, player.makeAttack(0, 1));
        assertEquals(1, player.getM_NshipsAlive());
        assertEquals(1, player.makeAttack(0, 2));
        assertEquals(1, player.getM_NshipsAlive());
        assertEquals(1, player.makeAttack(0, 3));
        assertEquals(1, player.getM_NshipsAlive());
        assertEquals(1, player.makeAttack(0, 4));
        assertEquals(0, player.getM_NshipsAlive());

        assertEquals(0, player.makeAttack(0, 5)); //Aigua
        assertEquals(-1, player.makeAttack(0, 5)); //Ja atacat

        assertEquals(-1, player.makeAttack(0, 0));
        assertEquals(0, player.makeAttack(1, 0));
        assertEquals(0, player.makeAttack(1, 1));
        assertEquals(0, player.makeAttack(1, 2));
        assertEquals(0, player.makeAttack(1, 3));
        assertEquals(0, player.makeAttack(1, 4));
        assertEquals(0, player.makeAttack(1, 5));
    }

    @Test
    //test caixa negra amb particio equivalent i valors frontera. Comprova si el jugador te vaixells vius o no i per tant si ha perdut o no
    void hasLostTest() {
        assertEquals(false, player.hasLost());
        player.addShip(0, 0, 'h', 3);
        assertEquals(false, player.hasLost());
        player.makeAttack(0,0);
        assertEquals(false, player.hasLost());
        player.makeAttack(0,1);
        assertEquals(false, player.hasLost());
        player.makeAttack(0,2);
        assertEquals(true, player.hasLost());
    }
}
