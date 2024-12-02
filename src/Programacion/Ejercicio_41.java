package Programacion;

import java.util.Scanner;

public class Ejercicio_41 {
	public static void main(String[] args) {
//		Solicitar al usuario una dirección web que tendrá este formato:
//			PROTOCOLO://PARTE1.PARTE2.PARTE3
		Scanner terminator = new Scanner(System.in);
		System.out.println("Dame tu URL: ");
		String url = terminator.nextLine();
		Integer punto = url.indexOf(".");
		Integer punto1 = url.lastIndexOf(".");
		Integer barra = url.lastIndexOf("/");
		
		System.out.println(url.substring(0,barra + 1));
		System.out.println(url.substring(barra + 1, punto));
		System.out.println(url.substring(punto + 1, punto1));
		System.out.println(url.substring(punto1 + 1 , url.length()));
		terminator.close();
	}
}
