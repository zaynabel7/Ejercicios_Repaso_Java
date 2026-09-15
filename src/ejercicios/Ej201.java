package ejercicios;

public class Ej201 {
	
	static short diasDeAnio = 365;
	static byte horasEnDia = 24;
	static byte minutosEnHora = 60;
	static byte segundosEnMinuto = 60;
	// short (-32768, 32767)
	// byte (-128, 127)
	
	//el metodo calculaSegundosEnAnio() no puede llamarse directamente desde main porque main es static y no puede llamar a otro metodo que no es static
	//al hacer que calculaSegundosEnAnio() sea static, las variables que se usan tambien deber ser static
	
	public static long calculaSegundosEnAnio (){                               //long porque lo que da este calculo es mayor que lo que cabe en el tipo int
		return minutosEnHora * segundosEnMinuto * horasEnDia* diasDeAnio;
	}
	

	public static void main(String[] args) {
		long segundosEnAnio = calculaSegundosEnAnio();                //almaceno el valor del calculo en la variable segundosEnAnio para poder imprimirla luego
		System.out.println("El número de segundos que tiene un año es: " + segundosEnAnio);
		
	}

}
