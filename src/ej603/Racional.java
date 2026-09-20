package ej603;

public class Racional {
 
	private int numerador;
	private int denominador;
	
	//Proporcione un constructor por defecto, un constructor de copia 
	//y otro que permita indicar los valores del numerador y del denominador por separado.
	
	//CONSTRUCTOR POR DEFECTO Ejemplo. NumeroRacional r = new NumeroRacional(); el numero racional por defecto es el 0/1 = 0
	public Racional() {
		this.numerador = 0;
		this.denominador = 1;
	}

	//CONSTRUCTOR INDICANDO NUMERADOR Y DENOMINADOR
	
	public Racional (int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	//CONSTRUCTOR COPIA ( se le pasa un objeto de la clase número racional y crea otro número racional idéntico)
	//Ejemplo. NumeroRacional r1 = new NumeroRacional(3, 4);   NumeroRacional r2 = new NumeroRacional(r1);
	
	public Racional(Racional otro) {
		this.numerador = otro.numerador;
		this.denominador = otro.denominador;
	}

	//el constructor por defecto no recibe parámetros
	//el constructor de numerador y denominador recibe dos parametros
	//el constructor de copia recibe otro objeto NumeroRacional
	
	
}
