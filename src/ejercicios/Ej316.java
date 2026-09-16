package ejercicios;

public class Ej316 {
	public static int[][] generarMatriz (int dimension1, int dimension2){
		
		int[][] resultado;
		if(dimension1 == dimension2) {
			resultado = new int[dimension1][dimension2];  //lo pongo sin el int delante (int resultado) pq ya esta declarado, solo tengo q inicializarlo
		}else {
			return new int[0][0];  //array vacio
		}
		
		
		
		return resultado;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
