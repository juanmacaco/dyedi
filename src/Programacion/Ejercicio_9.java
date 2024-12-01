package Programacion;

import java.util.Scanner;

public class Ejercicio_9 {
	public static void main(String[] args) {
//		Realizar un programa que solicite el radio de un círculo y nos indique a continuación cuál es la
//		circunferencia y el área de dicho círculo como resultado.
//		Utiliza las constantes de Java cuando consideres oportuno
		
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame el radio de una circunferencia: ");
		Integer radio = terminator.nextInt();
		System.out.println("La circunferencia de tu circulo de radio dado es de " + (2*3.14*radio) + " cm y el area del mismo es de " + (3.14*(radio*radio)) + " cm cuadrados");
		terminator.close();
	}
}
