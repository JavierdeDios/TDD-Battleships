package BattleshipTests;

import BattleshipGame.Model.UserInputs;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BattleshipGameTest {

    @ParameterizedTest
    @ValueSource(strings = {"-1", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"})
    void numberOfShipsUserTest(String s) {
        UserInputs ship = new UserInputs();
        InputStream is = new ByteArrayInputStream(s.getBytes());

    }

}
