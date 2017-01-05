package ejerciciosPseudocodigo;

public class Ejercicio18 {

	public static void main(String[] args) {
		// calcular la suma de todos los numeros  entre dos pedidos
		int n1,n2,suma=0;
		System.out.println("Escribe dos números");
		n1=LeerTeclado.readInteger();
		n2=LeerTeclado.readInteger();
		
		for (int i = n1; i <= n2; i++) {
			suma=suma+i;
			
		}
		System.out.println("la suma de todos los números es "+suma);
	}

}
