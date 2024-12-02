package Programacion;

import java.util.Scanner;

public class Ejercicio_51 {
	public static void main(String[] args) {
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame un numero: ");
		Integer num = terminator.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println();
			for (int j = 0; j < num; j++) {
				if (j == i) {
					System.out.print(" * ");
				}	
				else {
					System.out.print(" - ");
				}
			}
			terminator.close();
		}
	}
}
