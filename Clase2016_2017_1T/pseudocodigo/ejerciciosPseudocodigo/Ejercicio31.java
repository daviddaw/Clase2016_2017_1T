package ejerciciosPseudocodigo;

public class Ejercicio31 {

	public static void main(String[] args) {
		// 31.	Algoritmo que dado un nº N y una serie de números terminada en 0
		//indique si el número N se encuentra en la serie.

		int n,serie;
		boolean repetido=false;

		System.out.println("escribe un numero");
		n=LeerTeclado.readInteger();
		System.out.println("Escribe una serie de numeros, para finalizar cero");
		serie=LeerTeclado.readInteger();
		while (serie!=0) {
			if (serie==n) {
				repetido=true;
				
			} else
        
			System.out.println("Escribe una serie de numeros");
			serie=LeerTeclado.readInteger();
		}
		
		if (repetido==true) {
			System.out.println("el numero esta en la serie");
		} else {
System.out.println("El numero no esta en la serie");
		}
	}

}
