package ejerciciosPseudocodigo;

public class Ejercicio35 {
//numeros primos hasta n
	public static void main(String[] args) {
		int n;
		boolean primo=true;
		
		System.out.println("Introduce un numero ");
		n=LeerTeclado.readInteger();
		for (int i=2;i<=n;i++){
			primo=true;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
						primo=false;
				}
			}
			if(primo==true){
				System.out.println("Primos:"+i);
			}
		
		}
	}

}
