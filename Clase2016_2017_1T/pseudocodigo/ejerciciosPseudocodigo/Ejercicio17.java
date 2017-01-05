package ejerciciosPseudocodigo;

public class Ejercicio17 {

	public static void main(String[] args) {
		// factorial
		int numero;
		double factorial=1;
		System.out.println("Escribe un número");
		numero=LeerTeclado.readInteger();
				
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
			System.out.println(factorial+" = "+factorial+" * "+i);
			factorial=factorial*i;
			System.out.println(factorial+" = "+factorial+" * "+i);
			System.out.println("fact"+factorial);
		}

		System.out.println("El factorial es "+factorial);
	}

}
