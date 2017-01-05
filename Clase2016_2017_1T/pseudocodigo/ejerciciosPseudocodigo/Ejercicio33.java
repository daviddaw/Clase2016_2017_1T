package ejerciciosPseudocodigo;

public class Ejercicio33 {

	public static void main(String[] args) {
		// un numero primo
		  int n;
		  boolean primo=true;
		  do {
			System.out.println("escribe n");
			n=LeerTeclado.readInteger();
		} while (!(n>1));
		  
            for (int i = 2; i <=n/2; i++) {
            	if (n%i==0) {
					primo=false;
				}
            	
            	
			}
           if (primo) {
			System.out.println("es primo");
		} else {
			System.out.println(" no es primo");

		}
																												
		
		
	}

}
