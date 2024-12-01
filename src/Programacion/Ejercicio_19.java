package Programacion;

import java.util.Scanner;

public class Ejercicio_19 {
	public static void main(String[] args) {
//		Realizar un programa que solicite dos números al usuario. Si los números son iguales, terminar
//		el programa con un saludo. Si no son iguales, volver a pedirlos hasta que lo sean. 
		Scanner terminator = new Scanner(System.in);
		Integer num1 = 0;
		Integer num2 = 1;
		
		do {
			System.out.println("Dame un numero:");
			num1 = terminator.nextInt();
			System.out.println("Dame otro numero: ");
			num2 = terminator.nextInt();
		} while (num1 != num2);
		System.out.println("Gracias, un saludo");
		terminator.close();
	}
}
