package ej605;

public class Viajante extends Empleado {     //además del sueldo base, cobran 300 € por viaje realizado.

	private int viajes;
	
	public Viajante(String nombre, int viajes) {
		super(nombre);
		this.viajes = viajes;
	}

	@Override
	public int calcularSueldo() {
		return (viajes*300 + sueldoBase);
	}
	
	
}
