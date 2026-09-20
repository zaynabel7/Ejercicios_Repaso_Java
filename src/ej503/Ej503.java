package ej503;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej503 {

	public static void main(String[] args) {
		List<Float> valores = new ArrayList<>(Arrays.asList(1.0f, 2.5f, 3.0f, 4.25f));
		
		Measurement m = new Measurement(valores);
		
		System.out.print(m);   
		

	}

}
