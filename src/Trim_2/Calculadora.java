package Trim_2;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner terminator = new Scanner(System.in);
		String cad = "";
		System.out.println("Dame un numero: ");
		Integer num1 = terminator.nextInt();
		System.out.println("Dame un numero: ");
		Integer num2 = terminator.nextInt();
		System.out.println(sumar(num1,num2));
		System.out.println(restar(num1,num2));
		System.out.println(multiplicar(num1,num2));
		System.out.println(dividir(num1,num2));
		terminator.nextLine();
		do {
			System.out.println("***MENU***");
			System.out.println("1.ADD");
			System.out.println("2.SUB");
			System.out.println("3.MUL");
			System.out.println("4.DIV");
			
			cad = terminator.nextLine();
			
		} while (!cad.equalsIgnoreCase("ADD") && !cad.equalsIgnoreCase("SUB") &&!cad.equalsIgnoreCase("MUL") &&!cad.equalsIgnoreCase("DIV"));
		
		System.out.println(calcular(cad, num1, num2));
		
		System.out.println("Dame un numero: ");
		Integer sum = terminator.nextInt();
		System.out.println(sumarNumero(sum));

		System.out.println("Dame un numero: ");
		Integer fact = terminator.nextInt();
		System.out.println(factorial(fact));
	}
	
	public static Integer sumar(Integer num1, Integer num2) {
		Integer suma = num1 + num2;
		return suma;
	}
	public static Integer restar(Integer num1, Integer num2) {
		Integer resta = num1 - num2;
		return resta;
	}
	public static Integer multiplicar(Integer num1, Integer num2) {
		Integer multiplicacion = num1 * num2;
		return multiplicacion;
	}
	public static Integer dividir(Integer num1, Integer num2) {
		if (num2 == 0) {
			return 0;
		}
		Integer division = num1 / num2;
		return division;
	}
	public static Integer calcular(String cad, Integer num1, Integer num2) {
		if (cad.equalsIgnoreCase("add")) {
			Integer num = sumar(num1,num2);
			return num;
		}
		if (cad.equalsIgnoreCase("sub")) {
			Integer num = restar(num1,num2);
			return num;
		}
		if (cad.equalsIgnoreCase("mul")) {
			Integer num = multiplicar(num1, num2);
			return num;
		}
		if (cad.equalsIgnoreCase("div")) {
			Integer num = dividir(num1,num2);
			return num;
		}
		else {
			return 0;
		}
	}
	public static Integer sumarNumero(Integer num) {
		Integer suma = 0;
		for (int i = 1; i <= num; i++) {
			suma+= i;
		}
		return suma;
	}
	public static Integer factorial(Integer num) {
		Integer suma = 0;
		for (int i = 1; i <= num; i++) {
			if (i == 1) {
				suma = 1;
			}
			suma = suma * i;
		}
		return suma;
	}
}
