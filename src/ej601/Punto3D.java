package ej601;

public class Punto3D {
	
	//escribo los atributos, cada uno representa una coordenada del punto, son de tipo double pq no vana tener muchos decimales
	private double x;
	private double y;
	private double z; 
	
//	Proporcione un constructor que inicialice los valores del punto al origen de coordenadas y otro que permita especificar las coordenadas del punto.
//  tienes que tener dos constructores, uno sin parámetros y otro con las tres coordenadas.

	
//  Constructor 1: Constructor que coloque el punto en el origen, sirve para poder crear un punto sin tener que indicar sus coordenadas, haciendo que automáticamente empiece en una posición conocida.
//  Ejemplo: Punto3D p = new Punto3D(); el constructor sin parametros establece que p = (0,0,0)
	public Punto3D() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		
	}
	
//	Constructor 2: Constructor que permita elegir las coordenadas. Este constructor recibe tres parámetros, uno para cada coordenada.
	public Punto3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
// Sobrescriba el método toString() para que muestre información sobre los puntos.
	
	 @Override
	 public String toString() {
			return "(" + x + ", " + y + ", " + z + ")";         //cuando hago p.toString()  eso me devuelve un string tal que (x, y, z) si lo imprimo por pantalla
 		}
}
