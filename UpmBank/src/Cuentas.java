import java.util.Scanner;
import java.lang.Math;

public class Cuentas {


    public static String IBAN() {

        int c1, c2;
        String CE = "9010";
        String CS = "0201";

        int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
        String IBAN;
        d1 = (int) (Math.random() * 10);

        d2 = (int) (Math.random() * 10);

        d3 = (int) (Math.random() * 10);

        d4 = (int) (Math.random() * 10);

        d5 = (int) (Math.random() * 10);

        d6 = (int) (Math.random() * 10);

        d7 = (int) (Math.random() * 10);

        d8 = (int) (Math.random() * 10);

        d9 = (int) (Math.random() * 10);

        d10 = (int) (Math.random() * 10);


        long ajusteDigitos = (long) Math.pow(10.0, 9.0);

        long NC = Math.abs((d1 * 1000000000) + (d2 * 100000000) + (d3 * 10000000) + (d4 * 1000000) + (d5 * 100000) + (d6 * 10000) + (d7 * 1000) + (d8 * 100) + (d9 * 10) + (d10));
        if (NC < ajusteDigitos) {
            NC = NC + ajusteDigitos;
        }
        c1 = c1(CE, CS);
        c2 = c2(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10);

        IBAN = CE + CS + String.valueOf(c1) + String.valueOf(c2) + String.valueOf(NC);

        return IBAN;
    }

    public static int c1(String CE, String CS) {

        int c1 = 0;
        int a1, a2, a3, a4, b1, b2, b3, b4, ng1;
        a1 = Character.getNumericValue(CE.charAt(0));
        a2 = Character.getNumericValue(CE.charAt(1));
        a3 = Character.getNumericValue(CE.charAt(2));
        a4 = Character.getNumericValue(CE.charAt(3));
        b1 = Character.getNumericValue(CS.charAt(0));
        b2 = Character.getNumericValue(CS.charAt(1));
        b3 = Character.getNumericValue(CS.charAt(2));
        b4 = Character.getNumericValue(CS.charAt(3));
        ng1 = (6 * b4) + (3 * b3) + (7 * b2) + (9 * b1) + (10 * a4) + (5 * a3) + (8 * a2) + (4 * a1);
        int ca = 11 - (ng1 % 11);
        if (ca < 10) {
            c1 = ca;
        }
        else if (ca == 11) {
            c1 = 0;
        }
        else {
            c1 = 1;
        }
        return c1;
    }

    public static int c2(int d1, int d2, int d3, int d4, int d5, int d6, int d7, int d8, int d9, int d10) {

        int c2 = 0;
        int ng2 = (d1) + (2 * d2) + (4 * d3) + (8 * d4) + (5 * d5) + (10 * d6) + (9 * d7) + (7 * d8) + (3 * d9) + (6 * d10);
        int cb = 11 - (ng2 % 11);
        if (cb < 10) {
            c2 = cb;
        }
        else if (cb == 11) {
            c2 = 0;
        }
        else {
            c2 = 1;
        }
        return c2;
    }

    public static String cuenta() {

        Scanner teclado = new Scanner(System.in);
        String IBAN = IBAN();
        long balance = 0;
        byte tipoCuenta;
        System.out.print("Ha seleccionado crear una cuenta\nPor favor, proporcione un nombre:");
        String cliente = teclado.nextLine();
        System.out.print("Por favor, elija un tipo de cuenta\nCorriente (1)\nAhorro (2)\nRemunerada (3)\n");
        tipoCuenta = teclado.nextByte();
        System.out.println("El IBAN de su cuenta es " + IBAN + "\nSu cuenta ha sido creada, y dispone de " + balance + "\u20AC");
        return IBAN;
    }

}
