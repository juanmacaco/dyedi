package Programacion;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
//		Realizar un programa que trabaje del siguiente modo:
//			1. Mostrar un mensaje pidiendo el nombre del usuario
//			2. Esperar a que el usuario escriba su nombre
//			3. Mostrar un nuevo mensaje indicando: “Bienvenido (nombre)”
//			4. Mostrar un nuevo mensaje indicando: “¿De dónde eres?”
//			5. Esperar a que el usuario escriba el lugar de donde vive
//			6. Mostrar un mensaje preguntando: “¿Qué tal se vive en (localidad)?”
//			7. Esperar a que el usuario escriba una respuesta
//			8. Mostrar un último mensaje indicando “Gracias. Un saludo”
		
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame tu nombre: ");
		String nombre = terminator.nextLine();
		System.out.println("Bienvenido " + nombre);
		System.out.println("De donde eres?: ");
		String localidad = terminator.nextLine();
		System.out.println("Que tal se vive en " + localidad + " ?");
		terminator.nextLine();
		System.out.println("Me alegro, gracias");
		terminator.close();
	}
}
