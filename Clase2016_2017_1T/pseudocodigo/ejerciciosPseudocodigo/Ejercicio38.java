package ejerciciosPseudocodigo;

public class Ejercicio38 {

	public static void main(String[] args) {
		// N�mero de cifras
		
		int n,c=1;
        do {
        	System.out.println("Escribe un n�mero mayor que cero");
    		n=LeerTeclado.readInteger();
		} while (n<1);
		
		
		if (n>1) {
			while (n>9) 
			{
				n=n/10;
				c=c+1;			
			}
			System.out.println("El n�mero de cifras es "+c+".");
		}
		
	}

}
