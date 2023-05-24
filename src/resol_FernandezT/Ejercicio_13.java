package resol_FernandezT;

import java.util.Scanner;
public class Ejercicio_13 {

	Scanner sc = new Scanner (System.in);

	public	static int Recursividad(int num) {

		if (num == 1) {
			return 1;
		}else  {
			return num + Recursividad(num-1);
		} 



	}

	public static int Iteratividad(int num) {
		int numb= 0;
		for (int i = 1; i <= num; i++) {
			numb+=i;

		}
		return numb;
	}
	public void IteRecur() {
		System.out.println("Ingresar hasta donde se quiere sumar");
		int tope= sc.nextInt();
		System.out.println("Ingresar que se quiere hacer Recursividad 'R' o Iterar 'I'");
		String eleccion = sc.next();
		
	if (eleccion.equalsIgnoreCase("r")) {
		System.out.println(Recursividad(tope));
	}else if (eleccion.equalsIgnoreCase("i")) {
		System.out.println(Iteratividad(tope));
	}

}
}
