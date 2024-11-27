package Programacion;

import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) {
//		Realizar un programa que haga lo siguiente:
//			1. Mostrar un mensaje pidiendo el nombre del usuario
//			2. Esperar a que el usuario escriba su nombre y registrarlo en una variable
//			3. Mostrar un nuevo mensaje pidiendo el apellido del usuario
//			4. Esperar a que el usuario escriba su apellido y registrarlo en otra variable
//			5. Mostrar un mensaje final indicando: "Su nombre completo es ... (nombre y apellido)"

		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame tu nombre: ");
		String nombre = terminator.nextLine();
		System.out.println("Dame tu apellido: ");
		String apellido = terminator.nextLine();
		System.out.println("Tu nombre completo es " + nombre + " " + apellido);
		terminator.close();
	}
}
