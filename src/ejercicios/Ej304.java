package ejercicios;

public class Ej304 {

	public static char[] array16() {    //se repite la secuencia 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F, 0, 1, 2, ...
		
		char[] array = new char[300];    //me pide crear array de chars
		for(int i = 0; i < array.length; i++) {
			
			char numeroHexadecimal = Character.forDigit(i % 16, 16); //(numero, base 16), en este caso cada numero es una posicion que contiene el indice en modulo 16, por eso hacemos i%16
			array[i] = Character.toUpperCase(numeroHexadecimal);  
			
			//forDigit convierte un número en el carácter que representa ese número en una determinada base. por ej. Character.forDigit(5, 10) devuelve 5, Character.forDigit(10, 16) devuelve 'a'
			//Character.toUpperCase(...)convierte el carácter a mayúscula. por ej. Character.toUpperCase('a') devuelve 'A'
			//otra forma array[i] = Character.toUpperCase(Character.forDigit(i % 16, 16));
		}

		return array;}
		
	public static void main(String[] args) {
			
			char[] miArray = array16();
			for(int i=0; i < miArray.length; i++) {
				System.out.print(miArray[i] + ", ");   
			}
	}

}
