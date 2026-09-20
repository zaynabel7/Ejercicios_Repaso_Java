package ejercicios;

public class Ej318 {
	public static float[] arrayMediaMovil (float[] array, int ventana) {
		
		int tamaño = array.length - ventana + 1;    //Si la ventana es 3 y el tamaño del array es 9, entonces no se podra calcular la media de los dos primeros numeros y por eso el tamaño de el array resultante es 7
		float[] resultado = new float[tamaño];
		
		int posicion = 0;
		for(int i = (ventana -1); i < array.length; i++) { //i empieza en ventana - 1, si ventana = 3, empieza en la posicion i = 2 (posicion 3)
			float suma = array[i] + array[i-1] + array[i-2]; //OJO!!!!!!!!!!! ESTO ESTA MAL PQ ES PARA UNA VENTANA DE 3 ELEMENTOS, SE TIENEN Q SUMAR TANTOS ELEMENTOS COMO INDIQUE LA VENTANA, NO TIENE PQ SER 3
			float mediaMovil = suma/ventana; //ventana=numero de elementos
			resultado[posicion] = mediaMovil;
			posicion++;
		}
		
		return resultado;
	}
	public static void main(String[] args) {
		float[] miArray = {2f, 5f, 6f ,9f, 0.2f, 6.4f, 2.2f, 5.5f, 6.8f}; 
		float[] miArrayDeMedias = arrayMediaMovil(miArray,3);
		
		for(int i = 0; i < miArrayDeMedias.length; i++) {
			System.out.print(miArrayDeMedias[i] + "   ");
		}

	}

}
