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
                switch (nombre){
                    case "":
                        System.out.println("error de entrada, sin nombre no hay cuenta");
                        break;
                    default:
                        System.out.println("fecha de nacimiento en formato DD/MM/AAAA:\n");/*aqui estoy intentando fijar un formato de fecha de nacimiento, evitando que el dia, mes y año sea menor que 1, evitando que el dia y el mes sean mayores que 12 y evitando que el año sea mayor que 2021*/
                        int dia, mes, año;
                        if (dia)  /*esto lo pongo solo para marcar que aqui acaba el codigo incompleto, ya lo hare en casita*/
                        break;
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
