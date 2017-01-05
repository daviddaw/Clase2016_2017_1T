package ejerciciosPseudocodigo;

import ejerciciosMetodos.Metodo01;

public class Ejercicio02 {

	public static void main(String[] args) {
	
	//Declaracion y inicializacion	
    int R;//radio
    double longitud,circulo;
    final double PI=3.1416;
    System.out.println("Escribe un valor para el radio ");
    R=Metodo01.pideNumeros();
    
    
    //algoritmos
    longitud=2*PI*R;
    circulo=PI*Math.pow(R, 2);
    
    
    //Salida
    System.out.println("La longitud de la circunferecia es "
    +longitud+" y el area del circulo es "+circulo);

	}

}
