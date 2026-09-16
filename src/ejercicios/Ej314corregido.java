package ejercicios;

public class Ej314corregido {
	
	public static float calcularMaximoAbsoluto(float[] array) { 
		
		if (array == null || array.length == 0) {
			return 0;
		}

		float maximo = Float.NEGATIVE_INFINITY;
		for(int i = 0; i < array.length; i++) {
			float numero = Math.abs(array[i]); //la variable numero guarda el valor absoluto del numero que se encuentra en la posicion i
			if(numero > maximo) {
				maximo = array[i];
			}
		}
		return maximo;
	}
	
	public static float[] normalizarArray(float[] array) {
		if (array == null || array.length == 0) {
			return new float[0];
		}
	
		float[] normalizado = new float[array.length];  //el array de normalizado tiene el mismo tamaño q el array q se pasa como parametro
		
		float maximo = calcularMaximoAbsoluto(array);
		for(int i = 0; i < array.length; i++) {
			normalizado[i] = array[i]/maximo; //el maximo ya esta en valor absoluto
		}
		return normalizado;
	}
	public static void main(String[] args) {
		//normalizar es dividir cada valor por el maximo (valor absoluto)
		float[] miArray = {-2.5f, 5.77f, 8.9f, -0.2f, 7.34f};
		float[] miArrayNormalizado = normalizarArray(miArray);
		for(int i = 0; i < miArrayNormalizado.length; i++) {
			System.out.print(miArrayNormalizado[i] + "  ");
		}
	}

}




//otra forma

//float maximo = 0f;										creo una variable maximo que empieza valiendo 0
//for (float valor : array) {                               uso el bucle for each para recorrer todos los elementos uno a uno 
	//float absoluto = Math.abs(valor);                     calculo el valor absoluto del numero actual
	//if (absoluto > maximo) {                              compruebo si es mas grande que el maximo que se ha guardado hasta ahora, si es mas grande, se asigna el maximo a este valor actual, si no es mayor se mantiene igual
		//maximo = absoluto;

//for(float valor : array)        float -> el tipo de dato de cada elemento del array, valor -> variable que va tomando cada elemento, : -> dentro de, array -> lo recorremos
//Para cada elemento float del array datos, llámalo temporalmente valor