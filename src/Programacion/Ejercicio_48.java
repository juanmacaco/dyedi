package Programacion;

import java.util.Scanner;

public class Ejercicio_48 {
	public static void main(String[] args) {
//		Realizar un programa que solicite un número N al usuario. N tiene que ser mayor a 2. Si no,
//		volver a solicitarlo.
//		A continuación, mostrar los primeros N números de la serie de Fibonacci. Esta serie se calcula
//		sumando los dos últimos números. Por ejemplo, los 13 primeros números de Fibonacci son:
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame un numerin: ");
		Integer num = terminator.nextInt();
		Integer a = 0;
		Integer b = 1;
		Integer suma = a + b;
		for (int i = 0; i <= num; i++) {
			System.out.print(a + ", ");
			a = b;
			b = suma;
			suma = a + b;
		}
		terminator.close();
	}
}
