package Programacion;

import java.util.Scanner;

public class Ejercicio_18 {
	public static void main(String[] args) {
//		Realizar un programa que muestre por consola 5 veces tu nombre utilizando un bucle. Además
//		de tu nombre, deberá aparecer el número de línea que se ha impreso. Es decir, la salida
//		tendría que ser algo así:
//		Mi nombre es Abel. Línea 1
//		Mi nombre es Abel. Línea 2
//		Mi nombre es Abel. Línea 3
//		Mi nombre es Abel. Línea 4
//		Mi nombre es Abel. Línea 5 	
		Scanner terminator = new Scanner(System.in);
		System.out.println("Como te llamas: ");
		String nombre = terminator.nextLine();
		Integer cont = 1;
		while (cont <= 5) {
			System.out.println("Tu nombre es "+ nombre + ". Linea "+ cont);
			cont++;
		}
		terminator.close();
	}
}
