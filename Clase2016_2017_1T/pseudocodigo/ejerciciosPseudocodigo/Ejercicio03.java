package ejerciciosPseudocodigo;

public class Ejercicio03 {

	public static void main(String[] args) {
		//declaracion
		int y1,y2,a,x1,x2,b;
       //inicializacion
        System.out.println("Escribe un valor para a y b");
        a=LeerTeclado.readInteger(); b=LeerTeclado.readInteger();
        System.out.println("escribe dos valores para x");
        x1=LeerTeclado.readInteger();
        x2=LeerTeclado.readInteger();
        //Algoritmo
        y1=a*x1+b;
        y2=a*x2+b;
        
       //salida
       System.out.println("El resultado para la primera x es "+y1+" y para la segunda x es "+y2);
	}

}
