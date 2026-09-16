package ejercicios;

public class Ej312 {

	public static char[] concatenarArrays(char[] array1, char[] array2) {
		int tamanio = array1.length + array2.length;
		char[] arrayResultante = new char[tamanio];
		for(int i = 0; i < array1.length; i++) {
			arrayResultante[i] = array1[i];
		}
		
		for(int i = 0; i < array2.length; i++) {
			arrayResultante[i+ array1.length] = array2[i]; //i+array1.length es la posicion donde termino el primer array y empieza el segundo
		}
		
		return arrayResultante;
	}
	public static void main(String[] args) {
		
		char[] miArray1 = {'h', 'o', 'l', 'a'};
		char[] miArray2 = {'j', 'a', 'j', 'a'};
		char[] miArrayResultante = concatenarArrays(miArray1, miArray2);
		for(int i = 0; i < miArrayResultante.length; i++) {
			System.out.print(miArrayResultante[i] + "  ");
		}
		
		System.out.println(new String(miArrayResultante)); //escribirlo seguido
	}

}
