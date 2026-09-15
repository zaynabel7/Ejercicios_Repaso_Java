package ejercicios;

public class Ej206 {

	private static boolean esPrimo(int n) {      //n es el numero que le paso y que tengo que comprobar si es primo

	    if (n < 2) {                     //si n<2 entonces eso no es un numero primero (negativos, 0 y 1)
	        return false;
	    }

	    for (int i = 2; i < n; i++) {      //para comprobar si es primo tengo que hacer un bucle for que se ejecuta mientras que i<n, un numero primo es aquel que solo es divisible por 1 y por si mismo
	    									//por ej. le paso n=9, 9 divido por cualquier numero i distinto de 9 siempre va a dar modulo distinto de 0 por lo que la condicion n%i==0 nunca va a ser true y por tanto se va a ejecutar la siguiente linea de return true (efectivamente es primo)
	        if (n % i == 0) {				//por ej. le paso n=4, en el primer ciclo 4%2=0  por lo que 4%2=0==0 va a ser true y el metodo me devuelve false (efectivamente no es un primo)
	            return false;
	        }
	    }

	    return true;
	}
	public static void main(String[] args) {
		
		int contador = 0;
		int numero = 2;
		System.out.println("Los 100 primeros números primos son: ");
		
		while (contador < 100) {             //necesito obtener 100 numeros primos, por eso el contador aumenta solo cuando obtengo un numero primo
			if (esPrimo(numero)) {
				System.out.println(numero + " ");
				contador++;
			}
			numero++;  //al salir del if tengo q pasar al siguiente numero para usarlo en el siguiente ciclo
		}

	}
//		for(int i=2; i<100; i++) {
//			if(esPrimo(i)) {
//				System.out.println(i);
//			}
//		}

		
		
	}


