package ejercicios;

public class Ej303 {

	public static int[] array16() {    //Genera el array con la secuencia 0..15 repetida. 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0, 1, 2, ...
		
		int[] array = new int[300];            //tengo que crear un array de 300 posiciones y en cada nposicion se guarda el indice de la posicion en modulo 16, por ejemplo, el indice 2 en modulo 16 es 2, el indice 270 en modulo 16 es 14
		for(int i=0; i < array.length; i++) {
			array[i] = i % 16;        //En cada posición, guardo el resto de dividir el índice i entre 16.
		}
		
		
		return array;
	}
	
	
	public static void main(String[] args) {
		//System.out.println(array16());
		
		int[] miArray = array16();
		for(int i=0; i < miArray.length; i++) {
			System.out.print(miArray[i] + ", ");   
		}

	}

}
