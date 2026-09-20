package ejercicios;

public class Ej409 {
	
	public static String escribirAlreves(String texto) {
		StringBuilder resultado = new StringBuilder();
		for(int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(texto.length() -1 -i); //empiezo desde la ultima posicion y voy retrocediendo par atras
			resultado.append(c);
		}
		
		return resultado.toString();
	}
	
	
	//otra forma: return new StringBuilder(texto).reverse().toString();
	public static void main(String[] args) {
		
		String txt = "Hola que tal";
		System.out.print(escribirAlreves(txt));

	}

}
