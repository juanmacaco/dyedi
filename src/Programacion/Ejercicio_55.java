package Programacion;

import java.util.Scanner;

public class Ejercicio_55 {
	public static void main(String[] args) {
//		Realizar un programa que solicite un número mayor a 0 al usuario. Si no es así, volver a
//		solicitarlo. A continuación, calcular la suma de todos los números impares que hay entre 1 y el
//		número indicado. Mostrarlo por consola.
//		(Un número impar es aquel que al dividirlo entre 2 el resto es 1)
		Scanner terminator = new Scanner(System.in);
		Integer num;
		Integer sum = 0;
		do {
			System.out.println("Dame un numero: ");
			num = terminator.nextInt();
			if (num <= 0) {
				System.out.println("Numero no valido");
			}
		} while (num < 0);
		for (int i = 0; i <= num; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		terminator.close();
	}
}
