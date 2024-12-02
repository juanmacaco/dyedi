package Programacion;

import java.util.Scanner;

public class Ejercicio_45 {
	public static void main(String[] args) {
//	Realizar un programa que genere contraseñas del siguiente modo: pedirá al usuario una
//	palabra de al menos 8 caracteres. Si no tiene esa longitud, volverá a pedir otra hasta que el
//	usuario indique una de al menos esa longitud. Después, el programa cambiará las letras de esa
//	palabra por números siguiendo estas reglas:
//	 a  4
//	 e  3
//	 i  1
//	 o  0
//	 t  7
//	El resultado se mostrará por consola.
		Scanner terminator = new Scanner(System.in);
		String contrasena = "";
		do {
			System.out.println("Dame tu contraseña");
			contrasena = terminator.nextLine();
			contrasena = contrasena.replaceAll("a", "4");
			contrasena = contrasena.replaceAll("e", "3");
			contrasena = contrasena.replaceAll("i", "1");
			contrasena = contrasena.replaceAll("o", "0");
			contrasena = contrasena.replaceAll("t", "7");

		} while (contrasena.length() < 10);
		System.out.println(contrasena);
		terminator.close();
	}
}