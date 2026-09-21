package ej606;

import java.time.LocalDate;

public class CuentaBancaria {

	private String nombre;
	private LocalDate fechaApertura;      //LocalDate es una clase que sirve para representar una fecha. La variable fecha lo guarda en el formato dd/mm/aa
	private int numeroCuenta;
	protected float saldo;           //accesible por otras clases
	
	public CuentaBancaria(String nombre, int numeroCuenta, float saldo) {
		this.nombre = nombre;
		this.fechaApertura = LocalDate.now(); //cada vez que creo un nuevo objeto de tipo CuentaBancaria, la fecha de apertura corresponde a la fecha en el mismo momento que la creo
		this.numeroCuenta =  numeroCuenta;
		this.saldo = saldo;
	}
	
	//método para retirar dinero
	
	public void retirarDinero(float cantidad) {
		if(cantidad <= 0) {
			System.out.println("Introduzca una cantidad mayor que 0 ");
			
		} else if(cantidad > saldo) {
			System.out.println("No hay fondos suficientes");
			
		} else {
			saldo = saldo - cantidad;
			System.out.println("Se ha retirado la cantidad con exito");
		}
	}
	
	
	//metodo para ingresar dinero
	
	public void ingresarDinero(float cantidad) {
		if(cantidad <= 0) {
			System.out.println("Introduzca una cantidad mayor que 0 ");
		} else {
			saldo = saldo + cantidad;
			System.out.println("Se ha ingresado la cantidad con exito");
		}
	}
	
	//metodo para transferir dinero
	
	public void transferirDinero(float cantidad, CuentaBancaria destino) {
		if(cantidad <= 0) {
			System.out.println("Introduzca una cantidad mayor que 0 ");
			
		} else if(cantidad > saldo) {
			System.out.println("No hay fondos suficientes");
		
		}else {
			destino.ingresarDinero(cantidad);
			System.out.println("Se ha tramsferido la cantidad con exito");
		}
	}
	
	@Override
	public String toString() {
		return nombre + " (" + numeroCuenta + "), apertura " + fechaApertura + ": " + saldo + " €";
	}
}
