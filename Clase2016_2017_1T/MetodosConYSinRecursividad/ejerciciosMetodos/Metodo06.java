package ejerciciosMetodos;

public class Metodo06 {

	public static void main(String[] args) {
		/*6.	Usando el m�todo del apartado 4, obtener los N primeros n�meros primos siendo N un n� introducido por teclado.*/
		int tope,n=2,cont=1;
		boolean primo;
		System.out.println("Usando el m�todo del apartado 4, obtener los N primeros n�meros primos siendo N un n� introducido por teclado.");
		System.out.println("");
		System.out.println("______________________________________________________________________________________________________________");
		System.out.println("Inserte el numero de primos que quiere mostrar:");
		System.out.print(">");
		tope=Metodo01.pideNumeros();
		
		while (cont<=tope) {
			primo=true;
			primo=Metodo04bis.name(n);
			if(primo==true)//si primo es verdadero
			{
				cont++;  //con cada primo aumentara 1 el contador sumaremos uno al contador
				System.out.println(n);
			}
			n++;// sumamos un numero
		}
		System.out.println(" ");
     System.out.println("Sesi�n finalizada");
	}

}
