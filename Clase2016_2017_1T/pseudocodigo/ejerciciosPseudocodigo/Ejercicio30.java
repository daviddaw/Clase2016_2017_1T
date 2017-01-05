package ejerciciosPseudocodigo;

public class Ejercicio30 {

	public static void main(String[] args) {
		// 25 alumnos mas joven, mayor, media
		int edad,max,min;
		max=Integer.MIN_VALUE;//al max le ponemos el mas pequeño y cualquiera que lo supere ya sera el maximo
		min=Integer.MAX_VALUE;//al min le ponenos el mayor el valor mas alto asi cualquiera que metamos es menor
		for (int i = 1; i <=25 ; i++) {
			do {
				System.out.println("introduce la edad");
				edad=LeerTeclado.readInteger();
				if (edad<0) {
					System.out.println("vuelve a introducir la edad del alumno "+i+ ", no se permite una edad negativa");
				} else {
					if (edad>110) {System.out.println("vuelve a introducir la edad del alumno "+i+ ", no se permite una edad mayor de 110");

					}

				}
			} while (edad<0 || edad>110);

			if (edad<min) {
				min=edad;
			} else {
				if (edad>max) {
					max=edad;
				} 

			}



		}
		System.out.println("La edad maxima es "+max+" y la edad minima es "+min);
	}
}
