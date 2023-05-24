package resol_FernandezT;
import java.util.Scanner;
public class Ejercicio_9 {
	public static void ordenamiento() {
	Scanner sc = new Scanner(System.in);	
	int numeros[]= new int [5];
	int i =0;
	int aux = 0;
	for ( i = 0; i < numeros.length; i++) {
		System.out.println("Ingresar numeros");
		numeros[i]= sc.nextInt();
		}
	for (int j = 0; j < numeros.length; j++) {
		for (int j2 = 0; j2 < numeros.length-1; j2++) {
			if(numeros[j2]>numeros[j2+1]) {
				aux=numeros[j2];
				numeros[j2]=numeros[j2+1];
				numeros[j2+1]=aux;
				
			}
		}
		System.out.print( numeros[j] + " ");
	}
	
}
}