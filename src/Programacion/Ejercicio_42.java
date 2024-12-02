package Programacion;

import java.util.Scanner;

public class Ejercicio_42 {
	public static void main(String[] args) {
//		Realizar un programa que solicite dos números enteros al usuario. Luego mostrar el siguiente
//		menú:
//		*** MENÚ ***
//		1. Sumar
//		2. Restar
//		3. Multiplicar
//		4. Dividir
//		0. Salir
//		Hacer con los dos números la operación elegida (el usuario indicará 1, 2, 3 o 4) y mostrar el
//		resultado. Luego volver a mostrar el menú. Si el usuario escoge la opción 0 (Salir), el programa
//		termina.
//		OJO: Si el segundo número es un cero, no se podrán dividir. En ese caso, si elige la opción 4,
//		tendremos que indicar que la división no es posible. 
		Scanner terminator = new Scanner(System.in);
		Integer num1 = 0;
		Integer num2 = 0;
		Integer eleccion = 0;
		do {
			System.out.println("Dame un numero");
			num1 = terminator.nextInt();
			System.out.println("Dame otro numero");
			num2 = terminator.nextInt();
			System.out.println("*** MENÚ ***");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			System.out.println("Que desea hacer? :");
			eleccion = terminator.nextInt();
			if (eleccion == 1) {
				System.out.println(num1 + num2);
			}
			if (eleccion == 2) {
				System.out.println(num1 - num2);
			}
			if (eleccion == 3) {
				System.out.println(num1 * num2);
			}
			if (eleccion == 4) {
				if (num1 == 0 || num2 == 0) {
					System.out.println("ERROR");
					break;
				}
				System.out.println(num1 / num2);
			}
			if (eleccion == 0) {
				System.out.println("Muchas gracias");
				break;
			}
			
		} while (eleccion >= 0 || eleccion <= 4);
		terminator.close();
	}
}
