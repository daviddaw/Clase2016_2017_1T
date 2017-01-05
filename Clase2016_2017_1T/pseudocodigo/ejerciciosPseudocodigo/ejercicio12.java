package ejerciciosPseudocodigo;

public class ejercicio12 {

	public static void main(String[] args) {
		// Producto números del 1 al 100
		double acumulador=1;
		
		for (int i = 1; i <=100; i++) {
			acumulador=i*acumulador;
			
		}
		System.out.println("El producto de los números del 1 al 100 es "+acumulador);

	}

}
