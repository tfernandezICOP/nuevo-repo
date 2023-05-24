package resol_FernandezT;
import java.util.Scanner;
public class Ejercicio_3 {
	
	
	public static void invertir() {
	Scanner sc = new Scanner(System.in);	
		int numero= 0;
		int unidad;
		int aux = 0;
		System.out.println("Ingresar numeros");
		numero = sc.nextInt();
		int original = numero; 
		while (numero>0) {
			unidad = numero%10;
			
			numero= (int) Math.floor(numero/10);
			
			aux= aux*10+unidad;
			
			
			
		}
		
		if (original == aux) { // Comparar el número original con el número invertido
			System.out.println("El numero: " + aux + " es capicua");
		} else {
			System.out.println("El numero: " + aux + " no es capicua");
		}
			
		//}
	}
}
