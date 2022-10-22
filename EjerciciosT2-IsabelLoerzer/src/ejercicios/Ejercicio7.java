package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	
	/*Las pruebas realizadas en este ejercicio son:
	 * 
	 * - Introducir una hora mayor de 24.
	 * - Introducir una una hora válida y los minutos y los segundos igual a 59.
	 * - Introducir 23 horas, 59 minutos y 59 segundos.*/

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int seg;//Variable segundos, introducida por el usuario.
		int min;//La variable minutos, introducido por el usuario.
		int horas;//La variable horas, introducido por el usuario.
					
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola.*/
											
		Scanner sc= new Scanner (System.in); 
											
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
											
		System.out.print("Deberá introducir un número en horas, minutos y segundos y pulsar Intro. A continuación, introduzca los segundos: ");
		seg= sc.nextInt();
		System.out.print("Introduzca los minutos: ");
		min= sc.nextInt();
		System.out.print("Introduzca las horas: ");
		horas= sc.nextInt();
				
		/*Planteamos la primera condición. En ella, las horas deben ser mayor/igual que 0 y menor(igual que 23, los minutos mayor/igual que 0
		 * y menor o igual que 59; y los segundos mayor/igual que 0 y menor/igual que 59. Cuando se cumpla esta condición, aplicamos un incremento 
		 * un segundo.*/
				
		if (horas>=0&&horas<=23&&min>=0&&min<=59&&seg>=0&&seg<=59) {
					
			seg++;
					
			if (seg==60) {//Al aplicar el incremento de un segundo, en el caso de que sean igual a 60, tendrán valor 0 y se incrementa 1 min.
						
				seg=0;
				min++;
						
				if ( min==60) {//Al aplicar el incremento de un minuto, en el caso de que sea igual a 60, tendrá valor 0 y se incrementa 1 hora.
							
					min=0;
					horas++;
							
					if (horas==24) {//Si tras el incremento, las horas valen 24, pasarán a tener valor 0.
								
						horas=0;
						}
					}
						
				}
					
			System.out.println("La hora introducida con un incremento de un segundo es igual: "+horas+" horas, "+min+" minutos y "+seg+" segundos.");
					
					
		} else {
			System.out.println("ERROR. Uno de los números introducidos no es válido.");
		
		}
				
		//Por último, cerramos el escáner
											
		sc.close();
	}

}
