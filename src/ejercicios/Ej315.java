package ejercicios;

public class Ej315 {

	public static int numeroDeMaximos(float[] array) {
		
		//tengo que calcular cuantos maximos locales hay, es decir, un numero que sea mayor q su posicion anterior y mayor que su posicion posterior
		//una vez tenga este numero, utilizo este numero para poner un tamaño a arrayMaximos
		int cantidad = 0;
		
		for(int i = 1; i < array.length - 1; i++) {  	//si empiezo en i=0, este no va a tener posicion anterior a el, por eso empiezo en 1 array[i-1]
														// no puedo terminar tampoco en array length, por ejemplo si el array es de tamaño 4, voy a tener length de 4 y 3 posiciones, array[i+1], si i=3 (ultimo ciclo del for), se saldria de los limites del array ya que array[3+1]=array[4] y dicho array solo tiene 3 posiciones, no tiene 4
			float numeroAnterior = array[i-1];
			float numeroPosterior = array[i+1];
			if(array[i] > numeroAnterior && array[i] > numeroPosterior) { //el AND solo es true si ambas condiciones son true
				cantidad++;
			}
		}
		
		return cantidad;
	}
	
	
	public static float[] maximosLocales (float[] array) {
		
		int tamanio = numeroDeMaximos(array);
		float[] arrayMaximos = new float[tamanio];    //lo que voy a devolver
		int posicion = 0; 							//posicion que le asigno a los maximos, sus posiciones no coinciden con las posiciones del array por ejemplo (0,1,0,4,2,9,0) -> (1,4,9)
		for(int i = 1; i < array.length -1; i++) { //busco los maximos dentro del "array" y los guardo en el "arrayMaximos"
			float anterior = array[i-1];
			float posterior = array[i+1];
			if(array[i] > anterior && array[i] > posterior) {
				arrayMaximos[posicion] = array[i];
				posicion++; 
				 
		}
					 
			 
		 }
		
		
		return arrayMaximos;
	}
	
	public static void main(String[] args) {
		float[] miArray = { 1f, 5f, 2f, 8f, 3f, 3f, 9f, 1f };
		float[] miArrayConMaximos = maximosLocales(miArray);
		for(int i = 0; i < miArrayConMaximos.length; i++) {
			System.out.println(miArrayConMaximos[i]);           //otra forma: for (float valor : maximos) {System.out.println(valor);}
		}

	}

}
