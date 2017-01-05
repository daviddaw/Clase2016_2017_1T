package ejerciciosMetodos;

public class Metodo02 {
	/* 2.	Escribir un método que reciba como parámetros dos números y devuelva el menor de los dos.
	Si son iguales, devolverá uno de ellos.*/
	public static void main(String[] args) {
		int n1,n2;
		
		System.out.println("Escribe dos números te devolveré el menor.");
	
		System.out.println("__________________________________________");
		System.out.println("Inserte un número:");
		System.out.println(">");
		n1=Metodo01.pideNumeros();
		System.out.println("Inserte otro número:");
		System.out.println(">");
		n2=Metodo01.pideNumeros();
		System.out.println("");
		System.out.println("El menor número de los dos es: "+menorNumero(n1, n2));
		System.out.println();
		System.out.println("Sesión finalizada");
		


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
