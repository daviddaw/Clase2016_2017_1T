package ejerciciosPseudocodigo;
//n primeros numeros primos
public class Ejercicio34 {
	public static void main (String [] args){

		int tope,cont
		,n;
		boolean primo;
		n = 2;
		cont = 0;

		System.out.println("Introduce un número.");
		tope=LeerTeclado.readInteger();//introducimos el numero de primos
		System.out.println("");
		while(cont<tope)//mientras el contador sea menor al numero de primos el bucle seguira
		{
			primo=true;//inicializamos el buleano a verdadero

			for(int i=2;i<=n/2;i++)//avanzara desde 2 hasta el numero que estemos analizando
			{
				if(n%i==0){
					primo=false;//si tiene un divisor no sera primo, y pondremos primo a falso 
				}	
			}
			
			if(primo==true)//si primo es verdadero
			{
				cont++;  //con cada primo aumentara 1 el contador sumaremos uno al contador
				System.out.println(n);
			}
			n++;// sumamos un numero
		}	
	}
}
