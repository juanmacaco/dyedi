package Programacion;

import java.util.Scanner;

public class EjercicioPrueba {
	public static void main(String[] args) {
		Scanner terminator = new Scanner(System.in);
		Integer[] listaNotas = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10};
		System.out.println("Que nota buscas?: ");
		Integer nota = terminator.nextInt();
		Integer cont = 0;
		
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] == nota) {
				System.out.println("Existe tal nota y esta en la posicion " + i);
				cont++;
				break;
			}
		}
		if (cont == 0) {
			System.out.println("Tal nota no existe");
		}
	}
}
