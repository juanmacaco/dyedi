package Programacion;

import java.util.Scanner;

public class Ejercicio_6 {
	public static void main(String[] args) {
//		Realizar un programa que calcule el IVA de un artículo. Para ello:
//			1. Solicita por consola al usuario cuál es el precio sin IVA del artículo (puede llevar
//			decimales)
//			2. Recoge el dato y calcula el IVA (21%)
//			3. Muestra como resultado en la consola el IVA calculado y el precio final (la suma del
//			precio sin IVA más el IVA)
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dime el precio sin IVA: ");
		Double precio = terminator.nextDouble();
		System.out.println("El precio original: " + precio + " mas el añadido de " + (precio*0.21) + " hacen un total de " + (precio + (precio*0.21)));
		terminator.close();
	}
}
