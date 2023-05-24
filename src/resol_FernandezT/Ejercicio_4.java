package resol_FernandezT;
import java.util.Scanner;
public class Ejercicio_4 {
	public void contraseña() {
		Scanner sc = new Scanner(System.in);

		
		boolean salir = false;

		do {
			System.out.println("Ingresar password: ");
			String contra = sc.next();
			int cantidad = contra.length();
			int mayus = 0;
			int min = 0;
			int ch = 0;
			int numeros = 0;
            int guiones = 0;
			String num[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "_"};

			for (int i = 0; i < cantidad; i++) {
				char caracter = contra.charAt(i);
				if (contra.charAt(ch) >= 65 && contra.charAt(ch) <= 90) {
					mayus++;
				} else if (contra.charAt(ch) >= 97 && contra.charAt(ch) <= 122) {
					min++;
				} else if (caracter >= 48 && caracter <= 57 || caracter == '_' ) {
                    numeros++;
                   
                }
				
				
				
		
			ch++; 
				
			}
			if (min > 2 && mayus > 1 && cantidad >= 8 && numeros > 1) {
				System.out.println("Contrasenia correcta");
				salir = true;
			} else {
				System.out.println(cantidad);
				System.out.println("El password no cumple los requisitos. Vuelve a intentarlo: ");
			}
			
		} while (!salir);
	}
}





