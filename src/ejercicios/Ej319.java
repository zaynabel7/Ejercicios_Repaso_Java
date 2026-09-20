package ejercicios;

public class Ej319 {
	public static int[] submuestreo (int[] array, int nivel) { //submuestreo: cada cuantas muestras conservo una
		
		if (array == null || nivel <= 0) {
			return new int[0];
		}

		int contador = 0;
		for(int i = 0; i < array.length; i=i+nivel) {
			contador++;
		}
	
		int[] resultado = new int[contador]; //cuento cuantos numeros se pueden submuestrear, para tener el tamaño del array resultante
		
		int posicion = 0;
		for(int i=0; i < array.length; i = i+nivel) {   //i=i+nivel, actualiza la posicion i, si va de 4 en 4, i = i+4 hasta recorrerse todo el array
			resultado[posicion] = array[i];
			posicion++;
		}
		
		
		return resultado;
	}
	public static void main(String[] args) {
		int[] miArray = {2, 5, 6, 6, 8, 0, 3, 2, 15, 17, 0 ,9};
		int[] miArraySubmuestreado = submuestreo(miArray,2);
		
		for(int i = 0; i < miArraySubmuestreado.length; i++) {
			System.out.print(miArraySubmuestreado[i] + "  ");
		}
	}

}
