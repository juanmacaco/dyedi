package Programacion;

import java.util.Scanner;

public class Ejercicio_15 {
	public static void main(String[] args) {
//		Realizar un programa que calcule el IVA de un producto. Para ello tendremos que solicitar dos
//		datos al usuario: el precio sin IVA y el tipo de IVA. El tipo de IVA puede ser de cuatro tipos:
//		 Normal: 21%
//		 Reducido: 10%
//		 Superreducido: 4%
//		 Exento: 0%
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame el precio del producto: ");
		Double precio = terminator.nextDouble();
		System.out.println("Dame el porcentaje del IVA: ");
		Integer porcentaje = terminator.nextInt();
		
		if (porcentaje == 21) {
			System.out.println("Con este IVA el precio pasa de " + precio + " a un precio de " + ((precio*0.21) + precio));
		}
		if (porcentaje == 10) {
			System.out.println("Con este IVA el precio pasa de " + precio + " a un precio de " + ((precio*0.10) + precio));
		}if (porcentaje == 4) {
			System.out.println("Con este IVA el precio pasa de " + precio + " a un precio de " + ((precio*0.04) + precio));
		}if (porcentaje == 0) {
			System.out.println("Con este IVA el precio pasa de " + precio + " a un precio de " + precio);
		}
		terminator.close();
	}
}
