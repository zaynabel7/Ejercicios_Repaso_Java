package ejercicios;

public class Ej306 {

	public static float[] maximoFila(float[][] array) {
		
		if (array == null) {
			return new float[0];
		}
		
		float[] maximoEnCadaFila = new float[array.length];     //Como quieres guardar un máximo por cada fila, el array de maximos debe tener tantas posiciones como filas tenga la matriz, no puedes poner float[] maximoEnCadaFila = new float[0]; porque estarias creando un array de 0 posiciones al que no se le pueden añadir posiciones

		//float maximo = Float.MIN_VALUE; ERROR!!!!!!!!!!! Float.MIN_VALUE Puede parecer que significa "el número float más pequeño", pero no es el menor float negativo. Representa el menor valor positivo distinto de cero de float.Para buscar un máximo que podría incluir números negativos, es mucho más seguro usar: Float.NEGATIVE_INFINITY
		
		//ejemplo: array 3x4, 3 filas, 4 columnas
		// 1º escojo fila 2º recorro fila
		//PRIMER FOR: recorre todas las filas de la matriz, se ejecuta el primer for, asigno i=0 (fila 1), se ejecuta el segundo for y se empiezan a recorrer todas las columnas de esa primera fila (se recorren todas las posiciones
		//array.length: numero de filas que tiene la matriz, array[i].length: numero de elementos en esa fila
		//SEGUNDO FOR: recorre todas las columnas de la fila i, si estoy en la fila 0,va a recorrer las posiciones (0,0), (0,1), (0,2), (0,3), si estoy en la fila 2 entonces seria (2,0) (2,1), etc...
		//hasta que no termine de ejecutarse el segundo for, i sigue valiendo lo mismo, cuando termina de ejecutarse el segundo for, vuelve al primer for para actualizar el valor de i y se vuelve a ejecutar el segundo for
		
		
		
		for(int i = 0; i < array.length; i++) {      
			float maximo = Float.NEGATIVE_INFINITY;           //maximo debe reiniciarse dentro del primer for, al comenzar cada fila, porque en cada fila hay un maximo diferente, si i=0 (fila 1), cuando se temrina de recorrer la segunda fila habre obtenido el maximo de la primera fila y lo habre guardado en el array, por lo que debo reiniciar su valor para buscar el maximo de la segunda fila
			for(int j = 0; j < array[i].length; j++) { 
				if(array[i][j] > maximo) {    //compruebo si el numero en la posicion (i,j) es mayor que el maximo numero = array[i][j]
					maximo = array[i][j];
				}
				
			}
			
			maximoEnCadaFila[i] = maximo;    //guarda el maximo de cada fila i (i=0,1,2,...)
		}
		
		return maximoEnCadaFila;
	}
	
	public static void main(String[] args) {
		
		float[][] miArray = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		float[] maximos = maximoFila(miArray);
		for(int i=0; i < maximos.length; i++) {
			System.out.println ("Máximo fila " + i + ": " + maximos[i]);
		
	}
	}

}
