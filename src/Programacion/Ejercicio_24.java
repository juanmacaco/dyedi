package Programacion;

import java.util.Scanner;

public class Ejercicio_24 {
	public static void main(String[] args) {
//		Realizar un programa en el que solicitemos el username (login) de un usuario para registrarse.
//		Tendremos que validar este dato del siguiente modo:
//		- Quitaremos los espacios que tenga al inicio y al final
//		- Pondremos todo en mayúsculas
//		- Si la longitud es inferior a 10 caracteres, indicaremos un error y volveremos a solicitar
//		un nuevo username
//		- Si contiene algún espacio en blanco, indicaremos un error y volveremos a solicitar un
//		nuevo username
//		- Si todo está correcto, mostraremos el username final tras aplicar el algoritmo y
//		terminamos el programa. 
		Scanner terminator = new Scanner(System.in);
		String usuario;
		do {
			System.out.println("Dame tu usuario: ");
			usuario = terminator.nextLine();
			usuario = usuario.trim();
			usuario = usuario.toUpperCase();
			if (usuario.length()<10) {
				System.out.println("ERROR");
			}
			if (usuario.contains(" ")) {
				System.out.println("ERROR");
			}
		} while (usuario.length() < 10 || usuario.contains(" "));
		System.out.println("Tu usuario es " + usuario);
		terminator.close();
	}
}
