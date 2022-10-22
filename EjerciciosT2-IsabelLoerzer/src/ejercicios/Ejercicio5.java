package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
	
	/*Las pruebas realizadas en este ejercicio son las siguientes:
	 * 
	 * - Introducir un número positivo.
	 * - Introducir un número negativo.*/

	public static void main(String[] args) {
	

		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
										
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
						
		Scanner sc= new Scanner (System.in); 
						
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
						
		System.out.print("Introduzca un número y  se le devolverá el valor absoluto del mismo: ");
		num=sc.nextInt();
		
		/*Se plantea la condición. En este caso, hay que devolder el número introducido en caso de que sea positivo 
		y si es negativo, deberá multiplicarse por -1.*/
		
		num=(num>0)?num:num*(-1);
		
		//Imprimos el resultado.
		
		System.out.println("Valor absoluto: "+num);
				
		//Por último, cerramos el escáner.
		
		sc.close();

	}

}
