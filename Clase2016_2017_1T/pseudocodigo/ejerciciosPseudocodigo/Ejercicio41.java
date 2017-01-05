package ejerciciosPseudocodigo;

public class Ejercicio41 {

	public static void main(String[] args) {
		// serie de letras
		String letra,serie;
		boolean repetido=false;

		System.out.println("escribe un letra");
		letra=LeerTeclado.readString();
		System.out.println("Escribe una serie de letras");
		for (int i = 1; i <=50; i++) {
			serie=LeerTeclado.readString();
			System.out.println(" faltan "+(50-i)+" letras.");
			if (serie.equalsIgnoreCase(letra)) {
				repetido=true;				
			} 

		}
		
		if (repetido==true) {
			System.out.println("la letra esta en la serie");
		} else {
System.out.println("la letra no esta en la serie");
		}
	}

}
