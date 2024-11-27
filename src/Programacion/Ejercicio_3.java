package Programacion;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
//	Realizar un programa que trabaje del siguiente modo:
//		1. Mostrar un mensaje pidiendo la edad del usuario
//		2. Esperar a que el usuario escriba su edad y almacenarla en una variable
//		3. Mostrar un nuevo mensaje indicando “Su edad es de xx años” 
		
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame tu edad: ");
		Integer edad = terminator.nextInt();
		System.out.println("Su edad es de " + edad + " años");
		terminator.close();
	}
}
