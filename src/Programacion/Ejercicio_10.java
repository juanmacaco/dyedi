package Programacion;

import java.util.Scanner;

public class Ejercicio_10 {
	public static void main(String[] args) {
//		Realiza un programa que solicite dos números enteros y los multiplique. Mostrará el resultado
//		de esa multiplicación.
//		Prueba a introducir números muy grandes. ¿Qué ocurre? ¿Cómo podemos resolverlo? 
		
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame un numero: ");
		Long num1 = terminator.nextLong();
		System.out.println("Dame otro numero: ");
		Long num2 = terminator.nextLong();
		System.out.println(num1*num2);
		terminator.close();
	}
}
