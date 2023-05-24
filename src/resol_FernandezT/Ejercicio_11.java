package resol_FernandezT;
import java.util.Scanner;
public class Ejercicio_11 {
	public static void operando() {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt() ;
		double b =sc.nextDouble();
		char c= sc.next().charAt(0);
		int convertir = (int)c;
		double resta= (double) (b-a);
		int suma= (int) (a+b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a +" + " + b +" = " + suma);
		System.out.println(b +" - " + a +" = " + resta);
		System.out.println("Valor numerico del caracter es: "+convertir);
		System.out.println("Suma: "+(suma+convertir));
				
		
		
		
	}
}
