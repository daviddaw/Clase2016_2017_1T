package ejerciciosPseudocodigo;

public class Ejercicio28 {

	public static void main(String[] args) {
		// Algoritmo negativo

		int n;
		boolean neg=false;		
		do {
			System.out.println("Escribe números");
			n=LeerTeclado.readInteger();
			
			if (n < 0) {
			neg=true;
			}
			} while (n != 0);
if (neg==false) {
	System.out.println("No hay negativos.");
} else {
System.out.println("Hay negativos.");
}
	}

}
