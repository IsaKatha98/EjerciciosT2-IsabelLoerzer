package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	
	/*Las pruebas realizadas en este ejercicio son las siguientes:
	 * 
	 * - Introducir un número no válido: menor que 1, 0 o mayor que 99. Si introduzco 100 me notifica error.
	 * 
	 * - Introducir un número que solo sea unidades: 1-9. Si introduzco el 5, me imprime "cinco".
	 * 
	 * - Introducir un número que solo sea decenas y que sea una excepción: 10 o 20. Si introduzco el diez,
	 * 	me lee "diez".
	 * 
	 * - Introducir un número que solo sea decenas y que no sea una excepción: 30, 40, 50... Si introduzco el 40,
	 * 	me lee "cuarenta".
	 * 
	 * - Introducir un número entre 11 y 15. Si introduzco 13, me lee "trece".
	 * 
	 * - Introducir un número entre 16-99. Si introduzco el 25, me lee "veinticinco". */

	public static void main(String[] args) {
	
		//Declaramos las variables.
		
		int num; //Variable introducida por el usuario.
		int unidades;//Variable unidades de la cifra introducida.
		int decenas;//Variable decenas de la cifra introducida.
		String numUn= "";//Variable cadena equivalente a la variable unidades.
		String numDec = "";//Variable cadena equivalente a la variable decenas.
						
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
								
		Scanner sc= new Scanner (System.in); 
								
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
								
		System.out.print("Introduzca un número entre 1 y 99 (ambos inclusive) y pulse Intro: ");
		num=sc.nextInt();
				
		//Instrucciones. Empezamos valorando si el número introducido es válido o no.
		
		
		if (num>=1&&num<=99) {
			
		/*Una vez establecido que el número introducido es válido, lo separamos en decenas y unidades. Es decir,
		 * guardamos ese número en dos variables separadas para poder leerlas por separado. */
		
		unidades=num%10;
		decenas=num/10;
			
		//Ahora se imprimirán las excepciones, es decir, los números del diez al quince y el veinte.
			
			if (num>=10&&num<=15||num==20) {
				
				switch (num) {
				
				case 10-> {
					System.out.println("El número introducido es: diez");
				}
				
				case 11-> {
					System.out.println("El número introducido es: once");
				}
				case 12-> {
					System.out.println("El número introducido es: doce");
				}
				case 13-> {
					System.out.println("El número introducido es: trece");
				}
				case 14-> {
					System.out.println("El número introducido es: catorce");
				}
				case 15-> {
					System.out.println("El número introducido es: quince");
				}
				case 20-> {
					System.out.println("El número introducido es: veinte");
				}
			}
				
			//Ahora se leerán el resto de casos.
				
			} else {
			
			//Primero, establecemos el string de las unidades. 
			
				switch (unidades) {
				
				case 0-> {
					numUn="";
				}
				case 1-> {
					numUn="uno";
				}
			
				case 2-> {
					numUn="dos";
				}
			
				case 3-> {
					numUn="tres";
				}
			
				case 4-> {
					numUn="cuatro";
				}
				case 5-> {
					numUn="cinco";
				}
				case 6->{
					numUn="seis";
				}
				case 7-> {
					numUn="siete";
				}
				case 8-> {
					numUn="ocho";
				}
				case 9->{
					numUn="nueve";
				}
			
				}
			
				//Segundo, establecemos las decenas.
			
				switch (decenas) {
				
				case 0-> {
					numDec="";
				}
				case 1-> {
					numDec="dieci";
				}
				case 2-> {
					numDec="veinti";
				}
				case 3-> {
					numDec="treinta";
				}
				case 4-> {
					numDec="cuarenta";
				}
				case 5->{
					numDec="cincuenta";
				}
				case 6-> {
					numDec="sesenta";
				}
				case 7-> {
					numDec="setenta";
				}
				case 8-> {
					numDec="ochenta";
				}
				case 9-> {
					numDec="noventa";
				}
				}
			
			/*Tercero, escribimos la condicional para que se escriba el número correctamente. En el caso de que las decenas sean 0, 1 o 2 
			 * o las unidades sean 0 se establecerá que se lea decenas+unidades. En cualquier otro caso, se leerá decenas+"y"+unidades. */
				
			if (decenas==0||decenas==1||decenas==2||unidades==0) {
					
					System.out.println("El número introducido es: "+numDec+numUn);
			} else {
				
				System.out.println("El número introducido es: "+numDec+" y "+numUn);
				
			}
		
		} 
		
		}else {
			System.out.println("ERROR. El número introducido no es válido.");
		
		}
		
		//Por último, cerramos el escáner.
		
		sc.close();
		
	}

	}
