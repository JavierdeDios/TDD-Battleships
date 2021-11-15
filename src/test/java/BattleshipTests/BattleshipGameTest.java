package BattleshipTests;

import BattleshipGame.Model.IRandomShip;
import BattleshipGame.Model.UserInputs;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BattleshipGameTest {

    @ParameterizedTest
    @ValueSource(strings = {"-1", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"})
    void numberOfShipsUserTest(String s) {
        UserInputs ship = new UserInputs();
        InputStream is = new ByteArrayInputStream(s.getBytes());

    }

    @Test
    void mainMockTest() {
        UserInputsMock user = new UserInputsMock();
        RandomShipMock rand = new RandomShipMock();

        Queue<Integer> rX = new LinkedList<>(); Queue<Integer> rY = new LinkedList<>(); Queue<Character> rOr = new LinkedList<>();
        rand.setPositionsXQueue(rX); rand.setPositionsYQueue(rY); rand.setOrientationsQueue(rOr);

        Queue<Integer> uX = new LinkedList<>(); Queue<Integer> uY = new LinkedList<>(); Queue<Character> uOr = new LinkedList<>();
        Queue<Integer> uLen = new LinkedList<>(); Queue<Integer> uNum = new LinkedList<>();
        user.setuserShipXQueue(uX); user.setuserShipYQueue(uY); user.setuserShipOrientationQueue(uOr);
        user.setuserLengthQueue(uLen); user.setNumberOfShipsQueue(uNum);

        // COLOCACIÓ VAIXELLS USUARI
        ////////////////////////////
        // AFEGIM NUMERO DE VAIXELLS AMB QUE VOLEM JUGAR (VALORS FRONTERA: 1 - 9)
        uNum.add(-1); uNum.add(0); uNum.add(10); uNum.add(11); uNum.add(2);

        // AFEGIM DIMENSIONS DELS VAIXELLS (VALORS FRONTERA: 2 - 5)
        uLen.add(-1); uLen.add(0); uLen.add(1); uLen.add(6); uLen.add(12); uLen.add(2); uLen.add(5);

        // AFEGIM POSICIONS PELS VAIXELLS DEL JUGADOR (VALORS FRONTERA: 0 - 9)
        uX.add(-1); uX.add(-1); uX.add(0); uX.add(10); uX.add(10); uX.add(9); uX.add(1); uX.add(1); uX.add(5);
        uY.add(-1); uY.add(0); uY.add(-1); uY.add(10); uY.add(9); uY.add(10); uY.add(0); uY.add(0); uY.add(0);

        // AFEGIM ORIENTACIONS (NOMÉS ACCEPTA 'h' O 'v')
        uOr.add('3'); uOr.add('K'); uOr.add('H'); uOr.add('h'); uOr.add('V'); uOr.add('v');

        // COLOCACIO VAIXELLS MAQUINA
        /////////////////////////////
        // AFEGIM POSICIONS PELS VAIXELLS DE LA MAQUINA (VALORS FRONTERA: 0 - 9)
        rX.add(-1); rX.add(-1); rX.add(0); rX.add(10); rX.add(10); rX.add(9); rX.add(9); rX.add(0); rX.add(9);
        rY.add(-1); rY.add(0); rY.add(-1); rY.add(10); rY.add(9); rY.add(10); rY.add(9); rY.add(0); rY.add(0);

        // AFEGIM ORIENTACIONS (NOMÉS ACCEPTA 'h' O 'v')
        uOr.add('3'); uOr.add('K'); uOr.add('H'); uOr.add('h'); uOr.add('V'); uOr.add('h');

        
    }

}
