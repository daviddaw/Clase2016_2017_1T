package metodosSubirNota;
/*2.- Escribe un programa que pida por teclado una cantidad de euros  y una moneda que
 *    puede ser  d�lar, yen o libras y convierta la cantidad de euros  a la otra moneda. 
 *    Para ello se invocar� a un m�todo que tendr� como par�metros la cantidad de euros 
 *    y la moneda a pasar;  este m�todo no devolver� ning�n valor y mostrar� un mensaje indicando el cambio.
	El cambio de divisas es:
�	1 EUR = 0,79550 Libras esterlinas
�	1 EUR = 1,24650 d�lar americano
�	1 EUR = 144,959 JPY
*/
public class metodoSubirNota02 {

	public static void main(String[] args) {
		double euros,menu;
		System.out.println("=================================================");
		System.out.println("              Men� principal");
		System.out.println(" ");
		System.out.println("=================================================");
		System.out.println(" ");
		System.out.println("Escribe una cantidad de Euros.");
		euros=LeerTeclado.readDouble();
		System.out.println("          Elija una moneda:");
		System.out.println(" ");
		System.out.println("> Pulse 1 para convertir a dolar.");
		System.out.println(" ");
		System.out.println("> Pulse 2 para convertir a yen.");
		System.out.println(" ");
		System.out.println("> Pulse 3 para convertir a libras.");
		System.out.println(" ");
		System.out.println("=================================================");
		menu=LeerTeclado.readInteger();
		System.out.println(euros+menu);
	}

}
