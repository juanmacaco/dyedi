package Programacion;

import java.util.Scanner;

public class Ejercicio_20 {
	public static void main(String[] args) {
//		Repetir el ejercicio anterior, pero con cadenas. Además, cuando comparemos si son iguales, no
//		tendremos en cuenta ni los espacios que pueda haber al inicio o al final de cada cadena, ni
//		tampoco las mayúsculas o minúsculas. 
		Scanner terminator = new Scanner(System.in);
		String frase1 = "a";
		String frase2 = "b";
		
		do {
			System.out.println("Dame una frase: ");
			frase1 = terminator.nextLine();
			System.out.println("Dame otra frase: ");
			frase2 = terminator.nextLine();
			
		} while (!frase1.equalsIgnoreCase(frase2) || frase1.trim() == frase2.trim());
		System.out.println("Gracias, un saludo");
		terminator.close();
	}
}
