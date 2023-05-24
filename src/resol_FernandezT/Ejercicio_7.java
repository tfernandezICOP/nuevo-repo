package resol_FernandezT;
import java.util.Scanner;
public class Ejercicio_7 {
	public void contar() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresar palabra");
		String palabra= "";
		palabra = sc.nextLine();
		int contar = palabra.length();
		
		System.out.println("La palabra ingresada cuenta con " + contar +" caracteres");
		
	}
}
