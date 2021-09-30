import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        System.out.printf("PlaceHolder seleccion (alta, crear cuenta, deposito, extraccion, transferencia, prestamo, datos\n)");
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine();
        switch(entrada) {
            case "alta":
                System.out.println("PH alta");
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
