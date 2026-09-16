package ejercicios;

public class Ej314 {
	
	public static float calcularMaximo(float[] array) { //con esta forma encontraria el maximo pero no en valor absoluto, por ejemplo (8, 5, -10, -1, 6), el maximo es 8, pero en valor absoluto, el maximo es 10
		float maximo = Float.NEGATIVE_INFINITY;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > maximo) {
				maximo = array[i];
			}
		}
		return maximo;
	}
	
	public static float[] normalizarArray(float[] array) {
		float[] normalizado = new float[array.length];
		
		float maximo = calcularMaximo(array);
		float maximoEnAbsoluto = Math.abs(maximo);
		for(int i = 0; i < array.length; i++) {
			normalizado[i] = array[i]/maximoEnAbsoluto;
		}
		return normalizado;
	}
	public static void main(String[] args) {
		//normalizar es dividir cada valor por el maximo (valor absoluto)
		float[] miArray = {-2.5f, 5.77f, 8.9f, -0.2f, 7.34f};
		float[] miArrayNormalizado = normalizarArray(miArray);
		for(int i = 0; i < miArrayNormalizado.length; i++) {
			System.out.print(miArrayNormalizado[i] + "  ");
		}
	}

}
