package Programacion;

import java.util.Scanner;

public class Ejercicio_34 {
	public static void main(String[] args) {
//		Realizar un programa que muestre por consola un menú de opciones al usuario como este:
//			*** MENÚ ***
//			1. Abrir
//			2. Guardar
//			3. Modificar
//			4. Salir
//			A continuación, nos quedaremos esperando la opción indicada mediante un número. En
//			función de lo que elija, haremos lo siguiente:
//			 Si elige una opción entre el 1 y el 3  Escribiremos en consola que se ha elegido la
//			opción que sea (Abrir, Guardar, Modificar) y volveremos a mostrar de nuevo el menú.
//			 Si elige la opción 4  Escribiremos “Bye Bye” y el programa terminará.
//			 Si elige otra opción cualquiera  Escribiremos que esa opción de menú no es correcta.
//			Y volveremos a mostrar el menú. 
		Scanner terminator = new Scanner(System.in);
		Integer accion;
		System.out.println("*** MENÚ ***");
		System.out.println("1. Abrir");
		System.out.println("2. Guardar");
		System.out.println("3. Modificar");
		System.out.println("4. Salir");

		do {
			System.out.println("Que desea realizar?");
			accion = terminator.nextInt();
			if (accion == 1) {
				System.out.println("Se ha elegido Abrir");
			}
			if (accion == 2) {
				System.out.println("Se ha elegido Guardar");
			}
			if (accion == 3) {
				System.out.println("Se ha elegido Modificar");
			}
			if (accion == 4) {
				System.out.println("Se ha elegido Salir. Bye Bye");
				break;
			}
			if (accion > 4 || accion < 0 ) {
				System.out.println("Numero no valido");
			}
		} while (accion < 4 || accion > 0);
		terminator.close();
	}
}
