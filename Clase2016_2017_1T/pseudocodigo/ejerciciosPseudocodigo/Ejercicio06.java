package ejerciciosPseudocodigo;

public class Ejercicio06 {

	public static void main(String[] args) {
		// positivo, negativo o cero
		//declaraciones
		int n;
		//inicializcion
		System.out.println("Escribe un número");
		n=LeerTeclado.readInteger();
		
		//Algoritmo
		if (n<0) {
			System.out.println("El numero es negativo");
			
		} else {
			if (n>0) {
				System.out.println("El número es positivo");
			} else {
				
				System.out.println("El número es cero");
			}

		}
		

	}

}
