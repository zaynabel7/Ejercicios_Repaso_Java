package ejercicios;

import java.util.Scanner;

public class Ej208otraforma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] v1 = new double[3];     //tipo[array] nombre
		double[] v2 = new double[3];
		
		System.out.println("Introduce el primer vector 3D: ");
		for(int i = 0; i < 3; i++) {
			System.out.println("Componente "+ (i+1) + ": ");
			v1[i] = sc.nextDouble();
		}

		System.out.println("Introduce el segundo vector 3D: ");
		for(int i = 0; i < 3; i++) {
			System.out.println("Componente "+ (i+1) + ": ");
			v2[i] = sc.nextDouble();
		}
		
		double productoEscalar = 0;
		
		for(int i = 0; i < 3; i++) {
			productoEscalar = productoEscalar + (v1[i]*v2[i]);           // (2,0,2)*(1,0,1), 1º ciclo productoEsc = 4, 2º ciclo productoEsc = 4+0=4, 3º ciclo productoEsc = 4+2=6 
		}
		
		
		System.out.println("El producto escalar de ambos vectores es: " + productoEscalar);
		
		sc.close();
	}

}
 