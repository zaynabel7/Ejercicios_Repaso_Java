package ejercicios;

public class Ej309 {

	public static char[] invertirOrden(char[] array) {
	
		if (array == null) {
			return new char[0]; //crear un array de char que tenga 0 posiciones.
		}
		
		char[] invertido = new char[array.length];
		
		for (int i = 0; i < array.length; i++) {
			int tamanio = array.length;
			invertido[i] = array[tamanio-1-i];  //por ej, si el tamaño es 6, el caracter que se encuentra en la posicion i = 0 pasa a estar en la posicion 6-1-0 = 5, el caracter en i=1 pasa a 6-1-1=4, y asi hasta el i=5, que pasa a estar en 6-1-5=0
		}
		return invertido;
		
		
	}
	public static void main(String[] args) {
		
		char[] miArray= {'a', 'b', 'c', 'd', 'e', 'f'};
		char[] miArrayInvertido = invertirOrden(miArray);
		
		for(int i = 0; i< miArrayInvertido .length; i++) {
			System.out.println(miArrayInvertido [i] + " ");
		}

	}

}
