package ejercicios;

import java.util.Scanner;

public class Ej316otraforma {
	
	public static int[][] generarMatriz(int dimension){
		
		if (dimension <= 0) {
			return new int[0][0];
		}
		
		int[][] matriz = new int[dimension][dimension];  
		for(int i = 0; i < matriz.length; i ++){
			for(int j = 0; j < matriz[i].length; j ++) {

				if(i == j) {
					matriz[i][j] = (int) (Math.random()*10); 
				}
				
				if(i!=j && matriz[i][j]==0) { 
					matriz[i][j] = (int) (Math.random()*10);
					matriz[j][i] = matriz[i][j]; 
			}
			}}	
			
		return matriz;
	}
	
	
	private static void mostrar(int[][] matriz) {  //matriz = array de arrays
		for (int[] fila : matriz) { //Para cada fila (int[]) que haya dentro de matriz...
			for (int valor : fila) {  //Para cada valor (int) que haya dentro de fila..., una vez q acaba de imprimir todos los elementos de una fila, se acaba el segundo for y vuelve a ejecutarse el primer for para pasar a la siguiente fila
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dimensión de la matriz: ");
		int dimension = sc.nextInt();
		sc.close();
		
		int[][] miArray = generarMatriz(dimension);
		for(int i = 0; i < miArray.length; i++) {
			for (int j = 0; j < miArray[i].length; j++) {
				System.out.print(miArray[i][j] + "   ");
			}
			System.out.println("  ");
		}
		
		mostrar(miArray);

	}


	}


