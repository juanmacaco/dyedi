package Programacion;

import java.util.Scanner;

public class Ejercicio_5 {
	public static void main(String[] args) {
//		Realizar un programa que trabaje del siguiente modo:
//			1. Mostrar un mensaje preguntando “¿Cuánto te gustaría ganar al año?”
//			2. Esperar a que el usuario conteste indicando una cantidad
//			3. Mostrar un nuevo mensaje “Tu sueldo mensual sería de xx euros” (calcular xx
//			dividiendo lo indicado por el usuario entre 12) 
		Scanner terminator = new Scanner(System.in);
		System.out.println("Cuanto te gustaría cobrar al año?");
		Integer sueldo = terminator.nextInt();
		System.out.println("Tu sueldo mensual sería de " + (sueldo / 12) + " euros mensuales");
		terminator.close();
	}
}
