import java.util.Scanner;

public class Alta {

    static int numDni = (int) 00000000d;

    static short dia = 0;

    static short mes = 0;

    static short ano = 0;

    public static String nombre() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("introduzca sus datos\nNombre:");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos:");
        String apellidos = teclado.nextLine();
        while (nombre.equals("") || apellidos.equals("")) {
            if (nombre.equals("")) {
                System.out.println("error de entrada, escriba de nuevo su nombre");
                nombre = teclado.nextLine();
            } else if (apellidos.equals("")) {
                System.out.println("error de entrada, escriba de nuevo sus apellidos");
                apellidos = teclado.nextLine();
            }
        }

        System.out.println("Su nombre es " + nombre + " " + apellidos + "\n");
        return nombre + " " + apellidos;
    }


    public static String fecha() {

        Scanner teclado = new Scanner(System.in);
        while (dia > 31 || mes > 12 || ano > 2021 || dia < 1 || mes < 1 || ano < 1900){
            System.out.print("introduzca su fecha de nacimiento dd/mm/aaaa\ndia:");
            dia = teclado.nextShort();
            System.out.print("mes:");
            mes = teclado.nextShort();
            System.out.print("año:");
            ano = teclado.nextShort();
        }



        System.out.printf("\nSe ha registrado su fecha de nacimiento como: %02d/%02d/%02d", dia, mes, ano);
        System.out.println("\n");

        String fecha = "" + dia + "/" + mes + "/" + ano;
        return fecha;
    }

    public static int numDni() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su numero de DNI (Únicamente el numero):");
        numDni = teclado.nextInt();

        while (String.valueOf(numDni).length() != 8) {
            System.out.println("Error de entrada, el Número de DNI no tiene la longitud correcta\nIntroduzcalo de nuevo");
            numDni = teclado.nextInt();
        }


        return numDni;
    }


    public static String letraDni() {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la letra de su DNI en mayúscula:");
        char letraDni = teclado.next().charAt(0);
        System.out.println("Su DNI es " + Alta.numDni + letraDni + " y se ha guardado correctamente");
        return Character.toString(letraDni);
    }

    public static String correo() {

        Scanner teclado = new Scanner(System.in);

        String correoIntroducido;
        do {
            System.out.print("\nPor favor introduzca su direccion de correo UPM: ");
            correoIntroducido = teclado.nextLine();
        } while (!correoIntroducido.contains("@alumnos.upm.es") && !correoIntroducido.contains("@upm.es"));
        System.out.print("\nSu correo es correcto y ha sido guardado, su cuenta ha sido creada.\n");

        return correoIntroducido;
    }

}


