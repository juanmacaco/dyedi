package Programacion;

import java.util.Scanner;

public class Ejercicio_33 {
	public static void main(String[] args) {
//		Realizar un programa que solicite tres nombres de ciudades al usuario. Después, imprimir por
//		consola esos nombres ordenados según la longitud de cada nombre. Es decir, el que tenga
//		menos letras saldrá primero, luego el segundo que tenga menos letras, y por último el más
//		largo (el que tenga más letras). Si el usuario, por ejemplo, nos indicara estas ciudades:
//		Zaragoza, Vigo, Madrid
//		Deberíamos imprimir:
//		Vigo
//		Madrid
//		Zaragoza 
        Scanner terminator = new Scanner(System.in);

        System.out.print("Introduce el nombre de la primera ciudad: ");
        String ciudad1 = terminator.nextLine();

        System.out.print("Introduce el nombre de la segunda ciudad: ");
        String ciudad2 = terminator.nextLine();

        System.out.print("Introduce el nombre de la tercera ciudad: ");
        String ciudad3 = terminator.nextLine();

        String primera = "", segunda = "", tercera = "";

        if (ciudad1.length() <= ciudad2.length() && ciudad1.length() <= ciudad3.length()) {
            primera = ciudad1;
            if (ciudad2.length() <= ciudad3.length()) {
                segunda = ciudad2;
                tercera = ciudad3;
            } else {
                segunda = ciudad3;
                tercera = ciudad2;
            }
        } else if (ciudad2.length() <= ciudad1.length() && ciudad2.length() <= ciudad3.length()) {
            primera = ciudad2;
            if (ciudad1.length() <= ciudad3.length()) {
                segunda = ciudad1;
                tercera = ciudad3;
            } else {
                segunda = ciudad3;
                tercera = ciudad1;
            }
        } else {
            primera = ciudad3;
            if (ciudad1.length() <= ciudad2.length()) {
                segunda = ciudad1;
                tercera = ciudad2;
            } else {
                segunda = ciudad2;
                tercera = ciudad1;
            }
        }

        System.out.println("\nCiudades ordenadas por longitud:");
        System.out.println(primera);
        System.out.println(segunda);
        System.out.println(tercera);
        terminator.close();
    }
}