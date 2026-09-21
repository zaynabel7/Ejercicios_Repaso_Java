package ej606;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ej606 {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria("Maria", 8819, 1000);
		CuentaPlazoFijo cuenta2 = new CuentaPlazoFijo("Susana", 6767, 2300, LocalDate.now().plusMonths(6));
		CuentaVIP cuenta3 = new CuentaVIP("Josefina", 6969, 1200, 1000);
		
		List<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
		cuentas.add(cuenta1);
		cuentas.add(cuenta2);
		cuentas.add(cuenta3);
		
		cuenta1.ingresarDinero(60);
		cuenta1.retirarDinero(2000);
		cuenta2.retirarDinero(800);
		cuenta3.transferirDinero(800, cuenta3);
		cuenta3.retirarDinero(3000);
		
		for (CuentaBancaria cuenta : cuentas) {
			System.out.println(cuenta);
		}

	}

}
