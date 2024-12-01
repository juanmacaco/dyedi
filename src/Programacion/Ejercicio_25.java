package Programacion;

import java.util.Scanner;

public class Ejercicio_25 {
	public static void main(String[] args) {
//		Realizar un programa que solicite un texto por teclado. A continuación, dividir el texto en
//		trozos de 5 caracteres cada uno que iremos imprimiendo por consola. Por ejemplo, si el texto
//		indicado es: “Buenos días, mi nombre es Blau Blau.” El resultado tendrá que ser:
//		Bueno
//		s día
//		s, mi
//		 nomb
//		re es
//		 Blau
//		 Blau
//		. 
		Scanner terminator = new Scanner(System.in);
		Integer cont = 0;
		System.out.println("Dame un texto: ");
		String texto = terminator.nextLine();
		String[] array = texto.split("");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			cont++;
			if (cont == 5) {
				System.out.println();
				cont = 0;
			}
		}
		terminator.close();
	}
}
