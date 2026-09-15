package ejercicios;

public class Ej307 {

	public static int[] copiaArray(int[] array, int factor) { //multiplico los elementos del array por el factor y copio esos numeros en un nuevo array
		if (array == null) {
			return new int[0];
		}
		
		int[] copia = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			copia[i] = factor * (array[i]);
		}
		return copia;
	}
	
	
	public static void main(String[] args) {
		
		int[] miArray = {2, 6, 0, 4, 9};
		int[] nuevoArray = copiaArray(miArray, 2);
		for(int i = 0; i< nuevoArray.length; i++) {
			System.out.println(nuevoArray[i] + " ");
		}

	}

}
