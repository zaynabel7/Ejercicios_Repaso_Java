package ej606;

public class CuentaVIP extends CuentaBancaria {
	
	private float saldoNegativoMaximo;
	
	public CuentaVIP(String nombre, int numeroCuenta, float saldo, float saldoNegativoMaximo) { //el saldo negativo maximo se introduce como numero positivo
		super(nombre, numeroCuenta, saldo);
		this.saldoNegativoMaximo = saldoNegativoMaximo;
	}
	
	@Override
	
	public void retirarDinero(float cantidad) {
		
		
		if(cantidad <= 0) {
			System.out.println("Introduzca una cantidad mayor que 0 ");
			
		} else if(-saldoNegativoMaximo > saldo - cantidad) { //como saldo negativo maxmo lo ponemos positivo en el constructor, tenemos que añadirle un signo menos
			System.out.println("Supera el saldo negativo maximo");
			
		} else {
			saldo = saldo - cantidad;
			System.out.println("Se ha retirado la cantidad con exito");
		}
	}
}
