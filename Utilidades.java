package ejercicio3;

import java.util.Random;

public class Utilidades {
	
	Random generador= new Random();
	
	public int numAzar(int num) {
		int ram = (1 + generador.nextInt(num)) * 100;
		int a=0;
		for (int i=0; i<ram;i++){
	        a=i*3;
		}
		
		return a;
	}
	
}
