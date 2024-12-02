package Programacion;

public class Ejercicio_37 {
	public static void main(String[] args) {
//		Realizar un programa que muestre esta serie de números y la sume:
//			3 + 6 + 9 + 12 + 15 + 18 + 21 + 24 + 27 + 30 = 165 
		Integer suma = 0;
		for (int i = 1; i <= 10; i++) {
			suma += i*3;
			if (i < 10) {
				System.out.print((i*3) + " + ");
			}
			else {
				System.out.print((i*3) + " = " + suma);
			}
		}
	}
}
