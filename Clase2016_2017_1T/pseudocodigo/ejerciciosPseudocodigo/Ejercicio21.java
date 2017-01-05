package ejerciciosPseudocodigo;

public class Ejercicio21 {

	public static void main(String[] args) {
		// Pedir 10 numeros,cuantos son pares, cuantos son impares, calcular suma pares,media impares
		int numero,cP=0,cI=0,sumaI=0,sumaP=0;
		double mediaI=0;
		System.out.println("escribe 10 numeros");
		for (int i = 1; i <= 10; i++) {
			numero=LeerTeclado.readInteger();
			System.out.println(i);
			
			if (numero%2!=0) {
				System.out.println("Es impar");
				cI=cI+1;
				sumaI=sumaI+numero;
				
				if (cI==0) {
					System.out.println("No se puede dividir entre cero");
				} else {
					mediaI=(double)(sumaI)/(cI);
					
				}
				
			} else {
				System.out.println("Es par");
				cP=cP+1;
				sumaP=sumaP+numero;
			}
		}
		System.out.println("Hay "+cP+" pares y "+cI+" impares. La suma de los pares es "+sumaP+" y la media de los impares es "+mediaI);
	}
}
