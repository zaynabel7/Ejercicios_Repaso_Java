package ejercicios;

public class Ej402 {

	public static int contadorChar(String texto) {
		
		int contador = 0;
		for(int i = 0; i<texto.length(); i++) {
			char c  = texto.charAt(i);
			if(Character.isLetter(c)) {
				contador++;
			}
			
		}
		
		return contador;
	}
	public static void main(String[] args) {
		
		String txt = "abc887872def";
		System.out.print("Veces que aparece un caracter: " + contadorChar(txt));

	}

}
