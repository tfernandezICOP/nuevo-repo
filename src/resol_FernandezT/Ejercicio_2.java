package resol_FernandezT;
import java.util.Iterator;
import java.util.Scanner;
public class Ejercicio_2 {
	public void promedio () {
	Scanner sc = new Scanner (System.in);
	System.out.println("Ingresar la cantidad de elementos");
	int n = sc.nextInt();
	int j = 0;
	int notas[] = new int[n];
	double promedio = 0;
	double suma = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Ingresar los numeros: ");
			notas[i] = sc.nextInt();
		}
		for (int i = 0; i < notas.length; i++) {
			suma+=notas[i];
			promedio = suma /notas.length;
			
			
		}
	
		System.out.println();
		System.out.println("Esta es la suma total del array "+ (int) suma);
		System.out.println("Este es el promedio "+promedio);
		for (j = 0; j < notas.length; j++) {
			if (promedio < notas[j]) {
				System.out.println("Enteros del array mayor al promedio: " + notas[j]);
			}
		}
			
	}
		
}
