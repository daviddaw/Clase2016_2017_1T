package ejerciciosPseudocodigo;

public class Ejercicio39 {

	public static void main(String[] args) {
		//numeros perfectos

		int n, acu=0;
		
		System.out.println("Escribe un número");
		n=LeerTeclado.readInteger();
				
		for (int i = 1; i <= n/2; i++) {
			if (n%i==0) {
				acu=acu+i;
				}
		System.out.println(i);	
		}
		if (acu==n) {
			System.out.println(n+" es perfecto");
		} else {
			System.out.println(n+" no es perfecto");
		}
	}

}
