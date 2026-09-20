package ej601;

public class Ej601 {

	public static void main(String[] args) {
//		Use la clase en un programa en el que se creen objetos que representen los puntos (12,13, 18) y 
//		(8, 14, 0) y los muestres en pantalla de forma numérica (no gráfica).		

		Punto3D p1 = new Punto3D(12, 13, 18);
		Punto3D p2 = new Punto3D(8, 14, 0);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		//o directamente, 
		//println() sabe que p1 es un objeto de tipo Punto3D, automáticamente se llama a su método toString() para convertirlo en texto.
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
