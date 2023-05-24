package resol_FernandezT;
import java.util.Scanner;
public class Ejercicio_6 {
	public static void primos() {
		Scanner sc= new Scanner(System.in);
		int contador = 2;
		boolean primo=true;
		int numero;
		numero= sc.nextInt();
		for (int i = 2; i < numero; i++) {
			while(numero%i==0 ){
				System.out.println(numero +" No es primo");
				numero= sc.nextInt();
			}
			
			
		}
		System.out.println(numero + " Es primo");
	}
}
