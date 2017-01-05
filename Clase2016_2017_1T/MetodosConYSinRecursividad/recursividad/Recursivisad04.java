package recursividad;

import metodosSubirNota.LeerTeclado;

public class Recursivisad04 {
	/*12.	Escribir un programa que pase un nº de decimal a binario usando recursividad:
		•	N=4  =>  Generará 100*/


	public static void main(String[] args) {
		int n;
		System.out.println("Introduce un número decimal");
		n = LeerTeclado.readInteger();
		System.out.println("El nº en binario es: ");
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