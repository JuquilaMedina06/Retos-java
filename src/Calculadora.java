/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juqui
 */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;

        do {
            System.out.println("------ Calculadora ------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Módulo");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingresa el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado de la suma: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado de la resta: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado de la multiplicación: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado de la división: " + resultado);
                        } else {
                            System.out.println("Error: División por cero.");
                        }
                        break;
                    case 5:
                        if (num2 != 0) {
                            resultado = num1 % num2;
                            System.out.println("Resultado del módulo: " + resultado);
                        } else {
                            System.out.println("Error: División por cero.");
                        }
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } else if (opcion != 6) {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 6);

        System.out.println("¡Adiós!");
        scanner.close();
    }
}