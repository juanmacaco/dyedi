package Programacion;

import java.util.Scanner;

public class Ejercicio_44 {
	public static void main(String[] args) {
//		Realizar un programa que de manera continua vaya pidiendo frases al usuario. El programa
//		deberá ir guardando todas las frases en una variable. Cuando el usuario escriba la frase “FIN”,
//		el programa terminará y mostrará por consola todo el texto que ha ido almacenando.
//		La palabra “FIN” se podrá escribir de cualquier forma. Por ejemplo “Fin” o “fin”, etc.
		Scanner terminator = new Scanner(System.in);
		String cont = "";
		String frase = "";
		do {
			System.out.println("Dame una frase");
			frase = terminator.nextLine();
			cont += frase;
		} while (!frase.equalsIgnoreCase("FIN"));
		System.out.println(cont);
		terminator.close();
	}
}
