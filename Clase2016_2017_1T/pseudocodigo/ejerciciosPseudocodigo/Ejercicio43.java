package ejerciciosPseudocodigo;

public class Ejercicio43 {

	public static void main(String[] args) {
		// Menu suma,resta, multiplicación, división
		int n1,n2,menu,suma,resta,multi;
		double divi;
		System.out.println("Escribe dos números");
		n1=LeerTeclado.readInteger();
		n2=LeerTeclado.readInteger();
		System.out.println("Pulsa 1 para suma ,2 para resta ,3 para multiplicación ,4 para división y 5 salir.");
		menu=LeerTeclado.readInteger();
		switch (menu) {
		case 1: suma=n1+n2;
			System.out.println("la suma es "+suma);
			break;
		case 2: resta=n1-n2;
		System.out.println("la resta es "+resta);
		break;
		case 3: multi=n1*n2;
		System.out.println("la multiplicación es "+multi);
		break;
		case 4: divi=(double)n1/n2;
		System.out.println("la división es "+divi);
		break;
		
		default:System.out.println("No has escogido ninguna opcion del menú.");
			break;
		}

	}

}
