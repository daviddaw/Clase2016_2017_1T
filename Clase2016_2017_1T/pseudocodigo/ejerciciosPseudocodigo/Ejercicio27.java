package ejerciciosPseudocodigo;

public class Ejercicio27 {

	public static void main(String[] args) {
		// x*y sumas sucesivas
		int x,y,sumas=0;
		do {
			System.out.println("Introduce x e y( ambos deben ser positivos)");
			x=LeerTeclado.readInteger();
			y=LeerTeclado.readInteger();
			System.out.println("hola");
		} while (x<0 || y<0);

		System.out.println(x+" "+y);

		for (int i = 1; i <= x; i++) {
			sumas=sumas+y;
		}
		
		System.out.println("El productola suma es igual a "+sumas);
	}

}
