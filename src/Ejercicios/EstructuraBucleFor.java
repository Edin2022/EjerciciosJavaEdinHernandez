/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class EstructuraBucleFor {
    public void imprimirNumerosPares() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void tablaMultiplicar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para obtener su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public void sumaParesHastaN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int n = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los números pares hasta " + n + " es: " + suma);
    }

    public void calcularFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para calcular su factorial: ");
        int numero = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
