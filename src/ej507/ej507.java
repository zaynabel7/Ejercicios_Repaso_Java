package ej507;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ej504.Measurement;

public class ej507 {
	
	public static Set<Measurement> unirSets(Set<Measurement> medidas1, Set<Measurement> medidas2){
		
		//int tamanio = medidas1.size() + medidas2.size();
		
		Set<Measurement> resultado = new HashSet<Measurement>();
		
		for(Measurement m: medidas1) {
			resultado.add(m);
		}
		
		for(Measurement m: medidas2) {
			resultado.add(m);                     //otra forma: resultado.addAll(medidas2)
		}
		
		return resultado;
		
	}
	
	public static Set<Measurement> eliminarElementosDuplicados(Set<Measurement> medidas){
		
		for(Measurement m : medidas) {
			List<Float> valores = m.getValores();          //no hago copia
			
			for(int i = 1; i < valores.size(); i++) {
				
				
				Float valorActual = valores.get(i);
				Float valorSiguiente = valores.get(i-1);
				
				if(valorActual.equals(valorSiguiente)) {        //no se comparan floats con ==, sino con equals
					valores.remove(i);
				}
			}
			}
		
		return medidas;
	}

	public static void main(String[] args) {
		
		Set<Measurement> setA = new HashSet<>();
		Measurement m1 = new Measurement(Arrays.asList(1.0f, 2.5f, 3.0f, 4.25f));
		Measurement m2 = new Measurement(Arrays.asList(-1.5f, -1.5f, 10.0f, 5.5f));
		
		setA.add(m1);
		setA.add(m2);

		Set<Measurement> setB = new HashSet<>();
		
		Measurement m3 = new Measurement(Arrays.asList(20.0f, 21.0f, 22.0f, 23.0f));
		setB.add(m3);
		Set<Measurement> union = unirSets(setA, setB);

		System.out.println("Set A: " + setA);
		System.out.println("Set B: " + setB);
		System.out.println("Unión: " + union);
		
		System.out.println("Resultado de eliminar duplicados: " + eliminarElementosDuplicados(setA));
	}

}
