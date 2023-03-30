package tarea_clase;
import java.util.Scanner;
public class voltaje {

	public static void main(String[] args) {
//Este Programa realiza operaciones con el voltaje ingresado
		
//lenyendo la entrada del usuario		
Scanner tcl = new Scanner(System.in);
		 
//Declarando las variables	
float volt=0 ;
int lista;
float min=Integer.MAX_VALUE,max=Integer.MIN_VALUE, tem=0, prom=0;

 System.out.println("Ingrese la cantidad de voltaje que a calcular: ");
 lista = tcl.nextInt();

  for(int i = 1 ; i <= lista ; i++)
 {
	
	System.out.println("Ingrese el voltaje:  ");
	volt=tcl.nextInt();  
	  
	tem= tem+volt;
	prom = tem/lista;
	
	
	//Validando maximo y minimo
	
	if(volt>max) {
			
	max=volt;
	
	}
	
	if(volt<min) {
	min=volt;
	
	}
	  	
	
 }

  System.out.println("El promedio del voltaje es: " +prom);
  System.out.println("El Voltaje maximo es:"+ max);
  System.out.println("El Voltaje maximo es:"+ min);
		
	}

}
