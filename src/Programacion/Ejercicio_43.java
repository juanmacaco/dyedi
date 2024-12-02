package Programacion;

import java.util.Scanner;

public class Ejercicio_43 {
	public static void main(String[] args) {
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame el tamaño del tablero: ");
		Integer tamano = terminator.nextInt();
		
		for (int i = 0; i <= tamano; i++) {
				System.out.println();
			for (int j = 0; j < tamano; j++) {
				if (i == 0) {
					System.out.print(" ___");
				} 
				else {
					System.out.print("|___");
				}
				if (j == tamano - 1 && i != 0) {
					System.out.print("|");
				}
			}
		}
		terminator.close();
	}
}
