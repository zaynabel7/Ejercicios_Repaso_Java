package ej606;

import java.time.LocalDate;

public class CuentaPlazoFijo extends CuentaBancaria {
	
	LocalDate fechaVencimiento;
	
	public CuentaPlazoFijo(String nombre, int numeroCuenta, float saldo, LocalDate fechaVencimiento) {
		super(nombre, numeroCuenta, saldo);
		this.fechaVencimiento = fechaVencimiento;
		
	}
	
	@Override
	
	public void retirarDinero(float cantidad) {
		LocalDate fechaActual = LocalDate.now();
		
		if(fechaActual.isAfter(fechaVencimiento)) {     //comrpuebo si la fecha actual es despues de la fecha de vencimiento
			System.out.print("La cuenta ha caducado");
			
		} else if(cantidad <= 0) {
			System.out.println("Introduzca una cantidad mayor que 0 ");
			
		} 
		float penalizacion = 0.05f;
		float cantidadReal = cantidad + cantidad*penalizacion;   //además del dinero a retirar, se penaliza con un 5% adicional.
		
		if(cantidadReal > saldo) {
			System.out.println("No hay fondos suficientes");
		} else {
			saldo = saldo - cantidadReal;
			System.out.println("Se ha retirado la cantidad con exito");

		}
		
	}
}
