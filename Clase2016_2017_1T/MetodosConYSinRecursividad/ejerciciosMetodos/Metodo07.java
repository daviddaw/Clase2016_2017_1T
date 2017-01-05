package ejerciciosMetodos;

public class Metodo07 {
	/*7.	Escribir un m�todo que reciba por par�metro un n� y devuelva la suma de sus divisores,salvo �l mismo. 
	 * Utilizando este m�todo, escribir un main para obtener todos los n�meros perfectos menores que un N introducido por teclado.*/
	public static void main(String[] args) {
		int n1,menu;
		boolean perfecto=false;
		System.out.println("=================================================");
		System.out.println("              Men� principal");
		System.out.println(" ");
		System.out.println("=================================================");
		System.out.println(" ");
		System.out.println("Inserte un n�mero:");
		System.out.print(">");
		n1=Metodo01.pideNumeros();
		System.out.println("            Elija una opci�n:");
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
		case 1:System.out.println("la suma de los divisores del n�mero "+n1+" es "+sumaDivisores(n1));

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
		default:System.out.println("No has introducido un numero valido. (1 � 2)");
		break;
		}
		System.out.println(" ");

		System.out.println("Sesi�n finalizada.");
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