package ejerciciosMetodos;

public class Metodo03 {
	/*3.	Escribir un método que reciba dos parámetros y decida si uno es divisor del otro.
	 * Escribir un main que introduzca dichos números e invoque al método. */
	public static void main(String[] args) {
		int n1,n2;
		System.out.println("Escribe dos numeros, te dire si uno es divisor de otro.");
		System.out.println("_______________________________________________________");
		System.out.println("Inserte un número:");
		System.out.print(">");
		n1=Metodo01.pideNumeros();
		System.out.println("Inserte otro número:");
		System.out.print(">");
		n2=Metodo01.pideNumeros();
		System.out.println("");
		System.out.println(numeroDivisor(n1, n2));
		System.out.println();
		System.out.println("Sesión finalizada");
		
	}
	public static String numeroDivisor(int a, int b) {
		if (a%b==0) {
			return a+" es divisible por "+b;
		} else {
			if (b%a==0) {
			
			return b+"  es divisible por "+a;
			}
			else{
				return "no son divisibles";
			}
		}
		
		
	}

}
