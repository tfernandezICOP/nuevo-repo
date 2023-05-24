package resol_FernandezT;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio_10 {
	public static void ISBN() {
	Scanner sc = new Scanner(System.in);
	int isbn[]= new int[9];
	int org[]=new int [11];
	int a=1;
	int sum=0;
	int j=0;
	int o=0;
	for (int i = 0; i < isbn.length; i++) {
		isbn[i]=sc.nextInt();
		org[i]= isbn[i];
		
	}
		
	for (int i = 0; i < isbn.length; i++) {
		isbn[i]=isbn[i]*a;
		a++;
	}	
	System.out.println();
	for ( j = 0; j < isbn.length; j++) {
		sum+=isbn[j];
		
	}
	sum%=11;
	for (o = 0; o < org.length-1; o++) {
        if (org[9] == org[o]) {
            org[9] = sum;
            
        }
     
    }
	
	int[] neworg = Arrays.copyOf(org, org.length - 1);
	for (int i = 0; i < neworg.length; i++) {
		if(neworg[i]==neworg[9]) {
			System.out.print("-");
		}
		else if(neworg[i]==neworg[4]) {
        	System.out.print("-");
        }else if(neworg[i]==neworg[1]) {
        	System.out.print("-");
        }
		
		System.out.print(neworg[i] +"");
		
    }
	
	System.out.println();
	}
}
