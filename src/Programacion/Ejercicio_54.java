package Programacion;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_54 {
	public static void main(String[] args) {
//		Realizar un programa que simule el lanzamiento de un dado durante N veces. En primer lugar,
//		solicitaremos al usuario cuántas veces quiere que lancemos el dado. A continuación,
//		imprimiremos por consola el resultado de lanzar de manera aleatoria el dado cada una de las
//		veces. 
		Random random = new Random();
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame un numero de veces que vas a tirar el dado: ");
		Integer num = terminator.nextInt();
		Integer cont = 0;
		Integer suma1 = 0, suma2 = 0, suma3 = 0, suma4 = 0, suma5 = 0, suma6 = 0;
		do {
			Integer resultado = random.nextInt(1,7);
			if (resultado == 1) {
				suma1++;
				cont++;
			}
			if (resultado == 2) {
				suma2++;
				cont++;
			}
			if (resultado == 3) {
				suma3++;
				cont++;
			}
			if (resultado == 4) {
				suma4++;
				cont++;
			}
			if (resultado == 5) {
				suma5++;
				cont++;
			}
			if (resultado == 6) {
				suma6++;
				cont++;
			}
		} while (cont != num);
		System.out.println("Ha salido el 1 " + suma1 + " veces, el 2 " + suma2 + " veces, el 3 " + suma3 + " veces, el 4 " + suma4 + " veces, el 5 " + suma5 + " veces, y el 6 " + suma6 + " veces");
		terminator.close();
	}
}
