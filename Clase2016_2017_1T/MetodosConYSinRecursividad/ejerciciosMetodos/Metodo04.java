package ejerciciosMetodos;

public class Metodo04 {
	/*4.	Escribir un m�todo que reciba como par�metro un n� y devuelva si es o no primo. Escribir un main que pida 
	 * un n� por teclado mayor que 1 y determine si es o no primo invocando a dicho m�todo.*/
	public static void main(String[] args) {
		int n1;
		System.out.println("Esribe un numero para calcular si es primo");
		System.out.println("__________________________________________");
		System.out.println("Inserte un n�mero:");
		System.out.print(">");
		n1=Metodo01.pideNumeros();
	
		System.out.println(esPrimo(n1));
		System.out.println();
		System.out.println("Sesi�n finalizada");
	}
	public static String esPrimo(int n) {
		boolean primo;
		primo=true;
        for (int i = 2; i <=n/2; i++) {
        	if (n%i==0) {
				primo=false;
			}	
		}
       if (primo) {
    	   
    	   return "El n�mero "+n+" es primo";
	} else {
		 return"El n�mero "+n+" no es primo";

	}
		
		
	}
	

}
