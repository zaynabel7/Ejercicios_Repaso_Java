package ej501;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ej501 {  //Cree un Set de Measurements y añada 10 Measurements introducidos por el usuario.

	
	//public static Set<Measurement> addMeasurement(Measurement medida){
		
		//Set<Measurement> measurements = new HashSet<Measurement>();                                                                         
		//measurements.add(medida);
		
		//return measurements;

	
	public static float[] leerArray(Scanner sc) {
		
		float[] array = new float[4];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Introduzca el valor del canal " + (i+1) + ": ");
			array[i]= sc.nextFloat();
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		Set<Measurement> measurements = new HashSet<Measurement>();  //set en el q voy a ir almacenando la measurement que introduce el usuario, para cada measurement tiene que introducir 4 valores (corresp a cada canal)
		Scanner scn = new Scanner(System.in);
		
		while(measurements.size()<10) {     //al crear un set nuevo, su tamaño es 0
			System.out.println("Introduzca la medida (4 canales): "); //se ejecuta cada vez que termina un ciclo, en un ciclo ocurre lo siguiente, se le pide al usuario una nueva medida 
			float[] miArray = leerArray(scn);                   //una medida consiste en un array de 4 valores, en esta linea se salta al metodo leerArray y le paso el scanner, se crea un array dentro de este metodo y para cada posicion se guarda el valor que introduce el usuario, una vez se termina de llenar el array, este array se devuelve y se asigna a "miArray"
			Measurement medida = new Measurement(miArray);      //me creo una nueva medida a la que le voy a asignar el array que acabo de crear apartir de los valores que me ha pasado el usuario
			measurements.add(medida);                          //añado la medida a mi set
		}
		
		System.out.println("Se han añadido " + measurements.size() + " medidas al Set.");
		scn.close();
	}
		
	}




//en cada vuelta: leerArray() -> obtiene 4 valores -> crea un Measurement -> lo añade al set -> vuelve al while
//Aunque Set no permite elementos repetidos, en tu caso estás creando cada vez: new Measurement(miArray), esto crea un objeto diferente.

//Por defecto, HashSet considera esos objetos diferentes aunque tengan exactamente los mismos 4 valores. Por eso normalmente podrás llegar a 10 elementos aunque el usuario introduzca siempre:(1, 2,3,4)
