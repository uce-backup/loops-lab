package programming.loops;

import java.util.Scanner;

public class LoopsApp {

    public static void main(String[] args) {
        final int EXIT_OPTION = 0;
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Factorial");
            System.out.println("2. Numero primo");
            System.out.println("3. Número al revés");
            System.out.println("4. Binario");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Triángulo");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            option = input.nextInt();
            if (option == EXIT_OPTION) {
                break;
            }
            System.out.print("Número: ");
            int number = input.nextInt();
            switch (option) {
                case 1 -> System.out.println(number + "! = " + Loops.factorial(number));
                case 2 -> System.out.println(Loops.isPrime(number) ? "Es primo" : "No es primo");
                case 3 -> System.out.println("Al revés: " + Loops.reverse(number));
                case 4 -> System.out.println("Binario: " + Loops.toBinary(number));
                case 5 -> System.out.print(Loops.multiplicationTable(number));
                case 6 -> System.out.print(Loops.triangle(number));
                default -> System.out.println("Opción inválida");
            }
        } while (true);
        System.out.println("Hasta luego");
    }
}