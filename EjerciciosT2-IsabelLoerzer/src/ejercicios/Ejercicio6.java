package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	/*En este ejercicio, se harán las siguientes comprobaciones:
	 * 
	 * - Introducir un número correcto y que muestre el mensaje correspondiente.
	 * - Introducir un número incorrecto y que muestre la solución correcta.*/

	public static void main(String[] args) {
	
		//Declaramos las variables.
		
		int num1; //Variable cuyo valor se producirá de forma aleatoria.
		int num2; //Variable cuyo valor se producirá de forma aleatoria.
		int suma; //Variable que introducirá el usuario y que deberá ser comprobada.
						
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
						
		Scanner sc= new Scanner (System.in);
		
		/*Primero, se deberá generar dos números aleatorios. Como debe encontrarse entre 1 y 99, 
		 * el resultado de la función Math.Random deberá multiplicarse por 99.*/
		
		num1= (int) (Math.random()*99);
		num2= (int) (Math.random()*99);
		
		//Presentamos estos números al usuario.
		
		System.out.print("¡Vamos a jugar a un juego! Suma los siguientes números: "+num1+" + "+num2+" =");
		suma=sc.nextInt();
		
		//Ahora se comprueba que el número introducido es correcto. y se imprime el mensaje correspondiente.
		
		if (suma==num1+num2) {
			
			System.out.println("Enhorabuena, la solución es correcta.");
		
		} else {
			
			System.out.println("Incorrecto, la solución correcta es: "+(num1+num2));
		}
		
	//Por último, cerramos el escáner.
		
	sc.close();

	}

}
