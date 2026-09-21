package ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Ej802 {
	
	private static final String RUTA_ARCHIVO = "floats.txt";

	public static void main(String[] args) {
		float[] valores = { 1.5f, 2.3f, 4.7f, 8.1f, 9.9f };

		try {  //almacenar un array de floats en un archivo
			String contenido = Arrays.toString(valores);             //convierte el array en un string
			Files.writeString(Path.of(RUTA_ARCHIVO), contenido);    //Files.writeString sirve para escribir el texto que le pasamos como parametro en un archivo, -> (archivo, texto), Path.of() me devuelve el archivo
			System.out.println("Array guardado en " + RUTA_ARCHIVO);
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		}
	}
}


