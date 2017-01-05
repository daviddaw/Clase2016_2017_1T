package ejerciciosPseudocodigo;

public class Ejercicio01 {

	public static void main(String[] args) {
	//declaracion
		int n1,n2;
		int suma,resta,multi;
		double divi;
		System.out.println("Escribe dos numeros");

	//inicializacion
		n1=LeerTeclado.readInteger();
		n2=LeerTeclado.readInteger();
	
	//algoritmo
		suma=n1+n2;
		resta=n1-n2;
		multi=n1*n2;
		
		//salida
		System.out.println("la suma es "+suma);
		System.out.println("la resta es "+resta);
		System.out.println("la multiplicacion es "+multi);
		if (n2==0) {
			System.out.println("no se puede dividir entre cero.");
		} else {
			divi=(double)n1/n2;//esto es hacer un casting.   n1 es un int y no guarda decimales,con el  casting lo usariamos como double y podriamos guardar decimales.
			System.out.println("la division es "+divi);
		}
	    
		

	

	}

}
