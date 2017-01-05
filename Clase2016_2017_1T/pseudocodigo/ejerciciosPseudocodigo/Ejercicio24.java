package ejerciciosPseudocodigo;

public class Ejercicio24 {

	public static void main(String[] args) {
		// Algoritmo que calcule todos los divisores de un número
		int numero;
		System.out.println("Escribe un número ");
		numero=LeerTeclado.readInteger();
		
		if (numero==0 || numero==1) {
			System.out.println("su único divisor es si mismo");
		} else {
			System.out.println("Los divisores de "+numero+" son ");
			for (int i = 1; i <= numero/2; i++) {
				
				
				if (numero%i==0) {
					System.out.print(i+" ");
				
				}
		}
			System.out.println(numero);
		}
		

	}

}
