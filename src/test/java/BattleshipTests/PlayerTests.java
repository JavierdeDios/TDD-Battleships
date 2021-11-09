package BattleshipTests;

import BattleshipGame.Cell;
import BattleshipGame.Player;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTests {
    Player player;

    @BeforeEach
    void setUpPlayer() {
        player = new Player();
    }

}
