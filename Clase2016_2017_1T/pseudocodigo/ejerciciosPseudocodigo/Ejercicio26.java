package ejerciciosPseudocodigo;

public class Ejercicio26 {

	public static void main(String[] args) {
		// factoriales del 1 al 10.
		

		for (int numero = 1; numero <=10; numero++) {
			double factorial=1;
			for (int i = 1; i <=numero; i++) {
				factorial=factorial*i;
			}
			System.out.println("El factorial de "+numero+" es "+factorial);
			
		}
				

		
	}

}
