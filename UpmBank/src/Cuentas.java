import java.util.Scanner;

public class Cuentas {

    public static String SICA() {

        int c1, c2, a1, a2, a3, a4, b1, b2, b3, b4, ng1, ng2;

        String CE = "9010";
        a1 = 9;
        a2 = 0;
        a3 = 1;
        a4 = 0;
        String CS = "0201";
        b1 = 0;
        b2 = 2;
        b3 = 0;
        b4 = 1;

        long NC = 0;
        String SICA;

        int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
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

        NC = (d1 * 1000000000) + (d2 * 100000000) + (d3 * 10000000) + (d4 * 1000000) + (d5 * 100000) + (d6 * 10000) + (d7 * 1000) + (d8 * 100) + (d9 * 10) + d10;

        ng1 = ((6 * b4) + (3 * b3) + (7 * b2) + (9 * b1) + (10 * a4) + (5 * a3) + (8 * a2) + (4 * a1));
        int ca = 11 - (ng1 % 11);
        if (ca < 10) {
            c1 = ca;
        } else if (ca == 11) {
            c1 = 0;
        } else {
            c1 = 1;
        }

        ng2 = d1 + (2 * d2) + (4 * d3) + (8 * d4) + (5 * d5) + (10 * d6) + (9 * d7) + (7 * d8) + (3 * d9) + (6 * d10);
        int cb = 11 - (ng2 % 11);
        if (cb < 10) {
            c2 = cb;
        } else if (cb == 11) {
            c2 = 0;
        } else {
            c2 = 1;
        }

        SICA = (CE+CS+NC);
        return SICA;
    }


}
