package ejerciciosMetodos;

public class Metodo08 {

	
		/*8.	Escribir un m�todo que recibe como par�metro un n� y devuelva su factorial. 
		 * Escribir un main que pida por teclado un N>=0 e invoque a dicho m�todo.*/
	public static void main(String[] args) {
		int n;

		do {
			System.out.println("Introduce un numero positivo o 0 para calcular su factorial");
			n = LeerTeclado.readInteger();
		} while (n < 0);

		System.out.println("El factorial de " + n + " es " + factorial(n));

	}
	
	public static double factorial (int x){
		
		double fact=1;
		for (int i=1;i<=x;i++)
			fact*=i;
		return fact;
	}

}
