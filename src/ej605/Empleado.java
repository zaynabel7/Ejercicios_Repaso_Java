package ej605;

public class Empleado {

	protected int sueldoBase;  //cambio la visibilidad a protected
	private String nombre;
	
	public Empleado(String nombre) {                 //cuando yo cree un objeto de tipo empleado, automaticamente le asigna el sueldoBase = 1000 por lo q no necesito pasarlo como parametro
		this.nombre = nombre;
		this.sueldoBase = 1000;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public int calcularSueldo() {
		return sueldoBase;
	}
}
