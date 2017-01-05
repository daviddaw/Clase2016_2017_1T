package ejerciciosPseudocodigo;

public class Ejercicio16 {

	public static void main(String[] args) {
		// Introduce el numero y obten la nota
		int nota;
		System.out.println("Introduce un número del 0 al 10");
		nota=LeerTeclado.readInteger();
				
		switch (nota) {
		case 0:
		case 1:
		case 2:System.out.println("Muy deficiente");
			break;
			
		case 3:
		case 4:System.out.println("Insuficiente");
			break;
			
		case 5: System.out.println("Suficiente");	
			break;
			
		case 6:System.out.println("Bien");
		    break;
		case 7:
		case 8: System.out.println("Notable");
		    break;
		case 9:
		case 10:System.out.println("Sobresaliente");
			break;
		default: System.out.println("No has introducido ningun numero del 1 al 10");
			break;
		}
		
		

	}

}
