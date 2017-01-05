package ejerciciosPseudocodigo;

public class Ejercicio19 {

	public static void main(String[] args) {
		// valor minimo,maximo y medio hasta introducir el cero
		int numero,max,min,acu=0,cont=0;
		double media=0;
		System.out.println("Introduce un número");
		numero=LeerTeclado.readInteger();
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;//(max.value es el numero mas grande posible) para la primera comparacion.
		while (numero!=0) {
			if (numero>max) {
				max= numero;
			} 
			if (numero<min) {
				min=numero;
			}
			cont=cont+1;
			acu=acu+numero;
			System.out.println("Introduce un número");
			numero=LeerTeclado.readInteger();
		}	
		media=(double)acu/cont;
		System.out.println("El valor minimo es "+min+", el valor maximo es "+max+" y la media es "+media);
	}
}
