package ejercicios;

import java.util.Scanner;

public class Ej207 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero:");
		int numero = sc.nextInt();
		
		int divisor = 2;
		
		
		System.out.println("Los divisores de " + numero + " son: ");
		
		while(numero > 1) {
			
			if(numero % divisor == 0) {          //si el numero que yo meto es divisible entre el divisor (modulo 0) entonces el if es true y se imprime el divisor, si el divisor no es divisible (modulo distinto de 0) el if es falso y se ejecuta el else
		
				System.out.println(divisor);
				numero = numero/divisor;       //una vez que he comprobado que es divisor, tengo que actualizar el numero (dividirlo por el divisor) para seguir la descomposicion de fracciones
			}else {
				divisor++;        //si el divisor no es divisible, se incrementa una unidad para probar con el siguiente divisor aver si es divisible
			}
			
			
		}
		
		sc.close();
	}

	//ejemplo, 40, en el primer ciclo 40%2=0 por lo que se imprime el divisor y se actualiza el numero 40/2=20, en el siguiente ciclo 20%2=0 se imprime y se actualiza 20/2=10, en el tercer ciclo 10%2=0 se imprime y se actualiza 10/2=5, en el ultimo ciclo 5%2 es distinto de 0 por lo que se ejecuta el else, se suma un divisor pero sigue sin funcionar, y vuelve a sumar hasta que el divisior valga 5 entonces 5%5=0 y se imprime y se actualiza 5%5=0
}
