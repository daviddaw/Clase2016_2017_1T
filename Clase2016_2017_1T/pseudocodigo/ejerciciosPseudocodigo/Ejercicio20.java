package ejerciciosPseudocodigo;

public class Ejercicio20 {

	public static void main(String[] args) {
		// Multiplos de dos del 8 al 400
		int acumulador=0;

		for (int i = 8; i <= 400; i=i+2) {
			acumulador=acumulador+i;
			
			
		}
		System.out.println("la suma de los multiplos de dos "+acumulador);
	}

}
