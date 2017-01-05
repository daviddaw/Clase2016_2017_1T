package ejerciciosPseudocodigo;

public class Ejercicio45 {

	public static void main(String[] args) {
		// introducir una fecha y decir a que dia corresponde
		int dia, mes,year,dias=0,opcion;
		System.out.println("Escribe el dia");
		dia=LeerTeclado.readInteger();
		System.out.println("Escribe el mes");
		mes=LeerTeclado.readInteger();
		System.out.println("Escribe el año");
		year=LeerTeclado.readInteger();
		System.out.println(dia+"/"+mes+"/"+year);
		
		System.out.println("Opcion 1 para meses naturales u opcion 2 para meses de 30 dias");
		opcion=LeerTeclado.readInteger();
		if(opcion==2){
			System.out.println("considerando meses de 30 dias, ");
			dias=dia+(mes-1)*30;		
		}
		if(opcion==1){
			System.out.println("considerando meses naturales, ");
			switch (mes){
			case 12:dias+=30;
			case 11:dias+=31;
			case 10:dias+=30;
			case 9:	dias+=31;
			case 8:	dias+=30;
			case 7:	dias+=31;
			case 6:	dias+=31;
			case 5:	dias+=30;
			case 4:	dias+=31;
			case 3:	dias+=28;
			case 2: if (year%4==0 && (year%100!=0 || year%400==0)){
				dias+=29;}
			else{
				dias+=28;}
			case 1: dias+=0;
			dias+=dia;
		}
		
		
		
		
	}
		System.out.println(dias+"º dia del año "+year+".");
}
}
