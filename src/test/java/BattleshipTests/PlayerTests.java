package BattleshipTests;

import BattleshipGame.Gameboard;
import BattleshipGame.Player;
import BattleshipGame.Ship;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
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

}
