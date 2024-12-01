package Programacion;

public class Ejercicio_17 {
	public static void main(String[] args) {
//		Realizar un programa que muestre la suma de todos los números del 1 al 10000.
//		Es decir: 1 + 2 + 3 + 4 + 5 + … + 9999 + 10000 
		Integer num = 1;
		while (num < 10000) {
			System.out.print(num + " + ");
			num++;
			if (num == 10000) {
				System.out.println(num);
			}
		}
		
	}
}
