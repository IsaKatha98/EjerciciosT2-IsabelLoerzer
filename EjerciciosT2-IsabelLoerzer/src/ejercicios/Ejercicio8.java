package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	/*Las pruebas que se harán en este ejercicio son las siguientes:
	 * 
	 * - Introducir un número de días menor que 7 y un número de km menor que 800. Si introduzco 5 días y 600 km, 
	 * 	me dará que el billete cuesta 1500 euros.
	 * 
	 * - Introducir un número de días mayor que 7 y un número de km mayor que 800. Debe aplicarse el descuento, 
	 * 	si introduzco 8 días y 810 km el billete deberá costar 1417,5 euros.
	 * 
	 * - Introducir un número de días mayor que 7. No debe aplicarse el descuento. Si introduzco 8 días y 600 km,
	 * 	el billete costará 1500 km.
	 * 
	 * - Introducir un número de km mayor que 800. No debe aplicarse el descuento. Si introduzco 5 días y 810 km, 
	 * 	el billete costará 2025 euros. */

	public static void main(String[] args) {
	
	//Declaramos las variables.
		
		final double PRECIOKM= 2.5; //Variable que indica el precio del km.
		final double DESCUENTO= 0.3; //Variable que indica el descuento a aplicar.
		int numDias;//Variable equivalente al número de días de estancia.
		double  km;// Variable equivalente a los km recorridos.			
		double precioBillete; //Variable resultado equivalente al precio de un billete normal.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
					
		Scanner sc= new Scanner (System.in); 
					
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
					
		System.out.print("Introduzca el número de días que pasará fuera y pulse Intro: ");
		numDias=sc.nextInt();
		System.out.print("Introduzca los km que va a recorrer y pulse Intro: ");
		km=sc.nextDouble();
		
		//Primero calculamos el precio de un billete.
		
		precioBillete=km*PRECIOKM;
		
		//A continuación, establecemos la condición para aplicar el descuento.
		
		if (numDias>7&&km>800) {
			
			precioBillete-=(precioBillete*DESCUENTO) ;
			
			System.out.println("Al hacer una estancia superior a 7 días y recorrer una distancia mayor de \n"
					+ "800 km, se le aplica un descuento del 30% al precio de su billete, por lo que el coste final\n"
					+ "será: "+precioBillete+ " euros.");
		} else {
			
			System.out.println("El precio final de su billete es de: "+ precioBillete+ " euros.");
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();
	
	}

}
