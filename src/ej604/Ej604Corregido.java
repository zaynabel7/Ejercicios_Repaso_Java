package ej604;

import java.util.Scanner;

public class Ej604Corregido {       //cada contraseña tiene una longitud distinta

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Introduce el numero de contraseñas que quieres generar: ");
		int tamano = sc.nextInt();
		Password[] contrasenas = new Password[tamano]; //array de contraseñas 
		
		
		
		for(int i = 0; i < contrasenas.length; i++) {
			
			System.out.print("Introduce la longitud de la contraseña " + (i+1) + ": ");
			int longitud = sc.nextInt();
			Password p = new Password(longitud); //le paso una longitud y se ejecuta el constructor que asigna una contrasena random, no puedo llamar al metodo generarContrasena desd eel main, ya se ejecuta solito cuando creo un nuevo objeto password
			contrasenas[i] = p;
		}
		
		sc.close();
		
		
		boolean[] sonFuertes = new boolean[tamano];
		for(int i = 0; i < sonFuertes.length; i++) {
			Password p = contrasenas[i];       //recordar que la contraseña tiene como atributos longitud y password, para usar el metodo isStrong() solo tengo que pasarle la password, no la longitud, por eso hago getPassword()
			String contrasena = p.getPassword();
			sonFuertes[i] = p.isStrong(contrasena);
		}
		
		
		for(int i = 0; i < contrasenas.length; i++) {
			
			
			System.out.println("Contraseña" + (i+1) + " : " + contrasenas[i].getPassword() + "_" + sonFuertes[i]);
		}
	}

	}


