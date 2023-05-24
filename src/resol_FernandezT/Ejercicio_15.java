package resol_FernandezT;
import java.util.Scanner;

public class Ejercicio_15 {
	public static void vocales() {
		Scanner sc = new Scanner(System.in);
		String vocales[] = {"A", "E", "I", "O", "U"};
		int indice;
		boolean bandera = false;
		do {
			System.out.println("Ingresar indice: ");
			indice = sc.nextInt();
			
			if (indice == -1) {
				bandera = true;
			} else if (indice >= 0 && indice < vocales.length) {
				System.out.println(vocales[indice]);
			} else {
				System.out.println("Error de indice, vuelva a ingresar otro.");
			}
		} while (!bandera);

		System.out.println("Se ingreso -1, se salio del programa.");
	}
}
