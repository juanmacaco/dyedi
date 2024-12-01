package Programacion;

import java.util.Scanner;

public class Ejercicio_13 {
	public static void main(String[] args) {
//		Realizar un programa que pregunte por el año de nacimiento del usuario. Según lo que nos
//		indique, mostrarle por consola a qué generación pertenece según este cuadro:
		Scanner terminator = new Scanner(System.in);
		System.out.println("En que año naciste: ");
		Integer año = terminator.nextInt();
		if (año >= 2010 && año < 2020) {
			System.out.println("Eres generación Alfa");
		}
		if (año >= 1997 && año < 2010) {
			System.out.println("Eres generación Z");
		}
		if (año >= 1981 && año < 1996) {
			System.out.println("Eres generación Y");
		}
		if (año >= 1965 && año < 1980) {
			System.out.println("Eres generación X");
		}
		if (año >= 1945 && año < 1964) {
			System.out.println("Eres generación Baby Boomer");
		}
		if (año >= 1928 && año < 1945) {
			System.out.println("Eres generación Silenciosa");
		}
		if (año >= 1901 && año < 1927) {
			System.out.println("Eres generación Grandiosa");
		}
		if (año >= 1883 && año < 1900) {
			System.out.println("Eres generación Baby Boomer");
		}
		terminator.close();
	}
}
