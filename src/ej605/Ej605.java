package ej605;

import java.util.ArrayList;
import java.util.List;

public class Ej605 {

	public static void main(String[] args) {
		
		List<Empleado> plantilla = new ArrayList<Empleado>();
		
		//Creae una plantilla de una empresa con 2 jefes, 5 viajantes y 15 empleados, y muestre	por pantalla sus respectivos salarios. 
		//Para numeros de viajes y antiguedad generar números aleatorios entre 0 y 10. 
		
		for(int i = 0; i < 2; i++) {
			int anios = (int) (Math.random()*10);
			String nombre = "Jefe " + (i+1);           //el nombre es el Jefe + numero de jefe
			Jefe j =  new Jefe(nombre, anios);
			plantilla.add(j);
		}
		
		for(int i = 0; i < 5; i++) {
			int viajes = (int) (Math.random()*10);
			String nombre = "Viajante " + (i+1);
			Viajante v = new Viajante(nombre, viajes);
			plantilla.add(v);
		}
		
		for(int i = 0; i < 15; i++) {
			String nombre = "Empleado " + (i+1);
			Empleado e = new Empleado(nombre);
			plantilla.add(e);
		}
		
		//Polimorfismo: cada empleado calcula su sueldo con su propia formula
		for(int i = 0; i < plantilla.size(); i++) {
			int sueldo = plantilla.get(i).calcularSueldo();          //calcula el sueldo del empleado en la posicion i
			String nombre = plantilla.get(i).getNombre();            //obtiene el nombre del empleado en la posicion i
			System.out.println("El sueldo del " + nombre + " es: " +  sueldo + " €");
		}
		
		//otra forma
		
		for(Empleado e : plantilla) {
			System.out.println("El sueldo del " + e.getNombre() + " es: " +  e.calcularSueldo() + " €");
		}
	}

}
