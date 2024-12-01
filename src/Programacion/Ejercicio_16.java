package Programacion;

import java.util.Scanner;

public class Ejercicio_16 {
	public static void main(String[] args) {
//		Realizar un programa que solicite números por consola y los vaya sumando en una cuenta
//		acumulativa. Pedirá números hasta que el usuario introduzca el número 0. Cuando lo haga,
//		dejará de pedir números, mostrará el total de la suma, y terminará el programa. 
		Scanner terminator = new Scanner(System.in);
		Integer num;
		Integer cont = 0;
		do {
			System.out.println("Dame un numero: ");
			num = terminator.nextInt();
			cont += num;
		} while (num != 0);
		System.out.println(cont);
		terminator.close();
	}
}
