package ejercicios;

public class Ej404 {

	public static String mayusculas(String texto) {
		
		String textoMayus = texto.toUpperCase();
		return textoMayus;
	}
	
	public static String minusculas (String texto) {
		String textoMinus = texto.toLowerCase();
		return textoMinus;
	}
	public static void main(String[] args) {
		String txt = "Soy un gatito. Yo maullo mucho y duermo mucho.";
		System.out.println("Mayusculas: " + mayusculas(txt));
		System.out.println("Minusculas: " + minusculas(txt));

	}

}
