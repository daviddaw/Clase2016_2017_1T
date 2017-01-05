package ejerciciosPseudocodigo;

public class Ejercicio07 {

	public static void main(String[] args) {
		// uno divisorde otro
		
		//declaracion
		int n1,n2;
		
		//inicializacion
		System.out.println("Escribe dos números");
		n1=LeerTeclado.readInteger();
		n2=LeerTeclado.readInteger();
		
		//algoritmo
		 
		if (n1%n2==0) {
			System.out.println(n1+" es divisible por "+n2);
		} else {
			if (n2%n1==0) {
			
			System.out.println(n2+"  es divisible por "+n1);
			}
		}
		

	}

}
