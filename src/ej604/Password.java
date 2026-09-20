package ej604;

public class Password {
	
	private int longitud;
	private String password;
	
	//Un constructor por defecto sin argumentos que tendrá como contraseña “password”
	
	public Password() {
		this.longitud = 8;                   
		this.password = "password";
	}
	
	//Un constructor al que se le proporcionará una longitud y que generará una contraseña alfanumérica aleatoria (investigue Math.random) con esa longitud.

	public Password(int longitud) {
		this.longitud = longitud;
		this.password = generarContrasena(longitud);
	}
	
	public String generarContrasena(int longitud) {
		StringBuilder generada = new StringBuilder();
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		for(int i = 0; i < longitud; i++) {
			int indiceRandom = (int) (Math.random() * caracteres.length());  //el numero que me devuelve math random lo convierto en un int pra poder usarlo como indice
			
			//OJO!!! math random devuelve numeros entre 0 y 1 por lo que al hacer el int me va a devolver siempre 0 (elimina la parte decimal), lo que tengo que hacer es multiplicar math random por la longitud de la cadena de caracteres(62), para que me devuelva un numero entre 0 y 61
			//ej: math.random = 0.73 -> 0.73*62 = 45,2 -> int -> 45
			
			char c = caracteres.charAt(indiceRandom);   //en cada vuelta del for se asigna un numero random al indice
			generada.append(c);
		}
		return generada.toString();
	}

	public int getLongitud() {
		return longitud;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	//isStrong(): devuelve un boolean que indica si la contraseña es fuerte o no. Para que
	//sea fuerte debe tener más de 2 mayúsculas, más de 1 minúscula y más de 5 números.
	
	public boolean isStrong(String password) {  
		int contadorNumeros = 0;
		int contadorMinuscula = 0;
		int contadorMayuscula = 0;
		for(int i = 0; i < password.length(); i++) {   
			char c  = password.charAt(i);
			if(Character.isDigit(c)) {            //cuenta los numeros que hay en el password
				contadorNumeros++;
			}
			if(Character.isLowerCase(c)) {   //cuenta las minusculas
				contadorMinuscula++;
			}
			if(Character.isUpperCase(c)) {
				contadorMayuscula++;   //cuenta mayusculas
			}
		}
		
		if(contadorNumeros > 5 && contadorMinuscula > 1 && contadorMayuscula > 2) {
			return true;
		}else {
		return false;
	}
		
		//o directamente: return contadorNumeros > 5 && contadorMinuscula > 1 && contadorMayuscula > 2; (me devuelve true o false)
}}
