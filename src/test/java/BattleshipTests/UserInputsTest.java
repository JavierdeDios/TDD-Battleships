package BattleshipTests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserInputsTest {

    UserInputsMock user;

    @BeforeEach
    void setUpUser() {
        user = new UserInputsMock();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    void selectNumberOfShipsTest(int i) {
        Queue<Integer> q = new LinkedList<>();
        user.setNumberOfShipsQueue(q);
        q.add(-1); q.add(-2); q.add(-3); q.add(0); q.add(i);
        assertEquals(i, user.getNumberOfShips());
        q.add(10); q.add(11); q.add(i);
        assertEquals(i, user.getNumberOfShips());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    void getUserShipXTest(int i) {
        Queue<Integer> q = new LinkedList<>();
        user.setuserShipXQueue(q);
        q.add(-1); q.add(-2); q.add(-3); q.add(i);
        assertEquals(i, user.getUserShipX());
        q.add(10); q.add(11); q.add(i);
        assertEquals(i, user.getUserShipX());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    void getUserShipYTest(int i) {
        Queue<Integer> q = new LinkedList<>();
        user.setuserShipYQueue(q);
        q.add(-1); q.add(-2); q.add(-3); q.add(i);
        assertEquals(i, user.getUserShipY());
        q.add(10); q.add(11); q.add(i);
        assertEquals(i, user.getUserShipY());
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5})
    void getUserShipLengthTest(int i) {
        Queue<Integer> q = new LinkedList<>();
        user.setuserLengthQueue(q);
        q.add(-1); q.add(0); q.add(1); q.add(i);
        assertEquals(i, user.getUserShipLength());
        q.add(10); q.add(6); q.add(i);
        assertEquals(i, user.getUserShipLength());
    }

    @ParameterizedTest
    @ValueSource(chars = {'v', 'h'})
    void getUserShipOrientationTest(char i) {
        Queue<Character> q = new LinkedList<>();
        user.setuserShipOrientationQueue(q);
        q.add('k'); q.add('l'); q.add('V'); q.add(i);
        assertEquals(i, user.getUserShipOrientation());
        q.add('H'); q.add('1'); q.add(i);
        assertEquals(i, user.getUserShipOrientation());
    }
}
