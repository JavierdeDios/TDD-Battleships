package BattleshipTests;

import BattleshipGame.Gameboard;
import BattleshipGame.Player;
import BattleshipGame.Ship;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTests {
    Player player;

    @BeforeEach
    void setUpPlayer() {
        player = new Player();
    }

    @Test
    void setPlayerTest() {
        assertEquals(0, player.getM_NshipsAlive());
    }

    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePlaceShip")
    void addShipTest(int x, int y, char orientation, int length, boolean result) {
        int intRes = result ? 1 : 0;
        assertEquals(result, player.addShip(x, y, orientation, length));
        assertEquals(intRes, player.getM_NshipsAlive());
        if (result) {
            Ship[] ships = player.getM_arrayShip();
            assertEquals(x, ships[0].getM_x());
            assertEquals(y, ships[0].getM_y());
            assertEquals(orientation, ships[0].getM_orientation());
            assertEquals(length, ships[0].getM_length());
        } else {
            Ship[] ships = player.getM_arrayShip();
            assertEquals(null, ships[0]);
        }
    }

}
