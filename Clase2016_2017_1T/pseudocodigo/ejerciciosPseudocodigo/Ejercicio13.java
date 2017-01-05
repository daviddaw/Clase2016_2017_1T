package ejerciciosPseudocodigo;

public class Ejercicio13 {

	public static void main(String[] args) {
		// calcular la suma de números hasta teclear un  cero
		int numero,acumulador=0;
		System.out.println("Escribe numeros por teclado, para finalizar teclea 0");
		numero=LeerTeclado.readInteger();
		
		while (numero!=0) {
			acumulador=numero+acumulador;
			numero=LeerTeclado.readInteger();
		}
		System.out.println("La suma acumalada es "+acumulador);

	}

}
