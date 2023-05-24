package resol_FernandezT;
import java.util.Scanner;
public class Ejercicio_12 {
	public void ternario() {
		Scanner sc = new Scanner (System.in);
		int numero = sc.nextInt();
		String resultado;
		resultado = (numero%2 == 0) ? "Es par" : "Es impar ";
		System.out.println(resultado);
		System.out.println();
		int c = sc.nextInt();
		String resultado2;
		resultado2 = (c>= 0) ? c+" Es positivo" : c+" Es negativo ";
		System.out.println(resultado2);
		resultado2=	(c%2== 0) ? c+" Es par" : c+" Es impar ";
		System.out.println(resultado2);
		resultado2= (c%5== 0) ? c+" Es multiplo de 5" : c+" No es multiplo de 5 ";
		System.out.println(resultado2);
		resultado2= (c%10== 0) ? c+" Es multiplo de 10" : c+" No es multiplo de 10 ";
		System.out.println(resultado2);
		resultado2= (c<100) ? c+" Es menor que 100" : c+" Es mayor que 100 ";
		System.out.println(resultado2);
		
		
		
		
	}
}
