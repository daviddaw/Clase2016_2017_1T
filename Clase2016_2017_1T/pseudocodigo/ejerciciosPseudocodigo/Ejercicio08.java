package ejerciciosPseudocodigo;

public class Ejercicio08 {

	public static void main(String[] args) {
		//  numero del 1 al 7 para cada dia
		int numero;
		
		
			System.out.println("Escribe un número de 1 al 7");
			numero=LeerTeclado.readInteger();
		

		
		switch (numero) {
		case 1: System.out.println("Es lunes");
			
			break;
		case 2: System.out.println("Es martes");
			
			break;
		case 3:System.out.println("Es miercoles");
			
			break;
		case 4:System.out.println("Es jueves");
			
			break;	
		case 5:System.out.println("Es viernes");
				
				break;	
		case 6:System.out.println("Es sabado");
					
					break;	
		case 7:System.out.println("Es domingo");
						
						break;
		default:System.out.println("No has escrito ningun número del 1 al 7");
			break;
		}
	
	}

}
