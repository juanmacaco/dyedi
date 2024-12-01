package Programacion;

public class Ejercicio_31 {
	public static void main(String[] args) {
//		Realizar un programa que imprima por consola un triángulo de números así: (será necesario
//		utilizar un doble bucle) 
		for (int i = 1; i < 10; i++) {
			System.out.println();
			for (int j = 1; j <= 10; j++) {
				System.out.print(j);
				if (i==j) {
					break;
				}
			}
		}
	}
}
