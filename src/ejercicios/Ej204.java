package ejercicios;
import java.util.Scanner;

public class Ej204 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //"Crea un Scanner llamado sc que va a leer lo que escribamos por la consola." System.in → indica que los datos vienen de la consola
	
		System.out.println("Introduzca números enteros positivos (negativo para terminar):");  //Cuando el usuario introduzca un número negativo se considerará que el anterior a este es el último número.
		
		//Calcule el mínimo y el máximo de una serie de números enteros positivos introducidos por el usuario.
		
		int maximo = Integer.MIN_VALUE;  //el maximo se inicializa como el menor numero posible
		int minimo = Integer.MAX_VALUE;  //el minimo se inicializa como el mayor numero posible
		boolean hayNumerosPositivos = false;
		
		//para que el usuario pueda introducir una serie de numeros necesito crear un bucle while que le pida un nuevo numero en cada ciclo, si el numero que introduce el usuario es positivo entonces el bucle sigue pero si el numero que introduce el usuario es negativo entonces el bucle finaliza
		
		while(true) {
			
			System.out.print("Número: ");    //La diferencia entre print y println es que print no hace un salto de línea.  System.out.print("Número: "):Le dice al usuario qué tiene que introducir.
			int numero = sc.nextInt();     //sc.nextInt() sirve para que el scanner lea el siguiente entero introducido por el usuario y ese entero se guarda en la variable numero. 

			if (numero < 0) {           //si el numero es negativo (<0) entonces se sale del while, se ejecuta en cada ciclo por lo que si se van introduciendo numeros positivos, esta linea no se ejecuta hasta que el usuario introduzca un numero negativo
				break;
			}
			
										
			hayNumerosPositivos = true;   //si hemos llegado hasta aqui significa que se ha introducido un numero (por lo de sc.nextInt(), porque el codigo se queda en pausa hasta que el usuario introduzca un numero para poder ejecutarse la siguiente linea)	
			if(numero < minimo) {
				minimo = numero;	
			}
			
			if(numero > maximo) {
				maximo = numero;
			}
		}
		
		sc.close();              //cada vez q te pide el numero y tu lo introduces, internamente se ejecutan todos los ifs y cuando termina el ciclo vuelve al principio para pedirte otro numero y asi sucesivamente
		
		if (!hayNumerosPositivos) {
			System.out.println("No se introdujeron números positivos."); //si se introduce el primer numero negativo, entonces se sale directamente del bucle y no se ejecuta hayNumerosPositivos = true
		} else {
			System.out.println("Mínimo: " + minimo);
			System.out.println("Máximo: " + maximo);
		}
	}

}
