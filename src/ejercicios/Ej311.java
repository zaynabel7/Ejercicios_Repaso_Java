package ejercicios;

import java.util.Scanner;

public class Ej311 {

	public static double calcularMedia(int[] array) {
		double suma = 0;
		int contador = 0;
		
		for(int i = 0; i < array.length; i++) {
			suma = suma + array[i];
			contador++;
		}
		
		return suma/contador;
	}
	
	public static int calcularMinimo(int[] array) {
		int minimo = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < minimo) {
				minimo = array[i];
			}
		}
		return minimo;
	}
	
	public static int calcularMaximo(int[] array) {
		int maximo = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > maximo) {
				maximo = array[i];
			}
		}
		return maximo;
	}
	
	public static void main(String[] args) { //quiero meter los numeros que me pasa por scanner en un array 
		Scanner sc = new Scanner(System.in);
		System.out.print("¿Cuántos números vas a introducir?:  ");  //le pido al usuario q me especifique el tamaño del array (numeros q va a introducir)
	    int cantidad = sc.nextInt(); 
		
	    int[] miArray = new int[cantidad]; //asigno ese tamaño a mi array
		for(int i = 0; i < miArray.length; i++) {            //bucle for para ir pidiendole al usuario los numeros, si el tamaño es 6, se ejecuta 6 veces
			System.out.print("Introduce un numero: " );   
			miArray[i] = sc.nextInt();         //guardo el numero que ha introducido en la posicion i
			
		}
		
		sc.close();
		System.out.println("La media es: " + calcularMedia(miArray));
		System.out.println("El maximo es: " + calcularMaximo(miArray));
		System.out.println("El minimo es: " + calcularMinimo(miArray));
		

	}

}
