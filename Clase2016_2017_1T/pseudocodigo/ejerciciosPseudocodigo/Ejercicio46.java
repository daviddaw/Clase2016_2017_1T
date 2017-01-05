package ejerciciosPseudocodigo;

public class Ejercicio46 {

	public static void main(String[] args) {
		//46.	Dada una fecha en formato dd mm aaaa calcular cuál será la fecha 
		//dentro de n días
		int mes,dia,anio,i,n;
		System.out.println("Introduzca fecha dd/mm/aaaa");
		System.out.println("dia");
		dia=LeerTeclado.readInteger();
		System.out.println("mes");
		mes=LeerTeclado.readInteger();
		System.out.println("año");
		anio=LeerTeclado.readInteger();
		System.out.println("Introduza dentro de cuantos días");
		n=LeerTeclado.readInteger();
		for (i=1;i<=n;i++){
			if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
				if (dia<=31)
					dia+=1;
				if (dia>31){
					mes+=1;
					dia=1;	
				}
					
			}
			
			if (mes==4 || mes==6 || mes==9 || mes==11){
				if (dia<=30)
					dia+=1;
				if (dia>30){
					mes+=1;
					dia=1;
				}
				
			}
			if (mes==2){
				if (anio%4==0 && (anio%100!=0 || anio%400==0)){
					if (dia<=29)
						dia+=1;
					if (dia>29){
						mes+=1;
						dia=1;
					}
				}
				else {
					if (dia<=28)
						dia+=1;
					if (dia>28){
						mes+=1;
						dia=1;
					}
				}
			}
			if (mes>12){
				anio+=1;
				mes=1;
				dia=1;
			}
				
		}
		System.out.println("La fecha seria "+dia+"/"+mes+"/"+anio);
		
	
	}

}
