package resol_FernandezT;
import java.util.Scanner;
public class Ejercicio_8 {
	public void billetes(){
		Scanner sc= new Scanner (System.in);
		int numero= sc.nextInt();
		int total=0;
		if (numero>=100) {
			int cien = numero / 100; 
			total+=cien;
			numero %= 100;
			System.out.println("Se van a usar: " + cien+" de $100");
			
			
		} if(numero>=50) {
			int cincuenta = numero / 50; 
			total+=cincuenta;
			numero %= 50;
			System.out.println("Se van a usar: " + cincuenta +" de $50");
			 
		}if(numero>=20) {
			int veinte = numero / 20;
			total+=veinte;
			numero %= 20; 
			System.out.println("Se van a usar: " + veinte +" de $20");
		}if(numero>=10) {
			int diez = numero / 10;
			total+=diez;
			numero %= 10; 
			System.out.println("Se van a usar: " + diez +" de $10");
			
		} if (numero>=5) {
			int cinco = numero / 5;
			total+=cinco;
			numero %= 5; 
			System.out.println("Se van a usar: " + cinco+" de $5");
			 
		}if(numero>=2) {
			int dos = numero / 2;
			total+=dos;
			numero %= 2; 
			System.out.println("Se van a usar: " + dos +" de $2");
			
		}if(numero>=1) {
			int uno = numero / 1;
			total+=uno;
			numero %= 1; 
			System.out.println("Se van a usar: " +uno +" de $1");
			
		}
		
	}
}
