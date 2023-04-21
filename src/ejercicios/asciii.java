package ejercicios;
import java.util.Scanner;
public class asciii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner lectura = new Scanner (System.in);
	int numero;
	char ascii;
	 System.out.println("Ingrese su numero");
    numero=lectura.nextInt();
    ascii=(char)numero;
     System.out.println("Su caracter es " + ascii);
    
    
	}

}
