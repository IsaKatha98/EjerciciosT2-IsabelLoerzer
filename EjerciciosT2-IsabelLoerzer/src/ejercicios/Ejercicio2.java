package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	/*En este caso, las pruebas a realizar son:
	 * - Introducir un número de ocho cifras y que salga la letra correcta.
	 * - Introducir un número distinto de ocho cifras y comprobar que aparece el mensaje de error.*/

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
						
		Scanner sc= new Scanner (System.in); 
						
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
						
		System.out.print("Introduzca el número de su DNI y pulse Intro: ");
		num=sc.nextInt();
		
		//Instrucciones. Empezamos valorando si el número introducido es válido o no.
		
		if (num>=10000000&&num<=99999999) {
			
		//En caso afirmativo, hacemos el módulo de 23.
			
			num%=23;
			
			switch (num) {
			
			//Asignamos valor a num.
			
			 	case 0 -> {
			 		System.out.println("La letra de su DNI es T.");
			 	}
			 	
			 	case 1 -> {
			 		System.out.println("La letra de su DNI es R.");
			 	}
			 	
			 	case 2 -> {
			 		System.out.println("La letra de su DNI es W.");
			 	}
			 	
			 	case 3 -> {
			 		System.out.println("La letra de su DNI es A.");
			 	}
			 	
			 	case 4 -> {
			 		System.out.println("La letra de su DNI es G.");
			 	}
			 	
			 	case 5 -> {
			 		System.out.println("La letra de su DNI es M.");
			 	}
			 	
			 	case 6 -> {
			 		System.out.println("La letra de su DNI es Y.");
			 	}
			 	
			 	case 7 -> {
			 		System.out.println("La letra de su DNI es F.");
			 	}
			 	
			 	case 8 -> {
			 		System.out.println("La letra de su DNI es P.");
			 	}
			 	
			 	case 9 -> {
			 		System.out.println("La letra de su DNI es D.");
			 	}
			 	
			 	case 10 -> {
			 		System.out.println("La letra de su DNI es X.");
			 	}
			 	
			 	case 11 -> {
			 		System.out.println("La letra de su DNI es B.");
			 	}
			 	
			 	case 12 -> {
			 		System.out.println("La letra de su DNI es N.");
			 	}
			 	
			 	case 13 -> {
			 		System.out.println("La letra de su DNI es J.");
			 	}
			 	
			 	case 14 -> {
			 		System.out.println("La letra de su DNI es Z.");
			 	}
			 	
			 	case 15 -> {
			 		System.out.println("La letra de su DNI es S.");
			 	}
			 	
			 	case 16 -> {
			 		System.out.println("La letra de su DNI es Q.");
			 	}
			 	
			 	case 17 -> {
			 		System.out.println("La letra de su DNI es V.");
			 	}
			 	
			 	case 18 -> {
			 		System.out.println("La letra de su DNI es H.");
			 	}
			 	
			 	case 19 -> {
			 		System.out.println("La letra de su DNI es L.");
			 	}
			 	
			 	case 20 -> {
			 		System.out.println("La letra de su DNI es C.");
			 	}
			 	
			 	case 21 -> {
			 		System.out.println("La letra de su DNI es K.");
			 	}
			 	
			 	case 22 -> {
			 		System.out.println("La letra de su DNI es E.");
			 	}
			}
			
		} else {
			System.out.println("ERROR. No ha introducido un número válido.");
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();
				
	}

}
