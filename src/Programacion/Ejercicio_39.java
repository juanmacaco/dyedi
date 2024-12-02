package Programacion;

import java.util.Scanner;

public class Ejercicio_39 {
	public static void main(String[] args) {
//		Realizar un programa que solicite un texto al usuario. Si el texto comienza por “hola” y termina
//		con “hastaluego”, le indicaremos que lo hemos entendido, e imprimiremos el mensaje que hay
//		entre esas dos palabras.
//		Por ejemplo, si el usuario escribe “hola cómo estás hastaluego”
//		Debemos decir: Lo he entendido. Mensaje: cómo estás.
//		Si el texto no cumple estos requisitos, le indicaremos que no lo hemos entendido, y que nos lo
//		repita otra vez. 
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
		terminator.close();
	}
}
