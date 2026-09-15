package ejercicios;

public class Ej301 {

	public static float sumaElementos(float[] array) {
		
		if (array == null) {
			return 0;
		}
		
		float suma = 0;
		for (int i =0; i< array.length; i++) {     //si mi array tiene tamaño 3, entonces recorro i=0, i=1, i=2, no recorro i=3 porque no hay
			suma = suma + array[i];
		}
		
		
		return suma;
		
		
	}
	
	public static void main(String[] args) {
		float[] miArray = {5 , 6, 10 };       //array formado por floats (aunq haya puesto enteros)
		System.out.println("La suma total es: " + sumaElementos(miArray));
		
		//float[] datos = { 1.5f, 2.5f, 3.0f, -1.0f, 4.25f }; f para indicar que son float y no double

	}

}
