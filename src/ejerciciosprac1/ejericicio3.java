package ejerciciosprac1;
import java.util.Scanner;
public class ejericicio3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner lectura= new Scanner (System.in);
		String Frase;
		System.out.println("Escriba una frase");
		Frase=lectura.next();
		Frase= Frase.toLowerCase();
			System.out.println(Frase);
		Frase= Frase.toUpperCase();
			System.out.println(Frase);
	}
	

}
