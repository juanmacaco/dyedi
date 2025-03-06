package Trim_2;

import java.util.Scanner;

public class Sintaxis {
	public static void main(String[] args) {
		Scanner terminator = new Scanner(System.in);
		Integer num = 0;
		System.out.println("Dame una cadena: ");
		String cad = terminator.nextLine();
		do {
			System.out.println("Dame un numero: ");
			num = terminator.nextInt();	
		} while (num > 2 || num < 1);
		System.out.println(getMayusculas(cad));
		System.out.println(getMinusculas(cad));
		System.out.println(getMayMin(num, cad));
		
		String [] array = {"Chupete", "Allioli", "JuanLeNegre", "JuanLeBlanc", "Evilpain"};
		imprimirArray(array);
		System.out.println("Que posicion deseas obtener: ");
		Integer pos = terminator.nextInt();
		terminator.nextLine();
		
		obtenerPalabra(array, pos);
		
		System.out.println("Que palabra deseas obtener: ");
		String pal = terminator.nextLine();
		
		System.out.println(buscarPalabra(array, pal));
	}
	
	public static String getMayusculas(String cad) {
		cad = cad.trim().toUpperCase();
		return cad;
	}
	public static String getMinusculas(String cad) {
		cad = cad.trim().toLowerCase();
		return cad;
	}
	public static String getMayMin(Integer num, String cad) {
		if (num == 1) {
			cad = getMayusculas(cad);
			return cad;
		}
		else {
			cad = getMinusculas(cad);
			return cad;
		}
	}
	public static void imprimirArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
	}
	public static void obtenerPalabra(String[] array, Integer num) {
		System.out.println(array[num]);
		if (num > array.length && num < 0) {
			System.out.println("Numero no valido");
		}
	}
	public static Integer buscarPalabra(String[] array, String num) {
		for (int i = 0; i < array.length; i++) {
			if (num.equals(array[i])) {
				return i;
			}
		}	
		return -1;
	}
}
