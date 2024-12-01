package Programacion;

import java.util.Scanner;

public class Ejercicio_14 {
	public static void main(String[] args) {
//		Completar el ejercicio 7 del tema anterior para mostrar si el usuario tiene o no sobrepeso
//		siguiente esta guía:
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dime tu altura en m: ");
		Double altura = terminator.nextDouble();
		System.out.println("Dame tu peso en kg: ");
		Double peso = terminator.nextDouble();
		System.out.println("Tu IMC es de " + (peso/(altura*altura)));
		Double IMC = peso/(altura*altura);
		if (IMC < 18.5) {
			System.out.println("Tienes un peso inferior al normal");
		}
		if (IMC >= 18.5 && IMC < 24.9) {
			System.out.println("Tienes un peso normal");
		}
		if (IMC >= 25 && IMC < 29.9) {
			System.out.println("Tienes un peso superior al normal");
		}
		if (IMC >= 30) {
			System.out.println("Tienes sobrepeso");
		}
		terminator.close();
	}
}
