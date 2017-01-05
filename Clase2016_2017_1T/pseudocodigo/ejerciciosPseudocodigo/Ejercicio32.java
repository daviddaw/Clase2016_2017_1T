package ejerciciosPseudocodigo;

public class Ejercicio32 {

	public static void main(String[] args) {
		// 32.igual contando el numero de veces que se repite

		int n,serie,c=0;
		boolean repetido=false;

		System.out.println("escribe un numero");
		n=LeerTeclado.readInteger();
		System.out.println("Escribe una serie de numeros, para finalizar cero");
		serie=LeerTeclado.readInteger();
		while (serie!=0) {
			if (serie==n) {
				repetido=true;
				c=c+1;
				
				
			}
        
			System.out.println("Escribe una serie de numeros");
			serie=LeerTeclado.readInteger();
		}
		
		if (repetido==true) {
			System.out.println("el numero esta en la serie");
			
		} else {
System.out.println("El numero no esta en la serie");


		}
		
		System.out.println("el numero "+n+"se repite "+c+"veces");
	}

}
