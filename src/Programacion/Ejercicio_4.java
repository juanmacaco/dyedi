package Programacion;

import java.util.Scanner;

public class Ejercicio_4 {
	public static void main(String[] args) {
//		Realizar un programa que trabaje del siguiente modo:
//			1. Mostrar un mensaje pidiendo el año de nacimiento del usuario
//			2. Esperar a que el usuario conteste
//			3. Mostrar un nuevo mensaje indicando la edad del usuario calculada restando el año
//			actual al año indicado por el usuario 
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame tu año de nacimiento: ");
		Integer ano = terminator.nextInt();
		System.out.println("Tu edad es de " + (2024-ano));
		terminator.close();
	}
}
