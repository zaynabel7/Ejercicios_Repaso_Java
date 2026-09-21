package ej605;

public class JefeOtraManera extends Empleado {

	private int anios;
	private int sueldo;
	
	public JefeOtraManera(String nombre, int anios) {
		super(nombre);
		this.anios = anios;
		this.sueldo = calcularSueldo(anios, sueldoBase);           //cuando cree un objeto de tipo Jefe, automaticamente se ejecuta el metodo calcularSueldo para asignarle el sueldo
	}

	
	
	// Los jefes tienen un suplemento de 500 € por cada año que hayan sido jefes de la empresa
	
	public int calcularSueldo(int anios, int sueldoBase) {                       
		return (anios*500 + sueldoBase);
	}
}
