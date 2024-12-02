package Programacion;

import java.util.Scanner;

public class Ejercicio_49 {
	public static void main(String[] args) {
//		Realizar un programa que solicite una palabra al usuario y luego la escriba invertida. Por
//		ejemplo, si la palabra indicada es “indonesia”, el resultado debería ser “aisenodni” 
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame una frase: ");
		String frase = terminator.nextLine();
		for (int i = frase.length(); i > 0; i--) {
			System.out.print(frase.substring(i - 1, i));
		}
		terminator.close();
	}
}
