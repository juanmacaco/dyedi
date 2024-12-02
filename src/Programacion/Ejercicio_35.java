package Programacion;

import java.util.Scanner;

public class Ejercicio_35 {
	public static void main(String[] args) {
//		Realizar un programa en JAVA que calcule los descuentos a aplicar a una compra según los
//		siguientes criterios:
//		- Si la compra es superior a 100 unidades, aplicar un 40% de descuento.
//		- Si la compara está entre 25 y 100 unidades, 20% de descuento
//		- Si la compra está entre 10 y 24 unidades, realizar un 10% de descuento.
//		- Si la compra es inferior a 10 unidades, no se aplica descuento.
//		Se nos pedirá por teclado Precio y Unidades. Se obtendrá como resultado el Subtotal a pagar,
//		el Descuento aplicado y el Total a pagar.
//		Por ejemplo, si indicamos precio 100 y unidades 50, el resultado será:
//		- Subtotal = 100 x 50 = 5000 euros
//		- Descuento = 20% de 5000 = 1000 euros
//		- Total = 5000 – 1000 = 4000 euros
//		(Trabajaremos con cifras decimales) 
		Scanner terminator = new Scanner(System.in);
		System.out.println("Cuantas unidades has comprado?: ");
		Double cant = terminator.nextDouble();
		System.out.println("Cual es el precio?: ");
		Double precio = terminator.nextDouble();
		
		if (cant > 100) {
			System.out.println("El subtotal es de " + precio + " x " + cant + " = " + (cant*precio));
			System.out.println("El descneto es de 40% de " + (cant*precio) + " = " + ((cant*precio)*0.4));
			System.out.println("El total es de " + ((cant*precio) - (cant*precio)*0.4));
		}
		if (cant < 100 && cant >= 25) {
			System.out.println("El subtotal es de " + precio + " x " + cant + " = " + (cant*precio));
			System.out.println("El descneto es de 20% de " + (cant*precio) + " = " + ((cant*precio)*0.2));
			System.out.println("El total es de " + ((cant*precio) - (cant*precio)*0.2));
		}
		if (cant < 24 && cant >= 10) {
			System.out.println("El subtotal es de " + precio + " x " + cant + " = " + (cant*precio));
			System.out.println("El descneto es de 10% de " + (cant*precio) + " = " + ((cant*precio)*0.1));
			System.out.println("El total es de " + ((cant*precio) - (cant*precio)*0.1));
		}
		if (cant < 10) {
			System.out.println("El subtotal es de " + precio + " x " + cant + " = " + (cant*precio));
			System.out.println("El descneto es de 0% de " + (cant*precio) + " = " + ((cant*precio)*0));
			System.out.println("El total es de " + ((cant*precio) - (cant*precio)*0));
		}
		terminator.close();
	}
}
