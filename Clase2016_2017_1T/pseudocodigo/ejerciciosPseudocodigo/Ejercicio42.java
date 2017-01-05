package ejerciciosPseudocodigo;

public class Ejercicio42 {

	public static void main(String[] args) {
		// Números amigos
		int n1,n2,acumulador1=0,acumulador2=0;
		System.out.println("escribe dos numeros");
		n1=LeerTeclado.readInteger();//284
		n2=LeerTeclado.readInteger();//220
		boolean amigo1=false,amigo2=false;

		for (int i = 1; i <= n1/2; i++) {
			if(n1%i==0){
				System.out.print(i+" ");
				acumulador1=acumulador1+i;	
			}
		}
		System.out.println(" su suma es "+acumulador1);
		if(acumulador1==n2){
			amigo1=true;
		}

		for (int x = 1; x <= n2/2; x++) 
		{		
			if(n2%x==0){
				System.out.print(x+" ");
				acumulador2=acumulador2+x;		
			}

		}
		System.out.println("su suma es "+acumulador2);
		if(acumulador2==n1){
			amigo2=true;
		}
		
		if (amigo1 && amigo2){
			System.out.println("Los numeros "+n1+" y "+n2+" son amigos.");
		}
	}
}