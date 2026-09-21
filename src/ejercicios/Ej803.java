package ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ej803 {      //pedir 3 lineas al usuario y escribirlas en el final d un archivo
	
	private static final String RUTA_ARCHIVO = "notas.txt";       

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			StringBuilder contenido = new StringBuilder();
			for (int i = 0; i < 3; i++) {
				System.out.print("Línea " + (i + 1) + ": "); //en cada vuelta le pide al usuario una nueva linea
				String linea = scanner.nextLine();
				contenido.append(linea).append("\n"); //añade la linea al stringBuilder (contenido)
			}

			//para poder utilizar Files.writeString, tengo que convertir el string Builder en un string (por eso usamos toString)
			Path ruta = Path.of(RUTA_ARCHIVO);
			Files.writeString(ruta, contenido.toString());  //escribo el texto sobre el archivo
			
			System.out.println("Líneas añadidas a " + RUTA_ARCHIVO);
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}

