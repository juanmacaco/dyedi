package Programacion;

public class Ejercicio_36 {
	public static void main(String[] args) {
//		Realizar un programa que muestre por consola todos los números del 1 al 20 en una única
//		línea de este modo:
//		1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20
//		(Utilizar un bucle) 
		for (int i = 0; i < 20; i++) {
			System.out.print(i+"_");
			if (i==19) {
				i++;
			}
			if (i == 20) {
				System.out.println(i);
			}
		}
	}
}
