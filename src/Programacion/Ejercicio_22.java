package Programacion;

import java.util.Scanner;

public class Ejercicio_22 {
	public static void main(String[] args) {
//		Realizar un programa que solicite dos cadenas al usuario por separado. Si alguna de las dos es
//		vacía o sólo tiene espacios en blanco, volver a pedirla indefinidamente. Cuando tengamos las
//		dos cadenas, escribirlas por consola en orden alfabético. 	
		Scanner terminator = new Scanner(System.in);
		String frase1 = "a";
		String frase2 = "b";
		do {
			System.out.println("Dame una frase: ");
			frase1 = terminator.nextLine();
			System.out.println("Dame otra frase: ");
			frase2 = terminator.nextLine();
		} while (frase1.isBlank() || frase2.isBlank());
		Integer comparacion = frase1.compareTo(frase2);
		if (comparacion <= 0) {
			System.out.println(frase1);
			System.out.println(frase2);
		}
		else {
			System.out.println(frase2);
			System.out.println(frase1);
		}
		terminator.close();
	}
}
