package ej506;

import java.util.ArrayList;
import java.util.List;

public class Measurement {
	private List<Float> valores;

	public Measurement(List<Float> valores) {
		this.valores = new ArrayList<>(valores);
	}
	
	public List<Float> getValoresConCopia() {             //Devuelve una copia de la lista, no la lista original. El problema es que quien llama a getValores() podría modificar directamente esa lista
		return List.copyOf(valores);
	}
	
	public List<Float> getValores() {          //Devuelve la lista original que tiene el objeto.
	    return valores;
	}
	
	public String toString() {
		return valores.toString();
	}
}
