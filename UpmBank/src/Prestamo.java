import java.util.Scanner;

public class Prestamo {


    public static long prestamo() {

        long valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el capital que desearía: ");
        valor = teclado.nextLong();
        return valor;
    }

    public static long meses() {

        short anos;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero de años para pagar");
        anos = entrada.nextShort();
        anos = (short) (anos * 12);
        return anos;
    }

    public static double cuota(long meses, double capital, double intereses) {

        double cuota;
        double interesesMensuales = intereses / 12;
        System.out.println("Ha contratado un prestamo con un valor de " + capital + "\u20AC, a un interés del " + intereses * 100 + "%, a " + meses / 12 + " años");

        cuota = capital * interesesMensuales * (Math.pow(1 + interesesMensuales, meses)) / ((Math.pow(1 + interesesMensuales, meses)) - 1);
        cuota = (double)Math.round(cuota*100)/100;
        System.out.println("Su cuota será de " + cuota);
        return cuota;
    }

    public static void tablaAmortización(double capital, short meses, double cuota, double intereses) {

        System.out.println("\t\t\tPAGO MENSUAL\tINTERESES\t\tAMORTIZADO\t\tCAPITAL VIVO\n");

        double interesesMensuales = intereses / 12;
        double Capital = (double) capital;


        double interesAbonadoAnterior = 0;
        double interesAbonado = 0;

        double capitalAmortizadoAnterior = 0;
        double capitalAmortizado = 0;

        double capitalVivoAnterior = 0;
        double capitalVivo = 0;
        for (int i = 0; i <= meses; ++i) {


            if (i == 0) {
                System.out.print(i);
                System.out.print("\t\t\t\t   0,00");
                System.out.print("\t\t\t  0,00");
                System.out.print("\t\t\t  0,00");
                System.out.printf("\t\t%012.2f", Capital);

                interesAbonadoAnterior = 0;
                capitalAmortizadoAnterior = 0;
                capitalVivoAnterior = Capital;
            }
            else {
                interesAbonado = (capitalVivoAnterior * interesesMensuales);
                capitalAmortizado = (cuota - interesAbonado);
                capitalVivo = capitalVivoAnterior - capitalAmortizado;

                System.out.print("\n" + i);
                System.out.printf("\t\t\t%011.2f", cuota);
                System.out.printf("\t\t%010.2f", interesAbonado);
                System.out.printf("\t\t%010.2f", capitalAmortizado);
                System.out.printf("\t\t%012.2f", capitalVivo);

                interesAbonadoAnterior = interesAbonado;
                capitalAmortizadoAnterior = capitalAmortizado;
                capitalVivoAnterior = capitalVivo;
            }
        }
        System.out.print("\n");
    }

}
