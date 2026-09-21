package ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ej804 {
	private static final String RUTA_ORIGEN = "origen.txt";           //copiar contenido de un archivo a otro
	private static final String RUTA_DESTINO = "destino.txt";

	public static void main(String[] args) {
		try {
			String contenido = Files.readString(Path.of(RUTA_ORIGEN));      //lee todo el contenido de un archivo origen y lo guarda en un string llamado contenido   
			Files.writeString(Path.of(RUTA_DESTINO), contenido);            //escribo el texto en el archivo destino
			System.out.println("Archivo copiado de " + RUTA_ORIGEN + " a " + RUTA_DESTINO);
		} catch (IOException e) {
			System.out.println("Error al copiar el archivo: " + e.getMessage());
		}
	}
}
