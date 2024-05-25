/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class EstructuraIfElse {
    public void determinarPositivoNegativoCero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println(numero + " es positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " es negativo.");
        } else {
            System.out.println("El numero es cero.");
        }
    }

    public void verificarParImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }
    }

    public void encontrarMayorDeTresNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tres numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El mayor de los tres numeros es: " + mayor);
    }

    public void determinarBisiesto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
}
