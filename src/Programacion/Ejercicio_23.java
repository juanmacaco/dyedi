package Programacion;

import java.util.Scanner;

public class Ejercicio_23 {
	public static void main(String[] args) {
//		Realizar un programa que solicite un email. A continuación, debemos validar el formato de ese
//		email. Si es correcto, terminamos. Si no es correcto, volvemos a solicitarlo.
//		Para validar el email tendremos que revisar que:
//		a) Contiene una @
//		b) Contiene un punto después de la @, pero no inmediatamente después.
//		c) No puede terminar con el punto 
		Scanner terminator = new Scanner(System.in);
		String correo = "a";
		do {
			System.out.println("Dame tu correo: ");
			correo = terminator.nextLine();
			
		} while (!correo.contains("@") || correo.endsWith("."));
		System.out.println("Muchas gracias rey");
		terminator.close();
	}
}
