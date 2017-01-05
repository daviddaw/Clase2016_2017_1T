package ejerciciosPseudocodigo;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Imprimir los multiplos de 3 hasta N
		int n;
		System.out.println("escribe un numero");
		n=LeerTeclado.readInteger();

		for (int i = 0; i <= n; i=i+3) {

			System.out.println(i+" es multiplo de 3");
		}
	}




}
