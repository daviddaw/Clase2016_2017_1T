package recursividad;

import metodosSubirNota.LeerTeclado;

public class Recursivisad04 {
	/*12.	Escribir un programa que pase un n� de decimal a binario usando recursividad:
		�	N=4  =>  Generar� 100*/


	public static void main(String[] args) {
		int n;
		System.out.println("Introduce un n�mero decimal");
		n = LeerTeclado.readInteger();
		System.out.println("El n� en binario es: ");
		cifraBinaria(n);

	}

	public static void cifraBinaria(int i){
		if (i < 2) {
			System.out.print(i);	
		}
		else {
			cifraBinaria(i/2);
			System.out.print(i % 2);
			
		}
	}
}