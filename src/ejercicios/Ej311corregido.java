package ejercicios;

import java.util.Scanner;

public class Ej311corregido {

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
		int[] miArray = new int[1000];  //creo un array gigante
		
		System.out.print("Introduce un número (0 para terminar): "); //le pido el primer numero al usuario y me lo guardo en la variable numero
	    int numero = sc.nextInt();
	    int contador = 0;  //para ir rellenando el array, similar a un for, cada vez q ejecuto el while el contador se incrementa en 1, es decir, pasa a la siguiente posicion
		
	    while (numero != 0) {  //mientras que el numero introducido sea distinto de 0, se va a ejecutar el cuerpo del while
			miArray[contador] = numero; //cuando i=0, se guarda el valor del primer numero introducido, en los siguientes ciclos, se vuelve a pedir un nuevo numero (numero = nuevo valor) que se va a guardar en la siguiente posicion
			contador++;      
			System.out.print("Introduce un número: ");
			numero = sc.nextInt();  //si numero=0 se sale del bucle
		}
		
		sc.close();
		System.out.println("La media es: " + calcularMedia(miArray));
		System.out.println("El maximo es: " + calcularMaximo(miArray));
		System.out.println("El minimo es: " + calcularMinimo(miArray));
		

	}

}
