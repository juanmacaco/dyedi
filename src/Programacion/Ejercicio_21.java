package Programacion;

import java.util.Scanner;

public class Ejercicio_21 {
	public static void main(String[] args) {
//		Realizar un programa que solicite al usuario su nombre completo. A continuación, mostrarle
//		por separado cuál es su nombre, su primer apellido y su segundo apellido. Lo haremos
//		separando por espacios en blanco (basta con que funcione con nombres y apellidos simples,
//		por ejemplo, Abel Morillo Sánchez. No funcionaría con nombres como María del Carmen Ruiz
//		de los Mozos Santos)
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dime tu nombre completo: ");
		String nombre = terminator.nextLine();
		Integer nom1 = nombre.indexOf(" ");
		Integer nom2 = nombre.lastIndexOf(" ");
		
		System.out.println("Tu nombre es " + nombre.substring(0,nom1));
		System.out.println("Tu primer apellido es" + nombre.substring(nom1, nom2));
		System.out.println("Tu segundo apellido es" + nombre.substring(nom2));
		terminator.close();
		
	}
}
