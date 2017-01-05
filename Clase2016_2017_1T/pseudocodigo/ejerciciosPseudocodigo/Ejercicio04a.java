package ejerciciosPseudocodigo;

public class Ejercicio04a {

	public static void main(String[] args) {
		//Declaracion
		int a,b,c,x1,x2;
		double y1,y2;
		//Inicializar variables
		System.out.println("Escribe un valor para a, b, c ");
		a=LeerTeclado.readInteger();
		b=LeerTeclado.readInteger();
		c=LeerTeclado.readInteger();
		System.out.println(" escribe dos valores para x ");
		x1=LeerTeclado.readInteger();
		x2=LeerTeclado.readInteger();
		
		//Algoritmo
		
		y1=a*Math.pow(x1,2)+b*x1+c;
		
		y2= a*(Math.pow(x2, 2))+b*x2+c;
		
		//Salida
		
		System.out.println("El resultado de la ecuacion para la primera x es "+(int)y1+
				" y el resultado de la ecuacion para la segunda x es "+(int)y2);
				
				
		
		

	}

}
