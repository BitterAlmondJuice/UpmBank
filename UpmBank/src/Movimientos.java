import java.util.Scanner;

public class Movimientos {

    public static int deposito(String IBAN) {

        int deposito = 0;
        Scanner teclado = new Scanner(System.in);
        if (!IBAN.equals("")) {
            System.out.println(IBAN);
            System.out.println("Introduzca el valor que desea depositar en " + IBAN + " \n :");
            deposito = teclado.nextInt();
            System.out.println("Se han ingresado " + deposito + "\u20AC");
        }
        else if (IBAN.equals("")) {
            System.out.println("No puede depositar dinero a una cuenta si no dispone de una cuenta");
            deposito = 0;
        }
        return deposito;
    }

    public static int retirada(String IBAN) {

        int retirada = 0;
        Scanner teclado = new Scanner(System.in);
        if (!IBAN.equals("")) {
            System.out.println(IBAN);
            System.out.println("Introduzca la cantidad a retirar de " + IBAN + " \n :");
            retirada = teclado.nextInt();
            System.out.println("Se han retirado " + retirada + "\u20AC");
        }
        else if (IBAN.equals(""));

        {
            System.out.println("No puede retirar dinero de una cuenta si no dispone de una cuenta");
            retirada = 0;
        }
        return retirada;
    }


    public static String ibanEmisor(){
        String ibanEmisor;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el número de cuenta emisor: ");
        ibanEmisor = teclado.nextLine();

        return ibanEmisor;
    }

    public static String ibanReceptor(){
        String ibanReceptor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el número de cuenta receptor: ");
        ibanReceptor = entrada.nextLine();

        return ibanReceptor;
    }
    public static boolean numTest(String IBAN){
        String comprobar = "0";
        long test;
        boolean prueba;

        for (int i = 0; i<=7; ++i){
            comprobar = comprobar + IBAN.charAt(i);
        }
        test = Long.parseLong(comprobar);
        if (test == 90100201){
            prueba = true;
        }
        else{
            prueba = false;
        }
        return prueba;
    }
    public static int transferencia(String ibanEmisor, String ibanReceptor){
        int dinero = 0;
        Scanner teclado = new Scanner(System.in);
        boolean prueba1, prueba2;
        prueba1 = numTest(ibanEmisor);
        prueba2 = numTest(ibanReceptor);
        if (prueba1 && prueba2) {
            System.out.println("Introduzca la cantidad que desea transeferir: ");
            dinero = teclado.nextInt();
            System.out.println("Transferencia Realizada");
        }
        else{
            dinero = 0;
        }
        return dinero;}

}

