package ejerciciosprac1;
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner lectura = new Scanner (System.in);
	 int numero;
	  System.out.println("Ingrese un numero");
	 numero=lectura.nextInt();
	  
	 int doble;
	 doble=numero*2;
	  System.out.println(doble);
	 int triple;
	 triple=numero*3;
	  System.out.println(triple);
	  System.out.println(Math.sqrt(numero));
	}

}
