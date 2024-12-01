package Programacion;

public class Ejercicio_8 {
	public static void main(String[] args) {
//		Realizar un programa que obtenga por teclado los siguientes datos:
//			 Un número, pero registradlo en una variable de tipo String llamada a.
//			 Un número decimal registrado en una variable de tipo Double llamada b.
//			 Un número entero registrado en una variable de tipo Float llamada c.
//			A continuación, haz las siguientes conversiones de tipo:
//			 Guarda el valor de “a” en una variable de tipo Long llamada “x1”
//			 Guarda el valor de “b” en una variable de tipo String llamada “x2”
//			 Guarda el valor de “b” en una variable de tipo Integer llamada “x3”
//			 Guarda el valor de “c” en una variable de tipo Long llamada “x4”
//			Imprime por consola el valor de todas las variables x1, x2, x3 y x4 

		String a = "1";
		Double b = 1.5;
		Float c = 10f;

		Long x1 = Long.parseLong(a);
		String x2 = b.toString();
		Integer x3 = b.intValue();
		Long x4 = c.longValue();

		System.out.println(x1 + " " + x2 + " " + x3 + " " + x4);

	}
}
