package Programacion;

import java.util.Scanner;

public class Ejercicio_27 {
	public static void main(String[] args) {
//		Repetir el ejercicio anterior con una estructura FOR.
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame un numero: ");
		Integer num = terminator.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " + " + i + " = " + (num*i));
		}
		terminator.close();
	}
}
