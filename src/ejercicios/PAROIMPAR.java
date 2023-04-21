package ejercicios;
import java.util.Scanner;
public class PAROIMPAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner lectura= new Scanner(System.in);
	int numero;
	 System.out.println("Introduzca su numero");
	numero=lectura.nextInt();
	
	if(numero%2==0) {
		 System.out.println("Su numero es par");
			
	   }else {
		 System.out.println("Su numero es impar");   
	    }
	
	
	}
	

}
