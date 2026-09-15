package ejercicios;

public class Ej308 {

	public static int contarNegativos(float[] array) {
		
		if (array == null) {
			return 0;
		}
		
		int contador = 0;
		
		for(int i =0; i < array.length; i++) {
			if(array[i] < 0) {
				contador++;
			}
		}
		
		return contador;
		
	}
	public static void main(String[] args) {
		float[] miArray = {1.2f, -3.44f, -7.61f, 9f, 4.2f};
		int numeroDeNegativos = contarNegativos(miArray);
		System.out.println("Hay "+ numeroDeNegativos + " numeros negativos");
	}

}
