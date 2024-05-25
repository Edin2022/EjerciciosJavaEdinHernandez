/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class EstructuraBucleWhile {
    public void imprimirNumeros() {
        int i = 1;
        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public void imprimirNumerosHastaN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        int i = 1;
        while (i <= numero) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public void sumarNumerosPositivos() {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese un numero positivo (ingrese un numero negativo para detener): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0);

        System.out.println("La suma de los numeros positivos ingresados es: " + suma);
    }

    public void generarSecuenciaFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero para generar la secuencia de Fibonacci: ");
        int limite = scanner.nextInt();

        int num1 = 0, num2 = 1;
        System.out.println("Secuencia de Fibonacci hasta " + limite + ":");
        System.out.print(num1 + " ");
        while (num2 <= limite) {
            System.out.print(num2 + " ");
            int temp = num2;
            num2 += num1;
            num1 = temp;
        }
        System.out.println();
    }
}