  package ejercicios;

public class Ej320 {
	
	
	public static int media(int n1, int n2) {
		int suma = n1 + n2;
		return suma/2;
	}
	
	public static int[] interpolacion(int[] array) {  // Entre cada dos muestras consecutivas inserta la media de ambas.
		
		//int tamanio = array.length + array.length/2; //las posiciones q tenia + las nuevas posiciones, NO FUNCIONA PARA TODOS LOS TAMAÑOS
		
		int tamanio = array.length + (array.length - 1); //ejemplo: tamaño 4, 3 medias -> tamaño 7 (elementos), es decir 7-1=6 posiciones
		int[] resultado = new int[tamanio];
	
		for(int i = 0; i < array.length; i++) {   
		resultado[i*2] = array[i]; //las posiciones q no se mueven son los numeros pares
		
		if (i < array.length - 1) {
			int mediaInterpolada = media(array[i], array[i+1]);    //i=0, media de la posicion i=0 y i=1, i=3 media de la posicion i=3 y i=2
			resultado[i*2+1] = mediaInterpolada;          //en los impares esta la media             //si tamaño =4, i=3, 3 < 4-1 -> false, asi no se ejecuta array[3+1] pq se sale delos indices
			
		}
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		int[] miArray = { 10, 20, 40, 70 };
		int[] miArrayInterpolado = interpolacion(miArray);
		for (int valor : miArrayInterpolado) {
			System.out.println(valor);
		}

	}

}
