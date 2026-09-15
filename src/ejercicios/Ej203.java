package ejercicios;

public class Ej203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int suma = 0;
		int contador = 0;
		
		for(int i = 1; i <= 100; i++) {       //suma de todos los multiplos comprendidos entre 1 y 100, inicio en 1 y ejecuto el bucle hasta que i valga 100, en cada ciclo i incrementa 1
			if (i%5 == 0) {             //modulo, si i%5 es 0 eso significa que no hay resto (por ejemplo 15%5=0 porque 15/5=3 y no hay resto), dentro del if se compara el modulo con el 0, si el modulo es 0, entonces 0==0 es true y se ejecuta el if, si es distinto de 0 entonces la comparacion es false y no se ejecuta el if
				suma = suma + i;        //suma de lo que habia antes mas el nuevo multiplo de 5 (i)
				contador++;             //el contandor incrementa en 1 cada vez que haya un nuevo multiplo de 5 (i)
			}
		}
		
		System.out.println("Cantidad de múltiplos: " + contador);
		System.out.println("Suma total: " + suma);
		
		//lo que faltaba: la lista de multiplos de 5
		
		System.out.println("Múltiplos de 5 entre 1 y 100:");
		for (int i = 5; i <= 100; i += 5) {            //i +=5 es lo mismo que i = i+5
			System.out.print(i + " ");
		
		}
	}

}
