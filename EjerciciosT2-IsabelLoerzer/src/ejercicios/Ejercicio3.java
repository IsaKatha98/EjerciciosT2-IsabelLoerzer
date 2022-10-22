package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	/*Las pruebas realizadas en este ejercicio serán:
	 * - Introducir un número de animales negativo.
	 * - Introducir un número de animales igual a 0.
	 * - Introducir un número de animales válido, siendo los kilos comprados mayores que los kilos consumidos.
	 * - Introducir un número de animales válido, siendo los kilos comprados menores que los kilos consumidos. */

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		double cantComida; //Variable equivalente a los kilos comprados.
		int numAnimales;//Variable equivalente al número de animales. 
		double  kilosDiarios;// Variable equivalente a los kilos consumidos de forma diaria.			
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
					
		Scanner sc= new Scanner (System.in); 
					
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
					
		System.out.print("Introduzca la cantidad de comida comprada en el día de hoy y pulse Intro: ");
		cantComida=sc.nextDouble();
		System.out.print("Introduzca los kilos de comida consumidos de forma diaria y pulse Intro: ");
		kilosDiarios=sc.nextDouble();
		System.out.print("Introduzca el número de animales y pulse Intro: ");
		numAnimales=sc.nextInt();
		
		//Para empezar, averiguamos si el número de animales es mayor que 0.
			
		if(numAnimales>0) {
			
			/*En caso afirmativo, comparamos si los kilos consumidos diariamente son menores o iguales a los kilos comprados diariamente.
			 * En el caso de que no sea así, dividiremos los kilos consumidos entre el número de animales para saber a cuánto kg equivale
			 * 1 ración.*/
			
			if (kilosDiarios>=cantComida) {
			
				kilosDiarios/=numAnimales;
			
			
				System.out.println("Los kilos consumidos de forma diaria no pueden superar a los comprados. Le recordamos "
				+ "que el consumo de cada animal es de: "+String.format("%.2f", kilosDiarios) + " kg diarios.");
			
			} else {
				System.out.println("Dispone de alimento suficiente.");
			
			}
			
		}else {
			System.out.println("ERROR. El número de animales no es válido.");
		
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();
						

	}

}
