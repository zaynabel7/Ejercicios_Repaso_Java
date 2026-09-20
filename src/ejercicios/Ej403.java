package ejercicios;

/**
 * Ejercicio 4.3: elimina espacios en blanco al final de un String.
 */
public class Ej403 {

	public static void main(String[] args) {
		String texto = "hola mundo   \t ";
		String resultado = eliminarEspaciosFinal(texto);
		System.out.println("Original: '" + texto + "'");
		System.out.println("Sin espacios al final: '" + resultado + "'");
	}

	// Elimina espacios en blanco solo al final del String.
	private static String eliminarEspaciosFinal(String texto) {
		if (texto == null || texto.isEmpty()) {
			return texto;
		}

		int fin = texto.length() - 1; //las posiciones de los strings empiezan en 0 (como los arrays) por eso un string de tamaño 4 empieza en i= 0 y termina en i= 3
		while (fin >= 0 && Character.isWhitespace(texto.charAt(fin))) { //comprueba si el caracter en esa posicion fin es un espacio en blanco
			fin--; //tenemos que decrementar fin para volver hacia atras en el string y ver si sigue habiendo espacio en blanco, una vez q se compruebe que charAt(fin) ya no es espacio en blanco, se sale del bucle
		}

		return texto.substring(0, fin + 1);
	}
}
