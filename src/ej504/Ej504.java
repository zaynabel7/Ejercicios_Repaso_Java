package ej504;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Ej504 {
//Busque en un Set de Measurements todos los Measurements que contengan al menos un
//float cuyos valores se encuentren entre dos floats proporcionados por el usuario y muestre estos Measurements por pantalla. -> Significa que con que uno de los valores del Measurement esté dentro del intervalo, ese Measurement sirve.
	
	
	public static void contieneValor(Set<Measurement> medidas, float minimo, float maximo) { //le paso el set en el q va a buscar y los extremos del intervalo
		for(Measurement m : medidas) {                                    //para cada measurement del conjunto medidas
			List<Float> valores = m.getValoresConCopia();
			for(float numero : valores) {                                //para cada numero dentro de la lista valores
				if(numero > minimo && numero < maximo) {                //no incluyo ni minimo ni maximo, compruebo si el numero esta entre los extremos del intervalo
					System.out.println(m);                             //con que solo un numero de la lista de valores cumpla la condicion, entonces se imprime la measurement 
					break;                                             //dejo de comprobar el resto de numeros, salgo del segundo for para pasar a la siguiente measurement m (primer for)
				}
				
			}
		}
	}
	
	private static Set<Measurement> crearMedidasEjemplo() {
		Set<Measurement> medidas = new HashSet<>();   //me creo el conjunto formado por objetos tipo Measurement, dentro de cada measurement va a haber una lista de 4 valores
		
		//creo las listas
		List<Float> valores1 = new ArrayList<>(Arrays.asList(1.0f, 2.5f, 3.0f, 4.25f)); 
		List<Float> valores2 = new ArrayList<>(Arrays.asList(-1.5f, 0.0f, 10.0f, 5.5f));
		List<Float> valores3 = new ArrayList<>(Arrays.asList(20.0f, 21.0f, 22.0f, 23.0f));
		
		//creo los measurements
		Measurement m1 = new Measurement(valores1);
		Measurement m2 = new Measurement(valores2);
		Measurement m3 = new Measurement(valores3);
		
		
		//añado los measurements al conjunto
		medidas.add(m1);
		medidas.add(m2);
		medidas.add(m3);
		
		//OTRA FORMA MAS COMPACTA
		//medidas.add(new Measurement(Arrays.asList(1.0f, 2.5f, 3.0f, 4.25f)));
		//medidas.add(new Measurement(Arrays.asList(-1.5f, 0.0f, 10.0f, 5.5f)));
		//medidas.add(new Measurement(Arrays.asList(20.0f, 21.0f, 22.0f, 23.0f)));
		
		
		return medidas;
	}
	
	public static void main(String[] args) { 
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Introduzca el min del intervalo: ");         
		float min = sc.nextFloat();
		System.out.print("Introduzca el max del intervalo: ");
		float max = sc.nextFloat();
		sc.close();
		Set<Measurement> misMedidas = crearMedidasEjemplo();        //creo un conjunto de measurements
		System.out.println ("Las medidas buscadas son: ");
		contieneValor(misMedidas, min, max);
	}

}
