package Programacion;

import java.util.Scanner;

public class Ejercicio_12 {
	public static void main(String[] args) {
//		Realiza un programa que solicite al usuario su número favorito. A continuación, debe solicitar
//		su ciudad favorita.
//		¿Algo no te funciona? ¿Qué ha pasado? Intenta arreglarlo buscándote la vida…
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dime tu numero favorito: ");
		Integer num = terminator.nextInt();
		terminator.nextLine();
		System.out.println("Dime tu ciudad favorita: ");
		String ciudad = terminator.nextLine();
		System.out.println("Tu ciudad favorita es " + ciudad + " y tu numero favorito es el " + num);
		terminator.close();
	}
}
