package ejercicios;

public class Ej205 {

	public static void main(String[] args) {
		
		for(int i=1; i <= 10; i++) {
			System.out.println("Tabla de multiplicar del: "+ i);  //en el primer ciclo se establece el valor de i y se entra al 2ndo bucle for para calcular su tabla de multiplicar
			for(int j=1; j <= 10; j++) {							//se ejecuta el bucle for para el valor actual de i y se va multiplicando por los valores que toma j, una vez q j llega a 10 se sale de este bucle for para ejecutar el espacio y luego se vuelve a ejecutar el primer bucle para tomar el siguiente valor de i y otra vez vuelve a entrar en el segundo bucle for y asi hasta que i valga 10 y ya ser ael ultimo bucle 
				System.out.println(i + "x" + j + "=" + (i*j));    
			}
			System.out.println(); //espacio entre tablas 
		}

	}

}
