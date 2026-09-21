package ej605;

public class Jefe extends Empleado {

	private int anios;
	
	public Jefe(String nombre, int anios) {
		super(nombre);
		this.anios = anios;
	}
	
	// Los jefes tienen un suplemento de 500 € por cada año que hayan sido jefes de la empresa
	
	@Override                               //sobreescribo el metodo calcularSueldo() de la clase empleado
	public int calcularSueldo() {                       
		return (anios*500 + sueldoBase);
	}
}
