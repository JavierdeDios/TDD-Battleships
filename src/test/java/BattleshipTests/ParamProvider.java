package BattleshipTests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParamProvider {

    static List<Arguments> sourcePlaceShip() {
        return Arrays.asList(arguments(5, 1, 'h', 2, true), arguments(0, 7, 'v', 2, true), arguments(6, 0, 'h', 2, true), arguments(1, 5, 'v', 2, true), arguments(1, 4, 'h', 2, true), arguments(4, 7, 'h', 2, true), arguments(2, 5, 'h', 2, true), arguments(2, 0, 'v', 2, true), arguments(0, 3, 'h', 2, true), arguments(6, 8, 'v', 2, true), arguments(1, 8, 'h', 2, true), arguments(3, 6, 'h', 2, true), arguments(4, 8, 'v', 2, true), arguments(8, 4, 'v', 2, true), arguments(8, 2, 'h', 2, true), arguments(2, 4, 'h', 2, true), arguments(5, 7, 'v', 2, true), arguments(2, 3, 'v', 2, true), arguments(8, 7, 'h', 2, true), arguments(6, 2, 'v', 2, true), arguments(1, 0, 'v', 2, true), arguments(9, 5, 'v', 2, false), arguments(8, 1, 'v', 2, true), arguments(1, 6, 'v', 2, true), arguments(2, 8, 'h', 2, true), arguments(9, 1, 'v', 2, false), arguments(7, 5, 'v', 2, true), arguments(3, 7, 'v', 2, true), arguments(4, 3, 'v', 2, true), arguments(5, 9, 'h', 2, false), arguments(2, 9, 'v', 2, true), arguments(3, 8, 'v', 2, true), arguments(5, 4, 'v', 2, true), arguments(6, 9, 'h', 2, false), arguments(9, 7, 'h', 2, true), arguments(0, 4, 'h', 2, true), arguments(6, 5, 'v', 2, true), arguments(6, 3, 'h', 2, true), arguments(5, 2, 'v', 2, true), arguments(4, 9, 'h', 2, false), arguments(4, 1, 'h', 2, true), arguments(9, 8, 'v', 2, false), arguments(9, 2, 'v', 2, false), arguments(7, 0, 'h', 2, true), arguments(7, 1, 'h', 2, true), arguments(1, 3, 'h', 2, true), arguments(0, 0, 'h', 2, true), arguments(7, 9, 'h', 2, false), arguments(8, 8, 'h', 2, true), arguments(0, 5, 'v', 2, true), arguments(7, 7, 'v', 2, true), arguments(5, 0, 'h', 2, true), arguments(3, 3, 'h', 2, true), arguments(3, 1, 'h', 2, true), arguments(0, 6, 'h', 2, true), arguments(5, 5, 'h', 2, true), arguments(2, 6, 'h', 2, true), arguments(7, 8, 'h', 2, true), arguments(9, 9, 'v', 2, false), arguments(3, 4, 'h', 2, true), arguments(1, 9, 'h', 2, false), arguments(4, 4, 'v', 2, true), arguments(8, 9, 'h', 2, false), arguments(8, 0, 'h', 2, true), arguments(9, 0, 'v', 2, false), arguments(5, 3, 'h', 2, true), arguments(6, 1, 'v', 2, true), arguments(3, 9, 'h', 2, false), arguments(8, 5, 'v', 2, true), arguments(6, 4, 'v', 2, true), arguments(9, 4, 'v', 2, false), arguments(5, 8, 'v', 2, true), arguments(2, 7, 'v', 2, true), arguments(3, 2, 'v', 2, true), arguments(9, 3, 'v', 2, false), arguments(0, 9, 'h', 2, false), arguments(9, 6, 'v', 2, false), arguments(4, 5, 'h', 2, true), arguments(3, 0, 'v', 2, true), arguments(0, 2, 'v', 2, true), arguments(5, 6, 'v', 2, true), arguments(0, 1, 'v', 2, true), arguments(2, 1, 'v', 2, true), arguments(7, 6, 'v', 2, true), arguments(4, 2, 'h', 2, true), arguments(8, 6, 'h', 2, true), arguments(1, 7, 'h', 2, true), arguments(7, 2, 'v', 2, true), arguments(3, 5, 'h', 2, true), arguments(6, 6, 'v', 2, true), arguments(7, 3, 'v', 2, true), arguments(4, 6, 'v', 2, true), arguments(1, 2, 'v', 2, true), arguments(7, 4, 'h', 2, true), arguments(2, 2, 'h', 2, true), arguments(0, 8, 'h', 2, true), arguments(4, 0, 'h', 2, true), arguments(1, 1, 'v', 2, true), arguments(8, 3, 'h', 2, true), arguments(9, 7, 'v', 2, false), arguments(6, 7, 'v', 2, true), arguments(2, 9, 'h', 2, false), arguments(5, 1, 'h', 3, true), arguments(0, 7, 'v', 3, true), arguments(6, 0, 'h', 3, true), arguments(1, 5, 'v', 3, true), arguments(1, 4, 'h', 3, true), arguments(4, 7, 'h', 3, true), arguments(2, 5, 'h', 3, true), arguments(2, 0, 'v', 3, true), arguments(0, 3, 'h', 3, true), arguments(6, 8, 'h', 3, false), arguments(5, 5, 'v', 3, true), arguments(8, 4, 'v', 3, false), arguments(2, 1, 'v', 3, true), arguments(4, 4, 'v', 3, true), arguments(2, 2, 'h', 3, true), arguments(3, 7, 'h', 3, true), arguments(9, 0, 'v', 3, false), arguments(0, 5, 'v', 3, true), arguments(9, 8, 'h', 3, false), arguments(7, 7, 'v', 3, true), arguments(2, 3, 'v', 3, true), arguments(9, 6, 'h', 3, true), arguments(5, 8, 'h', 3, false), arguments(3, 1, 'v', 3, true), arguments(7, 6, 'v', 3, true), arguments(5, 2, 'v', 3, true), arguments(9, 4, 'v', 3, false), arguments(4, 3, 'v', 3, true), arguments(0, 8, 'h', 3, false), arguments(6, 3, 'v', 3, true), arguments(1, 3, 'v', 3, true), arguments(4, 2, 'v', 3, true), arguments(0, 9, 'v', 3, true), arguments(1, 0, 'h', 3, true), arguments(7, 4, 'h', 3, true), arguments(2, 8, 'v', 3, true), arguments(9, 3, 'v', 3, false), arguments(6, 6, 'v', 3, true), arguments(2, 4, 'h', 3, true), arguments(7, 0, 'h', 3, true), arguments(8, 2, 'h', 3, true), arguments(4, 9, 'h', 3, false), arguments(6, 1, 'v', 3, true), arguments(0, 6, 'h', 3, true), arguments(1, 6, 'v', 3, true), arguments(5, 0, 'h', 3, true), arguments(3, 8, 'h', 3, false), arguments(2, 7, 'h', 3, true), arguments(3, 6, 'v', 3, true), arguments(1, 2, 'h', 3, true), arguments(0, 0, 'v', 3, true), arguments(3, 2, 'h', 3, true), arguments(2, 6, 'h', 3, true), arguments(8, 1, 'v', 3, false), arguments(8, 3, 'h', 3, true), arguments(3, 9, 'h', 3, false), arguments(1, 8, 'h', 3, false), arguments(2, 9, 'h', 3, false), arguments(4, 8, 'h', 3, false), arguments(8, 9, 'h', 3, false), arguments(5, 3, 'v', 3, true), arguments(5, 4, 'v', 3, true), arguments(9, 9, 'v', 3, false), arguments(3, 0, 'h', 3, true), arguments(5, 7, 'h', 3, true), arguments(7, 9, 'h', 3, false), arguments(7, 2, 'h', 3, true), arguments(6, 2, 'h', 3, true), arguments(9, 5, 'v', 3, false), arguments(8, 6, 'v', 3, false), arguments(8, 5, 'h', 3, true), arguments(8, 8, 'h', 3, false), arguments(4, 6, 'h', 3, true), arguments(9, 1, 'h', 3, true), arguments(0, 1, 'v', 3, true), arguments(7, 5, 'v', 3, true), arguments(1, 1, 'v', 3, true), arguments(6, 4, 'v', 3, true), arguments(7, 3, 'v', 3, true), arguments(3, 4, 'h', 3, true), arguments(6, 5, 'v', 3, true), arguments(9, 7, 'v', 3, false), arguments(1, 7, 'h', 3, true), arguments(8, 0, 'v', 3, false), arguments(5, 9, 'h', 3, false), arguments(6, 7, 'v', 3, true), arguments(9, 2, 'v', 3, false), arguments(3, 5, 'v', 3, true), arguments(7, 1, 'v', 3, true), arguments(0, 2, 'h', 3, true), arguments(4, 1, 'h', 3, true), arguments(4, 5, 'v', 3, true), arguments(3, 3, 'v', 3, true), arguments(6, 9, 'h', 3, false), arguments(1, 9, 'h', 3, false), arguments(7, 8, 'h', 3, false), arguments(0, 4, 'v', 3, true), arguments(8, 7, 'h', 3, true), arguments(5, 6, 'v', 3, true), arguments(4, 0, 'h', 3, true), arguments(5, 1, 'h', 4, true), arguments(0, 7, 'h', 4, false), arguments(6, 0, 'v', 4, true), arguments(0, 2, 'v', 4, true), arguments(2, 6, 'v', 4, true), arguments(3, 5, 'v', 4, true), arguments(0, 3, 'v', 4, true), arguments(2, 8, 'h', 4, false), arguments(6, 5, 'h', 4, true), arguments(8, 7, 'v', 4, false), arguments(8, 5, 'h', 4, true), arguments(7, 8, 'v', 4, false), arguments(1, 4, 'h', 4, true), arguments(0, 9, 'v', 4, true), arguments(4, 0, 'h', 4, true), arguments(5, 7, 'v', 4, true), arguments(4, 9, 'h', 4, false), arguments(8, 4, 'v', 4, false), arguments(0, 8, 'v', 4, true), arguments(7, 2, 'v', 4, false), arguments(1, 0, 'v', 4, true), arguments(7, 3, 'h', 4, true), arguments(8, 1, 'v', 4, false), arguments(9, 6, 'v', 4, false), arguments(6, 8, 'h', 4, false), arguments(2, 3, 'h', 4, true), arguments(3, 1, 'h', 4, true), arguments(2, 1, 'v', 4, true), arguments(0, 1, 'v', 4, true), arguments(9, 3, 'v', 4, false), arguments(3, 7, 'h', 4, false), arguments(7, 9, 'v', 4, false), arguments(2, 4, 'v', 4, true), arguments(7, 5, 'v', 4, false), arguments(9, 8, 'h', 4, false), arguments(4, 4, 'v', 4, true), arguments(6, 2, 'h', 4, true), arguments(8, 3, 'v', 4, false), arguments(6, 4, 'h', 4, true), arguments(4, 6, 'h', 4, true), arguments(7, 0, 'v', 4, false), arguments(2, 7, 'v', 4, true), arguments(2, 0, 'h', 4, true), arguments(8, 8, 'h', 4, false), arguments(0, 6, 'v', 4, true), arguments(8, 0, 'v', 4, false), arguments(9, 0, 'h', 4, true), arguments(9, 7, 'v', 4, false), arguments(5, 8, 'h', 4, false), arguments(6, 6, 'h', 4, true), arguments(5, 3, 'h', 4, true), arguments(1, 5, 'v', 4, true), arguments(3, 4, 'v', 4, true), arguments(3, 2, 'v', 4, true), arguments(2, 9, 'v', 4, true), arguments(4, 7, 'v', 4, true), arguments(8, 6, 'v', 4, false), arguments(4, 5, 'h', 4, true), arguments(8, 2, 'v', 4, false), arguments(8, 9, 'h', 4, false), arguments(5, 4, 'h', 4, true), arguments(1, 6, 'v', 4, true), arguments(1, 9, 'h', 4, false), arguments(1, 1, 'v', 4, true), arguments(0, 0, 'v', 4, true), arguments(9, 4, 'v', 4, false), arguments(6, 9, 'h', 4, false), arguments(1, 2, 'h', 4, true), arguments(7, 4, 'v', 4, false), arguments(7, 7, 'v', 4, false), arguments(4, 8, 'h', 4, false), arguments(6, 7, 'h', 4, false), arguments(3, 0, 'h', 4, true), arguments(2, 5, 'v', 4, true), arguments(5, 5, 'h', 4, true), arguments(0, 4, 'h', 4, true), arguments(6, 3, 'v', 4, true), arguments(5, 6, 'v', 4, true), arguments(4, 2, 'v', 4, true), arguments(5, 0, 'v', 4, true), arguments(9, 9, 'h', 4, false), arguments(7, 1, 'h', 4, true), arguments(3, 9, 'v', 4, true), arguments(1, 8, 'h', 4, false), arguments(2, 2, 'v', 4, true), arguments(9, 5, 'h', 4, true), arguments(5, 9, 'h', 4, false), arguments(3, 3, 'v', 4, true), arguments(6, 1, 'v', 4, true), arguments(7, 6, 'v', 4, false), arguments(9, 1, 'v', 4, false), arguments(3, 6, 'v', 4, true), arguments(0, 5, 'v', 4, true), arguments(9, 2, 'v', 4, false), arguments(1, 7, 'v', 4, true), arguments(5, 2, 'v', 4, true), arguments(1, 3, 'v', 4, true), arguments(3, 8, 'h', 4, false), arguments(4, 3, 'h', 4, true), arguments(4, 1, 'v', 4, true), arguments(5, 1, 'h', 5, true), arguments(0, 7, 'h', 5, false), arguments(6, 0, 'h', 5, true), arguments(1, 5, 'v', 5, true), arguments(9, 0, 'v', 5, false), arguments(4, 5, 'h', 5, true), arguments(4, 8, 'h', 5, false), arguments(2, 8, 'v', 5, true), arguments(8, 4, 'v', 5, false), arguments(7, 6, 'h', 5, false), arguments(1, 8, 'h', 5, false), arguments(0, 2, 'v', 5, true), arguments(2, 1, 'h', 5, true), arguments(9, 2, 'h', 5, true), arguments(0, 9, 'v', 5, true), arguments(3, 0, 'v', 5, true), arguments(0, 3, 'v', 5, true), arguments(1, 9, 'h', 5, false), arguments(6, 7, 'v', 5, false), arguments(5, 7, 'v', 5, true), arguments(7, 7, 'v', 5, false), arguments(4, 4, 'h', 5, true), arguments(9, 7, 'h', 5, false), arguments(8, 5, 'h', 5, true), arguments(6, 4, 'h', 5, true), arguments(9, 5, 'v', 5, false), arguments(2, 2, 'h', 5, true), arguments(0, 0, 'v', 5, true), arguments(7, 1, 'v', 5, false), arguments(1, 7, 'h', 5, false), arguments(9, 3, 'v', 5, false), arguments(2, 0, 'h', 5, true), arguments(3, 6, 'h', 5, false), arguments(1, 1, 'h', 5, true), arguments(3, 9, 'v', 5, true), arguments(5, 3, 'h', 5, true), arguments(6, 8, 'h', 5, false), arguments(5, 6, 'v', 5, true), arguments(3, 3, 'h', 5, true), arguments(6, 9, 'h', 5, false), arguments(6, 3, 'h', 5, true), arguments(8, 0, 'h', 5, true), arguments(5, 4, 'h', 5, true), arguments(6, 2, 'v', 5, false), arguments(6, 5, 'h', 5, true), arguments(0, 1, 'v', 5, true), arguments(4, 2, 'v', 5, true), arguments(1, 3, 'h', 5, true), arguments(5, 8, 'h', 5, false), arguments(3, 5, 'v', 5, true), arguments(0, 6, 'h', 5, false), arguments(6, 1, 'v', 5, false), arguments(3, 7, 'h', 5, false), arguments(2, 7, 'h', 5, false), arguments(0, 4, 'h', 5, true), arguments(1, 4, 'h', 5, true), arguments(9, 6, 'h', 5, false), arguments(8, 3, 'h', 5, true), arguments(5, 9, 'v', 5, true), arguments(8, 6, 'v', 5, false), arguments(7, 0, 'h', 5, true), arguments(8, 7, 'v', 5, false), arguments(1, 2, 'h', 5, true), arguments(7, 2, 'h', 5, true), arguments(5, 0, 'v', 5, true), arguments(4, 6, 'h', 5, false), arguments(2, 3, 'v', 5, true), arguments(1, 6, 'v', 5, true), arguments(8, 2, 'v', 5, false), arguments(4, 1, 'v', 5, true), arguments(1, 0, 'h', 5, true), arguments(3, 1, 'h', 5, true), arguments(4, 9, 'v', 5, true), arguments(2, 6, 'h', 5, false), arguments(7, 3, 'v', 5, false), arguments(3, 4, 'h', 5, true), arguments(5, 2, 'h', 5, true), arguments(0, 8, 'v', 5, true), arguments(2, 5, 'v', 5, true), arguments(2, 9, 'h', 5, false), arguments(4, 0, 'h', 5, true), arguments(7, 8, 'v', 5, false), arguments(3, 2, 'v', 5, true), arguments(5, 5, 'h', 5, true), arguments(7, 4, 'v', 5, false), arguments(9, 8, 'v', 5, false), arguments(3, 8, 'v', 5, true), arguments(9, 1, 'h', 5, true), arguments(8, 8, 'v', 5, false), arguments(4, 7, 'h', 5, false), arguments(9, 4, 'h', 5, true), arguments(0, 5, 'v', 5, true), arguments(4, 3, 'h', 5, true), arguments(2, 4, 'v', 5, true), arguments(7, 9, 'v', 5, false), arguments(9, 9, 'v', 5, false), arguments(6, 6, 'h', 5, false), arguments(8, 1, 'h', 5, true), arguments(8, 9, 'v', 5, false), arguments(7, 5, 'v', 5, false));
    }

    static List<Arguments> sourcePlaceShipBoundaries() {
        return Arrays.asList(arguments(0, 9, 'h', 2, false), arguments(0, 8, 'h', 2, true), arguments(9, 0, 'v', 2, false), arguments(8, 0, 'v', 2, true), arguments(0, 8, 'h', 3, false), arguments(0, 7, 'h', 3, true), arguments(8, 0, 'v', 3, false), arguments(7, 0, 'v', 3, true), arguments(0, 7, 'h', 4, false), arguments(0, 6, 'h', 4, true), arguments(7, 0, 'v', 4, false), arguments(6, 0, 'v', 4, true), arguments(0, 6, 'h', 5, false), arguments(0, 5, 'h', 5, true), arguments(6, 0, 'v', 5, false), arguments(5, 0, 'v', 5, true), arguments(1, 9, 'h', 2, false), arguments(1, 8, 'h', 2, true), arguments(9, 1, 'v', 2, false), arguments(8, 1, 'v', 2, true), arguments(1, 8, 'h', 3, false), arguments(1, 7, 'h', 3, true), arguments(8, 1, 'v', 3, false), arguments(7, 1, 'v', 3, true), arguments(1, 7, 'h', 4, false), arguments(1, 6, 'h', 4, true), arguments(7, 1, 'v', 4, false), arguments(6, 1, 'v', 4, true), arguments(1, 6, 'h', 5, false), arguments(1, 5, 'h', 5, true), arguments(6, 1, 'v', 5, false), arguments(5, 1, 'v', 5, true), arguments(2, 9, 'h', 2, false), arguments(2, 8, 'h', 2, true), arguments(9, 2, 'v', 2, false), arguments(8, 2, 'v', 2, true), arguments(2, 8, 'h', 3, false), arguments(2, 7, 'h', 3, true), arguments(8, 2, 'v', 3, false), arguments(7, 2, 'v', 3, true), arguments(2, 7, 'h', 4, false), arguments(2, 6, 'h', 4, true), arguments(7, 2, 'v', 4, false), arguments(6, 2, 'v', 4, true), arguments(2, 6, 'h', 5, false), arguments(2, 5, 'h', 5, true), arguments(6, 2, 'v', 5, false), arguments(5, 2, 'v', 5, true), arguments(3, 9, 'h', 2, false), arguments(3, 8, 'h', 2, true), arguments(9, 3, 'v', 2, false), arguments(8, 3, 'v', 2, true), arguments(3, 8, 'h', 3, false), arguments(3, 7, 'h', 3, true), arguments(8, 3, 'v', 3, false), arguments(7, 3, 'v', 3, true), arguments(3, 7, 'h', 4, false), arguments(3, 6, 'h', 4, true), arguments(7, 3, 'v', 4, false), arguments(6, 3, 'v', 4, true), arguments(3, 6, 'h', 5, false), arguments(3, 5, 'h', 5, true), arguments(6, 3, 'v', 5, false), arguments(5, 3, 'v', 5, true), arguments(4, 9, 'h', 2, false), arguments(4, 8, 'h', 2, true), arguments(9, 4, 'v', 2, false), arguments(8, 4, 'v', 2, true), arguments(4, 8, 'h', 3, false), arguments(4, 7, 'h', 3, true), arguments(8, 4, 'v', 3, false), arguments(7, 4, 'v', 3, true), arguments(4, 7, 'h', 4, false), arguments(4, 6, 'h', 4, true), arguments(7, 4, 'v', 4, false), arguments(6, 4, 'v', 4, true), arguments(4, 6, 'h', 5, false), arguments(4, 5, 'h', 5, true), arguments(6, 4, 'v', 5, false), arguments(5, 4, 'v', 5, true), arguments(5, 9, 'h', 2, false), arguments(5, 8, 'h', 2, true), arguments(9, 5, 'v', 2, false), arguments(8, 5, 'v', 2, true), arguments(5, 8, 'h', 3, false), arguments(5, 7, 'h', 3, true), arguments(8, 5, 'v', 3, false), arguments(7, 5, 'v', 3, true), arguments(5, 7, 'h', 4, false), arguments(5, 6, 'h', 4, true), arguments(7, 5, 'v', 4, false), arguments(6, 5, 'v', 4, true), arguments(5, 6, 'h', 5, false), arguments(5, 5, 'h', 5, true), arguments(6, 5, 'v', 5, false), arguments(5, 5, 'v', 5, true), arguments(6, 9, 'h', 2, false), arguments(6, 8, 'h', 2, true), arguments(9, 6, 'v', 2, false), arguments(8, 6, 'v', 2, true), arguments(6, 8, 'h', 3, false), arguments(6, 7, 'h', 3, true), arguments(8, 6, 'v', 3, false), arguments(7, 6, 'v', 3, true), arguments(6, 7, 'h', 4, false), arguments(6, 6, 'h', 4, true), arguments(7, 6, 'v', 4, false), arguments(6, 6, 'v', 4, true), arguments(6, 6, 'h', 5, false), arguments(6, 5, 'h', 5, true), arguments(6, 6, 'v', 5, false), arguments(5, 6, 'v', 5, true), arguments(7, 9, 'h', 2, false), arguments(7, 8, 'h', 2, true), arguments(9, 7, 'v', 2, false), arguments(8, 7, 'v', 2, true), arguments(7, 8, 'h', 3, false), arguments(7, 7, 'h', 3, true), arguments(8, 7, 'v', 3, false), arguments(7, 7, 'v', 3, true), arguments(7, 7, 'h', 4, false), arguments(7, 6, 'h', 4, true), arguments(7, 7, 'v', 4, false), arguments(6, 7, 'v', 4, true), arguments(7, 6, 'h', 5, false), arguments(7, 5, 'h', 5, true), arguments(6, 7, 'v', 5, false), arguments(5, 7, 'v', 5, true), arguments(8, 9, 'h', 2, false), arguments(8, 8, 'h', 2, true), arguments(9, 8, 'v', 2, false), arguments(8, 8, 'v', 2, true), arguments(8, 8, 'h', 3, false), arguments(8, 7, 'h', 3, true), arguments(8, 8, 'v', 3, false), arguments(7, 8, 'v', 3, true), arguments(8, 7, 'h', 4, false), arguments(8, 6, 'h', 4, true), arguments(7, 8, 'v', 4, false), arguments(6, 8, 'v', 4, true), arguments(8, 6, 'h', 5, false), arguments(8, 5, 'h', 5, true), arguments(6, 8, 'v', 5, false), arguments(5, 8, 'v', 5, true), arguments(9, 9, 'h', 2, false), arguments(9, 8, 'h', 2, true), arguments(9, 9, 'v', 2, false), arguments(8, 9, 'v', 2, true), arguments(9, 8, 'h', 3, false), arguments(9, 7, 'h', 3, true), arguments(8, 9, 'v', 3, false), arguments(7, 9, 'v', 3, true), arguments(9, 7, 'h', 4, false), arguments(9, 6, 'h', 4, true), arguments(7, 9, 'v', 4, false), arguments(6, 9, 'v', 4, true), arguments(9, 6, 'h', 5, false), arguments(9, 5, 'h', 5, true), arguments(6, 9, 'v', 5, false), arguments(5, 9, 'v', 5, true));
    }

    static List<Arguments> sourcePlaceShipHorizontal() {
        return Arrays.asList(arguments(0, 0, 2, true), arguments(0, 0, 3, true), arguments(0, 0, 4, true), arguments(0, 0, 5, true), arguments(0, 1, 2, true), arguments(0, 1, 3, true), arguments(0, 1, 4, true), arguments(0, 1, 5, true), arguments(0, 2, 2, true), arguments(0, 2, 3, true), arguments(0, 2, 4, true), arguments(0, 2, 5, true), arguments(0, 3, 2, true), arguments(0, 3, 3, true), arguments(0, 3, 4, true), arguments(0, 3, 5, true), arguments(0, 4, 2, true), arguments(0, 4, 3, true), arguments(0, 4, 4, true), arguments(0, 4, 5, true), arguments(0, 5, 2, true), arguments(0, 5, 3, true), arguments(0, 5, 4, true), arguments(0, 5, 5, true), arguments(0, 6, 2, true), arguments(0, 6, 3, true), arguments(0, 6, 4, true), arguments(0, 6, 5, false), arguments(0, 7, 2, true), arguments(0, 7, 3, true), arguments(0, 7, 4, false), arguments(0, 7, 5, false), arguments(0, 8, 2, true), arguments(0, 8, 3, false), arguments(0, 8, 4, false), arguments(0, 8, 5, false), arguments(0, 9, 2, false), arguments(0, 9, 3, false), arguments(0, 9, 4, false), arguments(0, 9, 5, false));
    }

    static List<Arguments> sourcePlaceShipVertical() {
        return Arrays.asList(arguments(0, 0, 2, true), arguments(0, 0, 3, true), arguments(0, 0, 4, true), arguments(0, 0, 5, true), arguments(1, 0, 2, true), arguments(1, 0, 3, true), arguments(1, 0, 4, true), arguments(1, 0, 5, true), arguments(2, 0, 2, true), arguments(2, 0, 3, true), arguments(2, 0, 4, true), arguments(2, 0, 5, true), arguments(3, 0, 2, true), arguments(3, 0, 3, true), arguments(3, 0, 4, true), arguments(3, 0, 5, true), arguments(4, 0, 2, true), arguments(4, 0, 3, true), arguments(4, 0, 4, true), arguments(4, 0, 5, true), arguments(5, 0, 2, true), arguments(5, 0, 3, true), arguments(5, 0, 4, true), arguments(5, 0, 5, true), arguments(6, 0, 2, true), arguments(6, 0, 3, true), arguments(6, 0, 4, true), arguments(6, 0, 5, false), arguments(7, 0, 2, true), arguments(7, 0, 3, true), arguments(7, 0, 4, false), arguments(7, 0, 5, false), arguments(8, 0, 2, true), arguments(8, 0, 3, false), arguments(8, 0, 4, false), arguments(8, 0, 5, false), arguments(9, 0, 2, false), arguments(9, 0, 3, false), arguments(9, 0, 4, false), arguments(9, 0, 5, false));
    }

    static List<Arguments> sourcePlaceShipCollision() {
        return Arrays.asList(arguments(0, 0, 'h', 5, true), arguments(0, 5, 'h', 5, false), arguments(0, 0, 'h', 4, true), arguments(0, 1, 'h', 4, true), arguments(0, 6, 'h', 4, true), arguments(0, 5, 'h', 4, false), arguments(0, 0, 'v', 5, false), arguments(5, 0, 'v', 5, true), arguments(0, 0, 'v', 4, true), arguments(1, 0, 'v', 4, false), arguments(6, 0, 'v', 4, true), arguments(5, 0, 'v', 4, true), arguments(1, 0, 'h', 5, true), arguments(1, 5, 'h', 5, false), arguments(1, 0, 'h', 4, true), arguments(1, 1, 'h', 4, true), arguments(1, 6, 'h', 4, true), arguments(1, 5, 'h', 4, false), arguments(0, 1, 'v', 5, false), arguments(5, 1, 'v', 5, true), arguments(0, 1, 'v', 4, true), arguments(1, 1, 'v', 4, false), arguments(6, 1, 'v', 4, true), arguments(5, 1, 'v', 4, true), arguments(2, 0, 'h', 5, true), arguments(2, 5, 'h', 5, false), arguments(2, 0, 'h', 4, true), arguments(2, 1, 'h', 4, true), arguments(2, 6, 'h', 4, true), arguments(2, 5, 'h', 4, false), arguments(0, 2, 'v', 5, false), arguments(5, 2, 'v', 5, true), arguments(0, 2, 'v', 4, true), arguments(1, 2, 'v', 4, false), arguments(6, 2, 'v', 4, true), arguments(5, 2, 'v', 4, true), arguments(3, 0, 'h', 5, true), arguments(3, 5, 'h', 5, false), arguments(3, 0, 'h', 4, true), arguments(3, 1, 'h', 4, true), arguments(3, 6, 'h', 4, true), arguments(3, 5, 'h', 4, false), arguments(0, 3, 'v', 5, false), arguments(5, 3, 'v', 5, true), arguments(0, 3, 'v', 4, true), arguments(1, 3, 'v', 4, false), arguments(6, 3, 'v', 4, true), arguments(5, 3, 'v', 4, true), arguments(4, 0, 'h', 5, false), arguments(4, 5, 'h', 5, false), arguments(4, 0, 'h', 4, false), arguments(4, 1, 'h', 4, false), arguments(4, 6, 'h', 4, true), arguments(4, 5, 'h', 4, false), arguments(0, 4, 'v', 5, false), arguments(5, 4, 'v', 5, false), arguments(0, 4, 'v', 4, true), arguments(1, 4, 'v', 4, false), arguments(6, 4, 'v', 4, false), arguments(5, 4, 'v', 4, false), arguments(5, 0, 'h', 5, false), arguments(5, 5, 'h', 5, false), arguments(5, 0, 'h', 4, true), arguments(5, 1, 'h', 4, false), arguments(5, 6, 'h', 4, false), arguments(5, 5, 'h', 4, false), arguments(0, 5, 'v', 5, false), arguments(5, 5, 'v', 5, false), arguments(0, 5, 'v', 4, false), arguments(1, 5, 'v', 4, false), arguments(6, 5, 'v', 4, true), arguments(5, 5, 'v', 4, false), arguments(6, 0, 'h', 5, false), arguments(6, 5, 'h', 5, true), arguments(6, 0, 'h', 4, true), arguments(6, 1, 'h', 4, false), arguments(6, 6, 'h', 4, true), arguments(6, 5, 'h', 4, true), arguments(0, 6, 'v', 5, true), arguments(5, 6, 'v', 5, false), arguments(0, 6, 'v', 4, true), arguments(1, 6, 'v', 4, true), arguments(6, 6, 'v', 4, true), arguments(5, 6, 'v', 4, false), arguments(7, 0, 'h', 5, false), arguments(7, 5, 'h', 5, true), arguments(7, 0, 'h', 4, true), arguments(7, 1, 'h', 4, false), arguments(7, 6, 'h', 4, true), arguments(7, 5, 'h', 4, true), arguments(0, 7, 'v', 5, true), arguments(5, 7, 'v', 5, false), arguments(0, 7, 'v', 4, true), arguments(1, 7, 'v', 4, true), arguments(6, 7, 'v', 4, true), arguments(5, 7, 'v', 4, false), arguments(8, 0, 'h', 5, false), arguments(8, 5, 'h', 5, true), arguments(8, 0, 'h', 4, true), arguments(8, 1, 'h', 4, false), arguments(8, 6, 'h', 4, true), arguments(8, 5, 'h', 4, true), arguments(0, 8, 'v', 5, true), arguments(5, 8, 'v', 5, false), arguments(0, 8, 'v', 4, true), arguments(1, 8, 'v', 4, true), arguments(6, 8, 'v', 4, true), arguments(5, 8, 'v', 4, false), arguments(9, 0, 'h', 5, false), arguments(9, 5, 'h', 5, true), arguments(9, 0, 'h', 4, true), arguments(9, 1, 'h', 4, false), arguments(9, 6, 'h', 4, true), arguments(9, 5, 'h', 4, true), arguments(0, 9, 'v', 5, true), arguments(5, 9, 'v', 5, false), arguments(0, 9, 'v', 4, true), arguments(1, 9, 'v', 4, true), arguments(6, 9, 'v', 4, true), arguments(5, 9, 'v', 4, false));
    }

    static List<Arguments> sourceSunkShip() {
        return Arrays.asList(arguments(0, 0, 'h', 2), arguments(9, 0, 'h', 2), arguments(0, 8, 'h', 2), arguments(9, 8, 'h', 2), arguments(0, 0, 'v', 2), arguments(0, 9, 'v', 2), arguments(8, 0, 'v', 2), arguments(8, 9, 'v', 2), arguments(0, 0, 'h', 3), arguments(9, 0, 'h', 3), arguments(0, 7, 'h', 3), arguments(9, 7, 'h', 3), arguments(0, 0, 'v', 3), arguments(0, 9, 'v', 3), arguments(7, 0, 'v', 3), arguments(7, 9, 'v', 3), arguments(0, 0, 'h', 4), arguments(9, 0, 'h', 4), arguments(0, 6, 'h', 4), arguments(9, 6, 'h', 4), arguments(0, 0, 'v', 4), arguments(0, 9, 'v', 4), arguments(6, 0, 'v', 4), arguments(6, 9, 'v', 4), arguments(0, 0, 'h', 5), arguments(9, 0, 'h', 5), arguments(0, 5, 'h', 5), arguments(9, 5, 'h', 5), arguments(0, 0, 'v', 5), arguments(0, 9, 'v', 5), arguments(5, 0, 'v', 5), arguments(5, 9, 'v', 5));
    }
}
