package ejercicios;

public class Ej406 {
	public static String reemplazar (String texto) { //no me sirve lo de replace(old char, new char)
		
		if (texto == null) {
			return texto;
		}

		StringBuilder resultado = new StringBuilder();
		
		for(int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i); //llamo c al caracter q se encuentra en esa posicion i
			if(c == '.') {
				resultado.append(',');  //compruebo si ese caracter c es un punto, si es true, lo sustituyo por , (con el metodo append), NO HAGO REPLACE
			} else if (c == ',') {
				resultado.append('.'); //compruebo si ese caracter c es una coma , si es true, lo sustituyo por .
				
			}else {
				resultado.append(c); //si el caracter c no es ni punto n coma entonces lo añado a mi string builder de forma normal
			}
		}
		return resultado.toString();   //no olvidar que el stringbuilder lo tengo que convertir a string (q es lko q tiene q devolver el metodo)
		
	}
	public static void main(String[] args) {
		
		String txt = "En esta frase, ocurre algo curioso... Ya que, los signos de puntuacion, no corresponden...";
		
		System.out.print(reemplazar(txt));

	}

}
