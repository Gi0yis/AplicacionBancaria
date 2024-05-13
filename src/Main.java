import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner opcionUsuario = new Scanner(System.in);
        String nombreCliente = "Juan Perez";
        String tipoDeCuenta = "Corriente";
        double saldoDisponible = 1599.99;
        String menu = """
                **** Escriba el número de la opcion deseada ****
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                4 - Salir
                """;

        System.out.println("*".repeat(48));
        System.out.println("\nNombre del cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta + "\n");
        System.out.println("*".repeat(48));

        for (int i = 0; i < 1;) {
            System.out.println(menu);
            int opcion = opcionUsuario.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Saldo disponible: " + saldoDisponible);
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que deseas retirar?");
                    double cantidadRetirada = opcionUsuario.nextDouble();

                    if (cantidadRetirada <= saldoDisponible){
                        saldoDisponible -= cantidadRetirada;
                        System.out.println("Saldo disponible actualizado: " + saldoDisponible + "$");
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor que deseas depositar?");
                    double cantidadIngresada = opcionUsuario.nextDouble();
                    saldoDisponible += cantidadIngresada;
                    System.out.println("Saldo disponible actualizado: " + saldoDisponible + "$");
                    break;
                case 4:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    i = 1;
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}