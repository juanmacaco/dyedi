package Programacion;

import java.util.Scanner;

public class Ejercicio_40 {
	public static void main(String[] args) {
//		Mejorar el ejercicio anterior para que cuando entendamos el mensaje, volvamos a pedir otro
//		nuevo continuamente. Lo haremos hasta que el mensaje, en lugar de terminar en
//		“hastaluego”, termine en “adiós” 
		
		Scanner terminator = new Scanner(System.in);
		String frase = "";
		do {
			System.out.println("Dame un texto: ");
			frase = terminator.nextLine();
			if (!frase.startsWith("hola") || !frase.endsWith("hastaluego")) {
				System.out.println("ERROR");
			}
			if (frase.startsWith("hola") && frase.endsWith("hastaluego")) {
				System.out.println(frase);
				break;
			}
		} while (!frase.startsWith("hola") || !frase.endsWith("hastaluego"));
		String frase2 = "";
		do {
			System.out.println("Dame un texto: ");
			frase2 = terminator.nextLine();
			if (!frase2.startsWith("hastaluego") || !frase2.endsWith("adios")) {
				System.out.println("ERROR");
			}
			if (frase2.startsWith("hastaluego") && frase2.endsWith("adios")) {
				System.out.println(frase2);
				break;
			}
		} while (!frase2.startsWith("hastaluego") || !frase2.endsWith("adios"));
		terminator.close();
	}
}
