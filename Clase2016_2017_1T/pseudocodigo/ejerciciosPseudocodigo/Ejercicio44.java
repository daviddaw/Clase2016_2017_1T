package ejerciciosPseudocodigo;



public class Ejercicio44 {

	public static void main(String[] args) {
		// Sumar una serie (fin con 0) decir si la serie está ordenada de mayor a menor.
		
		int num,suma=0,anterior;
		boolean sw=true;
		System.out.println("Escribe una serie de numeros");
		num=LeerTeclado.readInteger();
		anterior=num;
		while (num!=0) {
			if (anterior<num)
				sw=false;
			suma+=num;
			anterior=num;
			System.out.println("Introduza un nuevo número, si desea salir introduzca 0");
			num=LeerTeclado.readInteger();
			System.out.println();
		
		}
		if (sw==true)
			System.out.println("La serie de números introducidos está ordenada de mayor a menor, la suma es "+suma);
		else 
			System.out.println("La serie de números introducidos no está ordenada de mayor a menor, la suma es "+suma);
        		
	
	}

}
