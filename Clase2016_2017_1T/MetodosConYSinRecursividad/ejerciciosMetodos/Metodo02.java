package ejerciciosMetodos;

public class Metodo02 {
	/* 2.	Escribir un m�todo que reciba como par�metros dos n�meros y devuelva el menor de los dos.
	Si son iguales, devolver� uno de ellos.*/
	public static void main(String[] args) {
		int n1,n2;
		
		System.out.println("Escribe dos n�meros te devolver� el menor.");
	
		System.out.println("__________________________________________");
		System.out.println("Inserte un n�mero:");
		System.out.println(">");
		n1=Metodo01.pideNumeros();
		System.out.println("Inserte otro n�mero:");
		System.out.println(">");
		n2=Metodo01.pideNumeros();
		System.out.println("");
		System.out.println("El menor n�mero de los dos es: "+menorNumero(n1, n2));
		System.out.println();
		System.out.println("Sesi�n finalizada");
		


	}
	public static int menorNumero(int a,int b) {
		boolean menor;
		if (a<b) {
			menor=true;
		}else {
			menor=false;
		}
		if (menor) {
			return a;
		}
		else {
			return b;
		}
	}

	
}
