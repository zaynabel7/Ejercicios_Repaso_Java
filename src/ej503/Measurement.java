package ej503;

import java.util.ArrayList;
import java.util.List;

public class Measurement {               // utilice una List de floats en lugar de un float[],  diferencia del float[], la List podrá contener cualquier número de floats, no necesariamente 4.

	private List<Float> valores;
	
	public Measurement (List<Float> valores) {  //se pasa como parametro la lista!!!!!!!!!!
		this.valores = new ArrayList<>(valores);
	}

	public List<Float> getValores() {
		return valores;
	}
	
	@Override        
	
	//public String toString() {
	//return valores.toString();}
	
	
	public String toString() {
		
		StringBuilder listTexto = new StringBuilder();       
		listTexto.append("[");
		
		if(valores.size() == 4) {
			for(int i = 0; i < valores.size(); i++) {
				float numero = valores.get(i); //obtiene el valor en esa posicion i
				listTexto.append(numero);
				if( i < valores.size()-1) {
					listTexto.append(',');
					listTexto.append(' ');
				}
			}
		}

		listTexto.append("]");
		return listTexto.toString();
		
		
	}
}




//private List<Float> valores;         DIFERENCIA ENTRE CONSTRUCTORES

//public Measurement (List<Float> valores) {             
//this.valores = new ArrayList<>(valores);}



//public Measurement() {                    
// this.valores = new ArrayList<Float>();}

//caso 1: aqui le paso una lista como parametro, el constructor lo interpreta como: "Crea una nueva lista que contenga los mismos elementos de la lista que me han pasao como parametro."
//Aquí, cuando creas el Measurement, ya le pasas una lista.

//caso 2: aqui no le paso ninguna lista como parametro, por lo que el constructor crea una nueva lista vacia a la que podremos ir
//añadiendo valores despues



