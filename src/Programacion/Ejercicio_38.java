package Programacion;

import java.util.Scanner;

public class Ejercicio_38 {
	public static void main(String[] args) {
//		Mejorar el ejercicio anterior para que, en lugar de mostrar y sumar los múltiplos de 3, lo haga
//		con cualquier número natural que indique el usuario por teclado. Es decir, el programa
//		funcionará de este modo:
//		1. Solicitamos un número al usuario
//		2. Si está entre 1 y 10 (inclusive ambos), mostramos la suma como en el ejercicio
//		anterior. Luego volvemos a pedir otro número para repetir la operación (volvemos al
//		paso 1)
//		3. Si el número indicado es mayor a 10 o menor a 0, indicaremos que el número no es
//		correcto, y solicitaremos otro de nuevo.
//		4. Si el número indicado es 0, terminaremos el programa

		Scanner terminator = new Scanner(System.in);
		Integer num = 0;
		Integer cont = 0;
		Integer suma = 0;
		do {
			System.out.println("Dame un numero: ");
			num = terminator.nextInt();
			if (num < 0 || num > 10) {
				System.out.println("Numero no valido");
				break;
			}
			if (cont == 2) {
				break;
			}
			for (int i = 1; i <= 10; i++) {
				suma += i * num;
				if (num == 0) {
					System.out.println("Vete a mamarla");
					break;
				}
				if (i < 10) {
					System.out.print((i * num) + " + ");
				} else {
					System.out.print((i * num) + " = " + suma);
				}
			}

		} while (num < 0 || num > 10 || cont > 2);
		terminator.close();
	}
}
