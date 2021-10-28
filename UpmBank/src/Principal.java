import java.util.Scanner;

public class Principal {

    public static void menu() {

        double cuota = 0, intereses = 0.03, ultimaTransferencia = 0, balance = 0, ultimoDeposito = 0, ultimaExtraccion = 0, valorPrestamo = 0;
        short duracionPrestamo = 0;
        String numDni;
        String letraDni;
        String nombre = "", IBAN = "", correo = "", fechaNacimiento = "", DNI = "", ibanEmisor = "", ibanreceptor = "";
        Scanner teclado = new Scanner(System.in);


        int entrada;
        do {
            System.out.print("Seleccione la operacion que desea realizar\nalta (1),  crear cuenta (2),   deposito (3),   extraccion (4),\ntransferencia (5),  prestamo (6),   datos de cuenta(7),\nSalir (8)\n");
            entrada = teclado.nextInt();

            if (entrada == 1) {

                nombre = Alta.nombre();
                fechaNacimiento = Alta.fecha();
                numDni = Alta.numDni();
                letraDni = Alta.letraDni();
                correo = Alta.correo();
                DNI = numDni + letraDni;
                System.out.println("nombre: " + nombre + "\nfecha de nacimiento: " + fechaNacimiento + "\nDNI: " + numDni + letraDni + "\nemail: " + correo + "\n");
                System.out.println(fechaNacimiento);

            }
            else if (entrada == 2) {
                IBAN = Cuentas.cuenta();
            }
            else if (entrada == 3) {
                System.out.println("PH deposito");
                ultimoDeposito = Movimientos.deposito(IBAN);
                balance = balance + ultimoDeposito;
            }
            else if (entrada == 4) {
                System.out.println("PH extraccion");
                ultimaExtraccion = Movimientos.retirada(IBAN);
                balance = balance - ultimaExtraccion;
            }
            else if (entrada == 5) {
                System.out.println("PH transferencia");
                ibanEmisor = Movimientos.ibanEmisor();
                ibanreceptor = Movimientos.ibanReceptor();
                ultimaTransferencia = Movimientos.transferencia(ibanEmisor, ibanreceptor);
                balance = balance - ultimaTransferencia;
            }
            else if (entrada == 6) {
                System.out.println("PH prestamo");
                valorPrestamo = Prestamo.prestamo();
                balance = balance + valorPrestamo;
                duracionPrestamo = (short) Prestamo.meses();
                cuota = Prestamo.cuota(duracionPrestamo, valorPrestamo, intereses);
                Prestamo.tablaAmortización(valorPrestamo, duracionPrestamo, cuota, intereses);
            }
            else if (entrada == 7) {
                Datos.datos(nombre, fechaNacimiento, DNI, correo, IBAN, balance, ultimoDeposito, ultimaExtraccion, ultimaTransferencia, ibanEmisor, ibanreceptor, valorPrestamo, duracionPrestamo, cuota, intereses);
            }
            else if (entrada == 8) {
                System.out.println("aDiOs");
            }
            else {
                System.out.println("Error de entrada, por favor, intentelo de nuevo");

            }

        } while (entrada != 8);
    }

    public static void main(String[] args) {

        menu();
    }

}

