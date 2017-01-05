package ejerciciosPseudocodigo;

public class Ejercicio14 {

	public static void main(String[] args) {
		// sumar y hacer la media hasta teclear un cero
		int numero,acumulador=0,contador=0,media=0;
		System.out.println("Escribe numeros por teclado, para finalizar teclea 0");
		numero=LeerTeclado.readInteger();
		
		while (numero!=0) {
			acumulador=numero+acumulador;
			contador=contador+1;
			numero=LeerTeclado.readInteger();
			media=acumulador/contador;
		}
		System.out.println("La media es "+media);

	

	}

}
