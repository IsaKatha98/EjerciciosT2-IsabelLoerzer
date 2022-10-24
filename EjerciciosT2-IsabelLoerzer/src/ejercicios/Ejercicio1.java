
package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	/*Las pruebas que se realizarán en este ejercicio son:
	 * 
	 * - Comprobar que el número introducido por el usuario se encuentra en el rango [0,9999]. Si introduzco -1 me da
	 * 	error mientras que si introduzco 1, me lo acepta.
	 * 
	 * - En caso afirmativo, comprobar que es capicúa. Si introduzco el número 22 me lo notifica como capicúa mientras
	 *	que si introduzco 23 me dirá que no lo es.*/

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
		int unidades, decenas, centenas, millar; //Variables auxiliares necesarias para los cálculos.
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
				
		Scanner sc= new Scanner (System.in); 
				
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
				
		System.out.print("Introduzca un número entre 0 y 9.999 (ambos inclusive) y pulse Intro: ");
		num=sc.nextInt();
		
		//Instrucciones. Escribimos los cálculos antes de proceder. 
		
		unidades=num%10;
		decenas=(num/10)%10;
		centenas=(num/100)%10;
		millar=(num/1000);
		
		
		//Primero debemos validar que el número introducido se encuentra en el rango dado.
		
		if (num>=0&&num<=9999) {
			
			//Después, si se cumple esta condición, analizamos si el número es capicúa.

			if (num<=9) {
			
				System.out.println("Este número es capicúa.");
			
			} else if (num<=99) {
			
				if(decenas==unidades) {
				
					System.out.println("Este número es capicúa.");
				
				} else {
					
					System.out.println("Este número no es capicúa.");
				}
			
			}else if (num<=999) {
				
				if (centenas==unidades) {
					System.out.println("Este número es capicúa.");
					
				} else {
					System.out.println("Este número no es capicúa.");
				
				}
			
			} else if (num<=9999) {
				
				if(millar==unidades&&centenas==decenas) {
					System.out.println("Este número es capicúa.");
					
				}else  {
					System.out.println("Este número no es capicúa.");
					
				}
			}
			
		} else {
			System.out.println("ERROR. Debe introducir un número válido.");
			
		}
			
	//Por último, cerramos el escáner.
		
		sc.close();
				
			
	}
	
}
	


