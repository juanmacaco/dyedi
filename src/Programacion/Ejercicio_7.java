package Programacion;

import java.util.Scanner;

public class Ejercicio_7 {
	public static void main(String[] args) {
//		Realizar un programa que calcule el IMC (índice de masa corporal). Para ello:
//			1. Solicita por consola al usuario cuál es su altura y su peso (en dos pasos)
//			2. Recoge los datos y calcula el IMC
//			3. Muestra por consola el resultado del IMC calculado
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dime tu altura en m: ");
		Double altura = terminator.nextDouble();
		System.out.println("Dame tu peso en kg: ");
		Double peso = terminator.nextDouble();
		System.out.println("Tu IMC es de " + (peso/(altura*altura)));
		terminator.close();
	}
}
