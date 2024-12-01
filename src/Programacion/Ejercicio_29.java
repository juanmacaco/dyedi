package Programacion;

import java.util.Scanner;

public class Ejercicio_29 {
	public static void main(String[] args) {
//		Repetir el ejercicio 6 utilizando una estructura FOR. 
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame tu nombre: ");
		String nombre = terminator.nextLine();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Te llamas " + nombre + ". Linea "+ i);
		}
		terminator.close();
	}
}
