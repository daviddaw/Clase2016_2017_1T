package ejerciciosMetodos;

public class Metodo07 {
	/*7.	Escribir un método que reciba por parámetro un nº y devuelva la suma de sus divisores,salvo él mismo. 
	 * Utilizando este método, escribir un main para obtener todos los números perfectos menores que un N introducido por teclado.*/
	public static void main(String[] args) {
		int n1,menu;
		boolean perfecto=false;
		System.out.println("=================================================");
		System.out.println("              Menú principal");
		System.out.println(" ");
		System.out.println("=================================================");
		System.out.println(" ");
		System.out.println("Inserte un número:");
		System.out.print(">");
		n1=Metodo01.pideNumeros();
		System.out.println("            Elija una opción:");
		System.out.println(" ");
		System.out.println("=================================================");
		System.out.println(" ");
		System.out.println("> Pulse 1 para sumar los divisores.");
		System.out.println(" ");
		System.out.println("> Pulse 2 para mostrar numeros perfectos hasta N.");
		System.out.println(" ");
		System.out.println("=================================================");
		menu=Metodo01.pideNumeros();
		switch (menu) {
		case 1:System.out.println("la suma de los divisores del número "+n1+" es "+sumaDivisores(n1));

		break;
		case 2:		System.out.println("Los numeros perfectos hasta "+n1+" son:");
		for (int i = 1; i <= n1; i++) 
		{
			if (sumaDivisores(i)==i) 
			{
				System.out.println(i);
				perfecto=true;
			}

		}
		if (perfecto==false) {
			System.out.println("no hay perfectos hasta  "+n1);
		}
		break;
		default:System.out.println("No has introducido un numero valido. (1 ó 2)");
		break;
		}
		System.out.println(" ");

		System.out.println("Sesión finalizada.");
	}
	public static int sumaDivisores(int n) {
		int acu=0,i;
		//System.out.println("los divisores son");
		for (i = 1; i <= n/2; i++) {
			if (n%i==0) {
				acu=acu+i;
			}		
		}
		return acu;
	}
}