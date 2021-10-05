import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.printf("PlaceHolder seleccion (alta, crear cuenta, deposito, extraccion, transferencia, prestamo, datos)\n");
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine();
        switch(entrada) {
            case "alta":
                System.out.printf("introduzca sus datos\nNombre:");
                String nombre = teclado.nextLine();
                switch (nombre) {
                    case "":
                        System.out.println("error de entrada, sin nombre no hay cuenta");
                        System.exit(1);
                    default:
                        break;
                }
                System.out.println("dia:");
                long dia = teclado.nextLong();
                System.out.println("mes:");
                long mes = teclado.nextLong();
                System.out.println("año:");
                long año = teclado.nextLong();
                if (dia < 32 && dia > 1 && mes>0 && mes < 13 && año<2022 && año > 1899) {
                    System.out.println("tu fecha de nacimiento se ha establecido a "+dia+"/"+mes+"/"+año);
                }else{
                    System.out.println("error de entrada. ¿estas seguro que naciste el "+dia+"/"+mes+"/"+año+"?");
                }


            break;
            case "crear cuenta":
                System.out.println("PH crear cuenta");
                break;
            case "deposito":
                System.out.println("PH deposito");
                break;
            case "extraccion":
                System.out.println("PH extraccion");
                break;
            case "transferencia":
                System.out.println("PH transferencia");
                break;
            case "prestamo":
                System.out.println("PH prestamo");
                break;
            case "datos":
                System.out.println("PH datos");
                break;
            default:
                System.out.println("PH error_de_entrada");
                break;
        }
    }
}
