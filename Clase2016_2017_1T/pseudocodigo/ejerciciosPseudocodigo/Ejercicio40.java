package ejerciciosPseudocodigo;

public class Ejercicio40 {

	public static void main(String[] args) {
		// numeros perfectos del 1 al 1000

		int acu;
		
		for (int n = 0; n <= 1000; n++) {
			
			acu=0;
			
			for (int i = 1; i <= n/2; i++) {
				if (n%i==0) {
					acu=acu+i;
					}
			}
			if (acu==n) {
				System.out.println(n+" es perfecto");
			} else {
				System.out.println(n+" no es perfecto");
			
		}
	}

	}
}