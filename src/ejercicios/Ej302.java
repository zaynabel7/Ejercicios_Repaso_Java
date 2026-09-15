package ejercicios;

public class Ej302 {

	public static int buscaNumero(int[] array, int numeroBuscado) {
		
		//int posicion = 0;          no defino posicion 0 pq es una posicion valida
		
		int posicion = -1;
		if(array != null) {
			for(int i = 0; i < array.length; i++) {
				if(array[i] == numeroBuscado) {
					posicion = i;
				}
		}
	}
		return posicion;
	}
	
		//posicion = -1;             esta mal porque es una posicion valida, lo que tengo que hacer es definir desde el principio que la posicion es -1 hasta que se encuentre el numero, si se encuentra el numero devuelve la nueva posicion pero si no lo encuentra entonces se queda en -1
	
	
	public static void main(String[] args) {
		
		int[] miArray = {2, 3,9, 5, 6, 0};
		System.out.println("Busco el numero 6 y su posicion es: " + buscaNumero(miArray, 6));
		System.out.println("Busco el numero 10 y su posicion es: " + buscaNumero(miArray, 10));
		
	}

}
