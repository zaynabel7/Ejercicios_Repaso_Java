package ejercicios;

public class Ej402Corregido {

	public static void main(String[] args) {
		String txt = "programacion";
		char charBuscado = 'a';
		int veces = contar(txt, charBuscado);
		System.out.println("'" + charBuscado + "' aparece " + veces + " veces.");
	}

	// Cuenta las apariciones de un char en un String.

	private static int contar(String texto, char buscado) {
		if (texto == null) {
			return 0;
		}
		int veces = 0;  //el bucle for sirve para recorrer el string para contar las veces que aparece un mismo caracter en un string
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == buscado) {
				veces++;
			}
		}
		return veces;
	}
}
