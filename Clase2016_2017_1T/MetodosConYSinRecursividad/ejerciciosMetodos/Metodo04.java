package ejerciciosMetodos;

public class Metodo04 {
	/*4.	Escribir un método que reciba como parámetro un nº y devuelva si es o no primo. Escribir un main que pida 
	 * un nº por teclado mayor que 1 y determine si es o no primo invocando a dicho método.*/
	public static void main(String[] args) {
		int n1;
		System.out.println("Esribe un numero para calcular si es primo");
		System.out.println("__________________________________________");
		System.out.println("Inserte un número:");
		System.out.print(">");
		n1=Metodo01.pideNumeros();
	
		System.out.println(esPrimo(n1));
		System.out.println();
		System.out.println("Sesión finalizada");
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
    	   
    	   return "El número "+n+" es primo";
	} else {
		 return"El número "+n+" no es primo";

	}
		
		
	}
	

}
