package ej602;

public class MyDate {

	//atributos
	private int dia;
	private int mes;
	private int anio;
	
	public MyDate (int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	//los getters devuelven un int
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAnio() {  
		return anio;
	}
	
	//los setters no devuelven nada, sino que modifican el valor del atributo, por eso son metodos void

	public void setDia(int dia) {  //le paso como parametro el nuevo valor del atributo que quiero modificar
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	@Override
	
	public String toString() {         //date.toString(), convierte en string los int, para describir la fecha
		return dia + "/" + mes + "/" + anio;
	}
}
