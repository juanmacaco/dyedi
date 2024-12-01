package Programacion;

public class Ejercicio_28 {
	public static void main(String[] args) {
//		Repetir el ejercicio 5 utilizando una estructura FOR. 
		for (int i = 0; i < 10000; i++) {
			System.out.print(i + " + ");
			if (i == 9999) {
				i++;
			}
			if (i == 10000) {
				System.out.print(i);
			}
		}
	}
}
