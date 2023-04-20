package ejerciciosprac1;
import java.util.Scanner;
public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner lectura= new Scanner (System.in);
		int Grados;
		 System.out.println("Ingrese la cantidad de Grados centigrados");
		Grados=lectura.nextInt();
		int Formula;
		Formula= 32 + (9 * Grados / 5);
		 System.out.println("La cantidad de grados farenheit son: "+Formula);
		 
	
		
	}

}
