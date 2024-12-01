package Programacion;

import java.util.Scanner;

public class Ejercicio_32 {
	public static void main(String[] args) {
//		Realizar un programa que solicite el nombre y el año de nacimiento del usuario. Luego
//		imprimirá por consola esto:
//		“Hola [nombre], en el año 2030 tendrás [N] años.”
//		Donde:
//		 Nombre: es el nombre indicado por el usuario
//		 N: es el número de años que tendrá ese usuario en el año 2030 en base a su año de
//		nacimiento 
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = terminator.nextLine();
		System.out.println("En que año naciste: ");
		Integer ano = terminator.nextInt();
		System.out.println("Hola " + nombre + ", en el año 2030 tendrás " + (2030-ano) + " años");
		terminator.close();
	}
}
