package ejercicios;

import java.util.Scanner;

public class Ej208 {

	private static double[] leerVector(Scanner sc) {   //esta funcion devuelve un ARRAY de doubles y le paso como parametro un scanner
		double[] vector = new double[3];				//lo que hace es leer las 3 componentes de un vector y devuelve un array de doubles con esas 3 comp
		String[] nombres = { "X", "Y", "Z" };			//inicializo el array vector para poder rellenarlo y llamo a un array de strings con las comp x, y, z para poder imprimirlas y asignarlas a una componente del vector

		for (int i = 0; i < 3; i++) {
			System.out.print("Componente " + nombres[i] + ": ");      //i=0=X, i=1=Y, i=2=Z
			vector[i] = sc.nextDouble();           //"Lee el número decimal que introduce el usuario.", cuando pone en pantalla Componente X: eso es q se ha ejecutado el sc.nextdouble()
		}

		return vector;   //importante: despues del bucle for  me tiene que devolver el vector
	}
	
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);  //scn permite leer lo que introduce el usuario por teclado.    

		System.out.println("Introduzca las componentes del primer vector 3D:");  //cuando se ejecuta el codigo, se ejecuta solo el main, yo le voy a asignar al vector v1 el vector que devuelve la funcion leerVector
		double[] v1 = leerVector(scn); //cuando se ejecuta esto es como si saltase a la funcion leerVector y ahi el scanner t empieza a pedir numeros

		System.out.println("Introduzca las componentes del segundo vector 3D:");
		double[] v2 = leerVector(scn);

		scn.close();

		double productoEscalar = calcularProductoEscalar(v1, v2);
		System.out.println("\nProducto escalar: " + productoEscalar);
	}

	// Lee un vector de 3 componentes desde el usuario
	

	// Calcula el producto escalar (dot product) de dos vectores
	private static double calcularProductoEscalar(double[] u1, double[] u2) { //le paso dos parametros
		double resultado = 0.0;
		for (int i = 0; i < 3; i++) {
			resultado = resultado + (u1[i] * u2[i]);        //u1=v1, u2=v2
		}
		return resultado;
	}
	}


