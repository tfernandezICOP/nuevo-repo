package ejercicios;
import java.util.Scanner;
public class MayorOMenor {
	public static void main(String[] args) {
	int num1;
	int num2;
	Scanner lectura=new Scanner(System.in);
	 System.out.println("Ingrese su primer numero");
	num1= lectura.nextInt(); 
	 System.out.println("Ingrese su segundo numero");
	num2= lectura.nextInt();
	if(num1>num2) {
		 System.out.println("Su numero mas es "+ num1);
		
		
	  }else if(num1==num2) {
		 System.out.println("Sus numeros son iguales");  
	    }else {
	     System.out.println("Su numero mayor es "+ num2);	
	    	
	     } 
	}
}
