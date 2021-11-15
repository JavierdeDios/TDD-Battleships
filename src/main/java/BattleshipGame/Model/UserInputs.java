package BattleshipGame.Model;

import java.util.Scanner;

public class UserInputs implements IUserInputs {
    Scanner scan = new Scanner(System.in);

    int userShipX;
    int userShipY;
    char userShipOrientation;
    int userNumberOfShips;

    @Override
    public int getUserShipX() {
        while (true) {
            int i = -1;
            try {
                i = scan.nextInt();
                if (i >= 0 && i < 10) {
                    return i;
                } else {
                    if (i < 0) {
                        System.out.println("Numero introduit menor a 0. Torna-ho a intentar.");
                    } else {
                        System.out.println("Numero introduit mes gran que 9. Torna-ho a intentar.");
                    }
                }
            } catch (Exception E) {
                scan.nextLine();
                System.out.println("No es un digit. Torna-ho a intentar.");
            }
        }
    }

    @Override
    public int getUserShipY() {
        while (true) {
            int i = -1;
            try {
                i = scan.nextInt();
                if (i >= 0 && i < 10) {
                    return i;
                } else {
                    if (i < 0) {
                        System.out.println("Numero introduit menor a 0. Torna-ho a intentar.");
                    } else {
                        System.out.println("Numero introduit mes gran que 9. Torna-ho a intentar.");
                    }
                }
            } catch (Exception E) {
                scan.nextLine();
                System.out.println("No es un digit. Torna-ho a intentar.");
            }
        }
    }

    @Override
    public char getUserShipOrientation() {
        while (true) {
            String i = "";
            try {
                i = scan.nextLine();
                if (i.length() == 1) {
                    if (i.charAt(0) == 'h' || i.charAt(0) == 'v') {
                        return i.charAt(0);
                    } else {
                        System.out.println("Caracter no valid, només s'accepta h o v. Torna-ho a intentar.");
                    }
                } else {
                    System.out.println("Cadena de caracters massa llarga. Torna-ho a intentar.");
                }
            } catch (Exception E) {
                scan.nextLine();
                System.out.println("No es un char. Torna-ho a intentar.");
            }
        }
    }

    @Override
    public int getNumberOfShips() {
        while (true) {
            int i = -1;
            try {
                i = scan.nextInt();
                if (i >= 1 && i < 10) {
                    return i;
                } else {
                    if (i < 1) {
                        System.out.println("Numero introduit menor a 1. Torna-ho a intentar.");
                    } else {
                        System.out.println("Numero introduit mes gran que 9. Torna-ho a intentar.");
                    }
                }
            } catch (Exception E) {
                scan.nextLine();
                System.out.println("No es un digit. Torna-ho a intentar.");
            }
        }
    }

    @Override
    public int getUserShipLength() {
        while (true) {
            int i = -1;
            try {
                i = scan.nextInt();
                if (i >= 2 && i < 6) {
                    return i;
                } else {
                    if (i < 2) {
                        System.out.println("Quin vaixell mes curt ha de medir mes de 2. Torna-ho a intentar.");
                    } else {
                        System.out.println("Aquest vaixell es massa gran, ha de medir menys de 5 Torna-ho a intentar.");
                    }
                }
            } catch (Exception E) {
                scan.nextLine();
                System.out.println("No es un digit. Torna-ho a intentar.");
            }
        }
    }
}
