package ejercicios;

public class Ej305 {

	public static float devolverPromedio(float[] array) {
		
		float suma = 0;
		float contador = 0;
		
		if (array == null || array.length == 0) {   //si el array no existe (null) o la longitud del array es 0 (0 elementos), entonces devuelve 0, recordar OR solo es falso si ambos son falsos, en ese caso no se ejecutaria el cuerpo y se ejecutaria la siguiente linea
			return 0; } 
		
		for(int i = 0; i < array.length; i++) {   
			suma = suma + array[i];	//va recorriendo el array y sumando elemento a elemento
			contador++;
				}
		
		return suma/contador;        //promedio= suma de todos los elementos/numero de elementos, otra forma: suma/array.length
	
	}
	
	public static void main(String[] args) {
		float[] miArray = {19.99f, 5f, 3.4f};
		System.out.println("El promedio es: " + devolverPromedio(miArray));

	}

}
