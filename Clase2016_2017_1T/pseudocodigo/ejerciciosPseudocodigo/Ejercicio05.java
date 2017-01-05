package ejerciciosPseudocodigo;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Par o impar
		
	//declaraciones
		int n;
		
		//inicializacion
		System.out.println("Escribe un número");
		n=LeerTeclado.readInteger();
		
		//algoritmo
		
		if (n==0) {
			System.out.println("El número  es cero.");
			
		} else {
			if (n%2==0) {
				System.out.println("El número "+n+" es par.");
				
			} else {
				System.out.println("El número "+n+" es impar.");
			}
			
		}

	}

}
