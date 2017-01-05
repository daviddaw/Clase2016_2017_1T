package ejerciciosPseudocodigo;


public class Ejercicio37 {

	public static void main(String[] args) {
		// Orden
		
		int a,b,c,aux=0;
		boolean orden=true;
		
		System.out.println("Escribe tres números.");
		a=LeerTeclado.readInteger();
		b=LeerTeclado.readInteger();
		c=LeerTeclado.readInteger();
		
		if (a>b) {
			aux=a;
			a=b;
			b=aux;
			orden=false;
		}
		
		if (a>c) {
			aux=a;
			a=c;
			c=aux;
			orden=false;
					
				} 
		if(b>c) {
			aux=b;
			b=c;
			c=aux;
			orden=false;
		}
		System.out.println("Los números son "+a+", "+b+" y "+c);
		if (!orden) {
			System.out.println("No estaban en orden");
		} else {
			System.out.println("Estaban colocados en orden");

		}
	}

}
