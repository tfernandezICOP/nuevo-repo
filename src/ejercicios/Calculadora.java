package ejercicios;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
	Scanner lectura= new Scanner(System.in);	
		String op;
		double a = 0.0;
		double b = 0.0;
		double resultado;
	System.out.println(" Suma");
	System.out.println(" Resta");
	System.out.println(" Multiplicacion");
	System.out.println(" Division");
	op=lectura.next();
	switch(op) {
	case "Suma":
		System.out.println("Ingrese su primer numero");
		a= lectura.nextDouble();
		System.out.println("Ingrese su segundo numero");
		b= lectura.nextDouble();
		resultado= a + b;
		System.out.println("Su resultado es "+ resultado);
		break;
	case "Resta":
		System.out.println("Ingrese su primer numero");
		a= lectura.nextInt();
		System.out.println("Ingrese su segundo numero");
		b= lectura.nextInt();
		resultado= a-b;
		System.out.println("Su resultado es "+ resultado);
		break;
	case "Multiplicacion":
		System.out.println("Ingrese su primer numero");
		a= lectura.nextInt();
		System.out.println("Ingrese su segundo numero");
		b= lectura.nextInt();
		resultado=a*b;
		System.out.println("Su resultado es "+ resultado);
		break;
	case "Division":
		System.out.println("Ingrese su primer numero");
		a= lectura.nextInt();
		System.out.println("Ingrese su segundo numero");
		b= lectura.nextInt();
		resultado=a/b;
		System.out.println("Su resultado es "+ resultado);
		break;
	default:
		System.out.println("Lo ingresa es incorrecto");
	
		
	
	
	
	
		}
	
	}

}
