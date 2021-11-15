package BattleshipGame.Model;

import java.io.InputStream;
import java.util.Scanner;
import java.io.PrintStream;

public class UserInputsShip {

    int userShipX;
    int userShipY;
    char userShipOrientation;

    public int getUserShipX() {
        return this.userShipX;
    }

    public int getUserShipY() {
        return this.userShipY;
    }

    public char getUserShipOrientation() {
        return this.userShipOrientation;
    }

    public boolean getParameterXKeyboard(InputStream in) {
        Scanner keyboard = new Scanner(in);
        System.out.print("Give a ship X placement (0-9)");
        String s = keyboard.nextLine();
        if (s.length() == 1) {
            if (Character.isDigit(s.charAt(0))) {
                int value = Character.getNumericValue(s.charAt(0));
                if (value >= 0 && value < 10) {
                    this.userShipX = value;
                    return true;
                }
            } else{
                System.out.print("The input is not a digit. Please input a valid digit.");
            }
        } else {
            System.out.print("The length of the input is not correct. Please input a valid digit.");
        }
        return false;
    }

    public boolean getParameterYKeyboard(InputStream in) {
        Scanner keyboard = new Scanner(in);
        System.out.print("Give a ship Y placement (0-9)");
        String s = keyboard.nextLine();
        if (s.length() == 1) {
            if (Character.isDigit(s.charAt(0))) {
                int value = Character.getNumericValue(s.charAt(0));
                if (value >= 0 && value < 10) {
                    this.userShipY = value;
                    return true;
                }
            } else{
                System.out.print("The input is not a digit. Please input a valid digit.");
            }
        } else {
            System.out.print("The length of the input is not correct. Please input a valid digit.");
        }
        return false;
    }

    public boolean getParameterOrientationKeyboard(InputStream in) {
        Scanner keyboard = new Scanner(in);
        System.out.print("Give a ship orientation (h or v)");
        String s = keyboard.nextLine();
        if (s.length() == 1) {
            if (!Character.isDigit(s.charAt(0))) {
                char lletra = s.charAt(0);
                if (lletra == 'h' || lletra == 'v') {
                    this.userShipOrientation = lletra;
                    return true;
                }
            } else{
                System.out.print("The input is not a valid char. Please input a valid char.");
            }
        } else {
            System.out.print("The length of the input is not correct. Please input a valid char.");
        }
        return false;
    }

}
