package ejerciciosPseudocodigo;

public class Ejercicio10 {

	public static void main(String[] args) {
		// tabla de multiplicar de un numero pedido
		int numero;
		System.out.println("Escribe un núnero");
		numero=LeerTeclado.readInteger();
		System.out.println("La tabla del "+numero);
		
		for (int i = 0; i < 11; i++) {
			System.out.println(numero+" por "+i+" = "+numero*i);
			
		}
	}

}
