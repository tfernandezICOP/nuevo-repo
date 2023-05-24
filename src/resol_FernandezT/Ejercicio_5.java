package resol_FernandezT;
import java.util.Scanner;
public class Ejercicio_5 {
	
	public void fibonacci() {
		Scanner sc = new Scanner (System.in);
		int posicion;
		int n1 = 1;
		int n2= 0;
		int total= 0;
		System.out.println("Ingresar posicion");
		posicion = sc.nextInt();
		for (int i = 0; i <= posicion; i++) {
			total= n1+n2;
			n1=n2;
			n2=total;
			System.out.println(total);
		}
		
		
	
		
		
		
	}
	
}
