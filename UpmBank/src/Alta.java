import java.util.Scanner;

public class Alta {
    public static String nombre() {
        Scanner teclado = new Scanner(System.in);
        String nombre, apellidos;
        System.out.printf("introduzca sus datos\nNombre:");
        nombre = teclado.nextLine();
        System.out.printf("Apellidos:");
        apellidos = teclado.nextLine();
        if (nombre == "") {
            System.out.println("error de entrada, compruebe que ha escrito el nombre correctamente");
            
        } else if (apellidos == "") {
            System.out.println("error de entrada, compruebe que ha escrito los apellidos correctamente");
        } else {
        }
        return nombre + " " + apellidos;
    }


    public static String fechaNacimiento() {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, año;
        System.out.printf("introduzca su fecha de nacimiento\ndia:");
        dia = teclado.nextInt();
        System.out.printf("mes:");
        mes = teclado.nextInt();
        System.out.printf("año:");
        año = teclado.nextInt();

        if (dia > 31 && dia < 1 && mes < 1 && mes > 12 && año > 2021 && año < 1900) {
            System.out.println("error de entrada. ¿estas seguro que naciste el " + dia + "/" + mes + "/" + año + "?");

        } else {
        }
        String fecha = "" + dia + "/" + mes + "/" + año;
        return fecha;
    }
}

