package ej502;

public class Measurement {
private float[] valores = new float[4];
	
	public Measurement (float[] valores) {
		this.valores = valores;
	}

	public float[] getValores() {
		return valores;
	}
	
	//Modifique la clase Measurement para añadir un método toString(), voy a convertir el array de measurement (valores) a un string
	
	@Override        //para sobreescribir un metodo
	
	public String toString() {
		
		StringBuilder arrayTexto = new StringBuilder();       
		arrayTexto.append("[");
		for(int i = 0; i < valores.length; i++) {
			float numero = valores[i];
			arrayTexto.append(numero);       //appendfloat
			
			if(i < valores.length -1) { //i= 3, i < 4-1, 3 < 3 -> false, en la ultima posicion no pongo coma
				arrayTexto.append(',');
				arrayTexto.append(' ');
			}
		}
		
		arrayTexto.append("]");
		return arrayTexto.toString();
		
		
	}
}
