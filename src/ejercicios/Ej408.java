package ejercicios;

public class Ej408 {
	
	public static int contarVocales(String texto) {
		int contador = 0;
		
		for(int i = 0; i < texto.length(); i++) {
			char c  = texto.charAt(i);
			
			if( c == 'a' || c == 'e' || c== 'i' || c == 'o' || c == 'u') {
				contador++;
			}
		}
		return contador;
	}
	
	
	private static int contarVocales2(String texto) {
		if (texto == null) {
			return 0;
		}

		int veces = 0;
		String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";

		for (int i = 0; i < texto.length(); i++) {            //vocales.indexOf() devuelve la posicion de un caracter, por ejemplo vocales.indexOf('a')
			if (vocales.indexOf(texto.charAt(i)) != -1) {    //texto.charAt(i) me devuelve el caracter en la posicion i, por ejemplo 'e', 
				veces++;                   //vocales.indexOf(e) tendria que darme la posicion distinta de -1, si texto.charAt(i) me devolviese por ejemplo 'p', entonces vocales.indexOf(p) me devuelve -1 y no se ejcuta (el if seria falso)
			}
		}

		return veces;
	}

	public static void main(String[] args) {
		
		String txt = "Hola que tal";
		System.out.print("Numero de vocales: " + contarVocales(txt));
		System.out.print("Numero de vocales: " + contarVocales2(txt));
	}

}
