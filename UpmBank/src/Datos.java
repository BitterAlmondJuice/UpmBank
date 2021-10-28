public class Datos {

    public static void datos(String nombre, String fechaNacimiento, String DNI, String correo, String IBAN, double balance, double ultimoDeposito, double ultimaExtraccion, double ultimaTransferencia, String ibanEmisor, String ibanReceptor, double valorPrestamo,
                             short duracionPrestamo, double cuota, double intereses) {

        System.out.println("Los datos de su cuenta:");
        if (ultimoDeposito != 0) {
            ultimoDeposito(ultimoDeposito);
        }
        if (ultimaExtraccion != 0) {
            ultimaExtraccion(ultimaExtraccion);
        }
        if (ultimaTransferencia != 0) {
            ultimaTransferencia(ultimaTransferencia, ibanEmisor, ibanReceptor);
        }
        if (valorPrestamo != 0) {
            prestamo(valorPrestamo, duracionPrestamo, cuota, intereses);
        }
        if (!nombre.equals("") && !IBAN.equals("")) {
            datosUsuario(nombre, DNI, fechaNacimiento, correo, IBAN);
            balance(balance);
        }
        else {
            System.out.println("no existe ningun usuario guardado\n");
        }


    }

    private static void ultimoDeposito(double ultimoDeposito) {

        System.out.println("El valor de su ultimo deposito es de: " + ultimoDeposito + "\u20AC");
    }

    public static void balance(double balance) {

        System.out.println("Su balance actual es: " + balance + "\u20AC");
    }

    private static void ultimaTransferencia(double ultimaTransferencia, String ibanEmisor, String ibanReceptor) {

        System.out.println("El valor de su ultima transferencia es de: " + ultimaTransferencia + "\u20AC");
        System.out.println("El emisor fue " + ibanEmisor + " y el receptor fue " + ibanReceptor);
    }

    private static void ultimaExtraccion(double ultimaExtraccion) {

        System.out.println("El valor de su ultima extraccion es de: " + ultimaExtraccion + "\u20AC");
    }

    private static void prestamo(double capitalPrestado, long duracionPrestamo, double cuota, double interes) {

        System.out.println("Usted ha adquirido un prestamo de " + capitalPrestado + "\u20AC");
        System.out.println("Con una duracion de " + duracionPrestamo + " años");
        System.out.println("Con un interes de " + interes * 100 + "%");
        System.out.println("Con una cuota mensual de " + cuota + "\u20AC");
    }


    private static void datosUsuario(String nombre, String DNI, String fechaNacimiento, String correo, String IBAN) {

        short dia, mes, ano;

        dia = (short) ((fechaNacimiento.charAt(0) * 10) + fechaNacimiento.charAt(1));
        mes = (short) ((fechaNacimiento.charAt(3) * 10) + fechaNacimiento.charAt(4));
        ano = (short) ((fechaNacimiento.charAt(6) * 1000) + (fechaNacimiento.charAt(7) * 100) + (fechaNacimiento.charAt(8) * 10) + fechaNacimiento.charAt(9));

        System.out.println("nombre: " + nombre);
        System.out.println("DNI: " + DNI);
        System.out.println("Fecha de nacimiento: " + dia + "/" + mes + "/" + ano);
        System.out.println("Correo: " + correo);
        System.out.println("Número de cuenta: " + IBAN);
    }

}

