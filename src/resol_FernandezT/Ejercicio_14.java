package resol_FernandezT;
import java.util.Scanner;
public class Ejercicio_14 {
	public void Arrays()   {
		Scanner sc = new Scanner (System.in);
		int array []= new int[10];
		int i;
		int indice= 0;
		for (i = 0; i < array.length; i++) {
			System.out.println("Introduzca numero: ");
			array [i]= sc.nextInt();
			
		}
		
		for(i=0; i<array.length; i++)
        {
			System.out.print(indice + ": ");
            System.out.println(array[i]);
            indice++;
        }
		
		
		
		
	}
}
