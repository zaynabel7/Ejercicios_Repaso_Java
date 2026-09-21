package ejercicios;

import java.io.IOException;   //es una excepción que puede aparecer cuando trabajamos con archivos (el archivo no existe, no se puede abrir o no tenemos permisos)
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Ejercicio 8.1: Lee un archivo de texto línea por línea y muestra el contenido
 * por pantalla.
 */
public class Ej801 {
	private static final String RUTA_ARCHIVO = "datos.txt";
	public static void main(String[] args) {
		
		try { //envolvemos en try y catch aquella parte del codigo que nos puede producir excepcion, basicamente: try (prueba) a ejecutar esto y si no puedes catch (agarra) la excepcion y haz esto
			List<String> lineas = Files.readAllLines(Path.of(RUTA_ARCHIVO));      //Files.readAllLines(Path.of("datos.txt")) sirve para leer todas las lineas del archivo, en cada posicion de la lista se guarda una linea
			for (String linea : lineas) {        //recorremos la lista lineas, "para cada linea de tipo string dentro de la lista lineas"
				System.out.println(linea);
			}
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}
}
//una linea = un string, y eso se guarda en la lista. La lista puede tener strings de distinto tamaño