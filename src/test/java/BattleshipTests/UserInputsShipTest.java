package BattleshipTests;

import BattleshipGame.Model.UserInputsShip;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserInputsShipTest {

    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourceMockPositions")
    void getMockXYOrientationTest(int x, int y, char orientation) {
        UserInputsShipMock rand = new UserInputsShipMock();
        rand.setParameters(x, y, orientation);
        assertEquals(x, rand.getUserShipX());
        assertEquals(y, rand.getUserShipY());
        assertEquals(orientation, rand.getUserShipOrientation());
    }

    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePositionXYUser")
    void getParameterXKeyboardTest(String s, boolean resultat) {
        UserInputsShip ship = new UserInputsShip();
        InputStream in = new ByteArrayInputStream(s.getBytes());
        assertEquals(resultat, ship.getParameterXKeyboard(in));
        if (resultat) {
            assertEquals(Character.getNumericValue(s.charAt(0)), ship.getUserShipX());
        }
    }

    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourcePositionXYUser")
    void getParameterYKeyboardTest(String s, boolean resultat) {
        UserInputsShip ship = new UserInputsShip();
        InputStream in = new ByteArrayInputStream(s.getBytes());
        assertEquals(resultat, ship.getParameterYKeyboard(in));
        if (resultat) {
            assertEquals(Character.getNumericValue(s.charAt(0)), ship.getUserShipY());
        }
    }

    @ParameterizedTest
    @MethodSource(value = "BattleshipTests.ParamProvider#sourceOrientationUser")
    void getParameterOrientationKeyboardTest(String s, boolean resultat) {
        UserInputsShip ship = new UserInputsShip();
        InputStream in = new ByteArrayInputStream(s.getBytes());
        assertEquals(resultat, ship.getParameterOrientationKeyboard(in));
        if (resultat) {
            assertEquals(s.charAt(0), ship.getUserShipOrientation());
        }
    }

}
