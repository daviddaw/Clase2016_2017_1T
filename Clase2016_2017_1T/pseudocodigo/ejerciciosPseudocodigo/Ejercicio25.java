package ejerciciosPseudocodigo;

public class Ejercicio25 {

	public static void main(String[] args) {
		// 25.	dado un a�o, decir si es bisiesto: 
		//Es m�ltiplo de 4 Y o bien es m�ltiplo de 400 o no es m�ltiplo de 100.
		int year;
		System.out.println("Escribe un a�o");
		year=LeerTeclado.readInteger();
		if (year%4==0 && (year%400==0 || year%100!=100)) {
			System.out.println("es bisiesto");
			
		} else {
          System.out.println("no es bisiesto");
		}

	}

}
