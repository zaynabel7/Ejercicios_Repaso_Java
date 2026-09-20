package ejercicios;

public class Ej316corregido {

	public static int[][] generarMatriz(int dimension){
		int[][] matriz = new int[dimension][dimension];  //matriz cuadrada
		
		for(int i = 0; i < matriz.length; i ++){
			for(int j = 0; j < matriz[i].length; j ++) {

				if(i == j) {
					matriz[i][j] = (int) (Math.random()*10); //pongo un numero aleatorio en la posicion aii, (int) transforma en entero el numero que devuelve math.random (este devuelve numeros entre 0 y 1, al hacer el int el numero lo aproxima a 0 pq elimina la parte decimal, por eso tenemos que multiplicarlo por 10 para q nos de un numero entre 0 y 9)
				}
				
				if(i!=j && matriz[i][j]==0) { //si i es distinto de j, y la posicion esta vacia y aij puede tomar un valor
					matriz[i][j] = (int) (Math.random()*10);
					matriz[j][i] = matriz[i][j]; // las posiciones aij y aji tienen el mismo numero por ser matriz simetrica, las posiciones aij o aji que ya tengan valor asignado, no las va a tocar el for
			}
			}}	
			
		return matriz;
	}
	
	public static void main(String[] args) {
		
		int[][] miArray = generarMatriz(3);
		for(int i = 0; i < miArray.length; i++) {
			for (int j = 0; j < miArray[i].length; j++) {
				System.out.print(miArray[i][j] + "   ");
			}
			System.out.println("  ");
		}

	}

}
