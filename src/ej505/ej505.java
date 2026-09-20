package ej505;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import ej504.Measurement;

public class ej505 {         // elimine los que cumplan el criterio en lugar de mostrarlos en pantalla.

	public static void eliminaValor(Set<Measurement> medidas, float minimo, float maximo) {              //si no haces una copia del set, estarias ás modificando el Set mientras recorres ese mismo Set.
		
		Set<Measurement> copia = new HashSet<>(medidas);   //de esta forma no modifico el set que estoy recorriendo
		for(Measurement m : copia) {                                    
			List<Float> valores = m.getValoresConCopia();
			for(float numero : valores) {                                
				if(numero > minimo && numero < maximo) {              
					medidas.remove(m);                                       
					break;                                             
				}
				
			}
		}
	}
	
	private static Set<Measurement> crearMedidasEjemplo() {
		Set<Measurement> medidas = new HashSet<>();   
		
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
		eliminaValor(misMedidas, min, max);
		System.out.println("Las medidas que quedan son: ");
		for(Measurement m: misMedidas) {
			System.out.println(m);
		}
		
	}

}



//otra forma (REPASAR 505)
//	
//	Quita del Set las medidas con algún valor dentro de [minimo, maximo].

//private static void eliminarEnRango(Set<Measurement> medidas, float minimo, float maximo) {
//			Iterator<Measurement> it = medidas.iterator();                "Crea un Iterator que me permita recorrer el Set medidas, cuyos elementos son Measurement."
//			while (it.hasNext()) {                                         hasNext() significa: "¿Queda algún elemento por recorrer?" (da true o false), cuando ya no quedan elemtnos se sale del bucle while
//				Measurement medida = it.next();                                                  
//				if (contieneEnRango(medida, minimo, maximo)) {
//					it.remove();
//				}
//			}
//		}


//

