package ejercicios;

public class Ej317 {

	public static float[] filtro (float[] array, float umbral) {  //primero contar → crear array del tamaño exacto → rellenarlo
		if (array == null || array.length == 0) {
			return new float[0];
		}
		int  contador = 0;	
		for(int i = 0; i < array.length; i++) {
			if(array[i] > umbral) {
				contador++;    //cuenta cuantos numeros superan el umbral, contador = tamaño del array resultado
			}
		}
		
		
		float[] resultado = new float[contador];
		int posicion = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > umbral) {  //si el numero en la posicion i supera el umbral entonces guarda el numero en la posicion i en el array de resultado
				resultado[posicion] = array[i];
				posicion++;  //la posicion del array de resultado no tiene pq coincidir con la posicion i del array, por eso hay q incrementarla cada vez q se guarde un nuevo numero p. ej array = (6,1,4,2,11,15), umbral =4, resultado=(6, 11, 15)
			}
		}
		
		return resultado;
	}
	public static void main(String[] args) {
		float[] miArray = {9f, 1f, 6.7f, 6f, 9.4f, 2.1f, 2f, 0.2f, 1.4f};
		float[] miArrayFiltrado = filtro(miArray, 2f);
		
		for(int i = 0; i < miArrayFiltrado.length; i ++) {
			System.out.print(miArrayFiltrado[i] + "   ");
		}

	}

}
