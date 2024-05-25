
package Ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Utilizando estructura de control: if-else");
        EstructuraIfElse estructuraIfElse = new EstructuraIfElse();
        estructuraIfElse.determinarPositivoNegativoCero();
        estructuraIfElse.verificarParImpar();
        estructuraIfElse.encontrarMayorDeTresNumeros();
        estructuraIfElse.determinarBisiesto();

        System.out.println("\nUtilizando estructura de control: bucles while");
        EstructuraBucleWhile estructuraBucleWhile = new EstructuraBucleWhile();
        estructuraBucleWhile.imprimirNumeros();
        estructuraBucleWhile.imprimirNumerosHastaN();
        estructuraBucleWhile.sumarNumerosPositivos();
        estructuraBucleWhile.generarSecuenciaFibonacci();

        System.out.println("\nUtilizando estructura de control: bucles for");
        EstructuraBucleFor estructuraBucleFor = new EstructuraBucleFor();
        estructuraBucleFor.imprimirNumerosPares();
        estructuraBucleFor.tablaMultiplicar();
        estructuraBucleFor.sumaParesHastaN();
        estructuraBucleFor.calcularFactorial();
    }
}
    
