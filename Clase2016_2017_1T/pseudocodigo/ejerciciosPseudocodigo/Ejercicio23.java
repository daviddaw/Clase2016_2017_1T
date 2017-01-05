package ejerciciosPseudocodigo;

public class Ejercicio23 {

	public static void main(String[] args) {
		// Multiplos de 5  del 10 al 75
		
		double y;

		for (int x = 10; x <= 75; x=x+5) {
			y= Math.pow(x, 3)+ 5*Math.pow(x, 2)-2*x;
			System.out.println("para x="+x+" el resultado es "+y);
		}
	}

}
