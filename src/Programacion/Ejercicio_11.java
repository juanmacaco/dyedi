package Programacion;

import java.util.Scanner;

public class Ejercicio_11 {
	public static void main(String[] args) {
//		Repite el ejercicio anterior, pero con la restricción de que sólo podrás leer desde el teclado
//		datos de tipo String. Es decir, sólo podrás usar el método “nextLine()” del Scanner.
//		PISTA: Tendrás que aplicar una conversión de tipos.
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame un numero: ");
		String num1 = terminator.nextLine();
		Integer num1_1 = Integer.parseInt(num1);
		System.out.println("Dame otro numero: ");
		String num2 = terminator.nextLine();
		Integer num2_2 = Integer.parseInt(num2);
		System.out.println(num1_1*num2_2);
		terminator.close();
	}
}
