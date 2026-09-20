package ejercicios;

public class Ej318Corregido {

		public static float[] arrayMediaMovil (float[] array, int ventana) {
		
		if (array == null || ventana <= 0 || array.length < ventana) {
				return new float[0];
			}

		int tamaño = array.length - ventana + 1;    
		float[] resultado = new float[tamaño];
		
		int posicion = 0;  //la posicion la inicializo como 0 fuera pq si la inicializo dentro del for, cada vez q actualice i, la posicion volveria a valer 0, yo quiero que la posicion vaya incrementando y por eso dentro solo escribo posicion++
		for(int i = (ventana -1); i < array.length; i++) { 
			float suma = 0; //la suma la inicializo como 0 dentro porque para cada posicion se hace el calculo de la suma, cada vez q actualizo i, la suma vuelve a valer 0 y se calcula para la nueva posicion
			
		    for (int j = 0; j < ventana; j++) {  //j va a permitirme retroceder posiciones atras
		    	
		    	suma = suma + array[i - j];  //si ventana = 4, i=5, 1º j=0, ciclo suma = suma + array[5], 2º ciclo, j=1 suma = suma + array[4], 3º ciclo, j=2 suma = suma + array[3], ... 
		        }                            //se suman tantos elementos como indique la ventana, se suma elemento a elemento, por eso necesitamos un bucle, en el primer ciclo la suma vale 0+ array[5], en el segundo ciclo vale array[5]+array[4], en el tercero vale array[5]+array[4]+array[3]+...
			
		    float mediaMovil = suma/ventana;
			resultado[posicion] = mediaMovil;
			posicion++;
		}
		
		return resultado;
	}
	public static void main(String[] args) {
		float[] miArray = {2f, 5f, 6f ,9f, 0.2f, 6.4f, 2.2f, 5.5f, 6.8f}; 
		float[] miArrayDeMedias = arrayMediaMovil(miArray,4);
		
		for(int i = 0; i < miArrayDeMedias.length; i++) {
			System.out.print(miArrayDeMedias[i] + "   ");
		}

	}

}
