package Programacion;

import java.util.Scanner;

public class Ejercicio_26 {
	public static void main(String[] args) {
//		Realiza un programa que solicite un número entero al usuario y muestre su tabla de multiplicar
//		completa del 0 al 10 por consola. Por ejemplo, si indicamos el número 3, el programa debería
//		imprimir: 
		Scanner terminator = new Scanner(System.in);
		Integer cont = 0;
		System.out.println("Dame un numero: ");
		Integer num = terminator.nextInt();
		
		while (cont <= 10) {
			System.out.println(num + " x " + cont + " = " + (num*cont));
			cont++;
		}
		terminator.close();
	}
}
