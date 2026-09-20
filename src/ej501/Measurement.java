package ej501;

public class Measurement {   // Measurement es una clase que contiene un float[] con 4 elementos
								//una muestra consiste en 4 medidas (pq hay 4 canales)
	private float[] valores = new float[4];
	
	public Measurement (float[] valores) {
		this.valores = valores;
	}

	public float[] getValores() {
		return valores;
	}
}
