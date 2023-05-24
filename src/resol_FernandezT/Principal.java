package resol_FernandezT;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ejercicio;
		System.out.println("1: Ejercicio 1");
		System.out.println();
		System.out.println("2: Ejercicio 2");
		System.out.println();
		System.out.println("3: Ejercicio 3");
		System.out.println();
		System.out.println("4: Ejercicio 4");
		System.out.println();
		System.out.println("5: Ejercicio 5");
		System.out.println();
		System.out.println("6: Ejercicio 6");
		System.out.println();
		System.out.println("7: Ejercicio 7");
		System.out.println();
		System.out.println("8: Ejercicio 8");
		System.out.println();
		System.out.println("9: Ejercicio 9");
		System.out.println();
		System.out.println("10: Ejercicio 10");
		System.out.println();
		System.out.println("11: Ejercicio 11");
		System.out.println();
		System.out.println("12: Ejercicio 12");
		System.out.println();
		System.out.println("13: Ejercicio 13");
		System.out.println();
		System.out.println("14: Ejercicio 14");
		System.out.println();
		System.out.println("15: Ejercicio 15");
		System.out.println();
		System.out.println("16: Ejercicio 16");
		System.out.println();
		System.out.println("0: Salir");
		System.out.println();
		
		System.out.print("Ingrese que ejercicio quiere: ");
		ejercicio =sc.nextInt();
		while(ejercicio != 0) {
			switch (ejercicio) {
			case 1: {
				System.out.println("Ingreso la opcion 1");
				Ejercicio_1 mi_ejercicio = new Ejercicio_1();
				mi_ejercicio.saludar();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;

			}

			case 2: {

				System.out.println("Ingreso la opcion 2");
				Ejercicio_2 mi_ejercicio = new Ejercicio_2();
				mi_ejercicio.promedio();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 3: {

				System.out.println("Ingreso la opcion 3");
				Ejercicio_3 mi_ejercicio = new Ejercicio_3();
				mi_ejercicio.invertir();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 4: {

				System.out.println("Ingreso la opcion 4");
				Ejercicio_4 mi_ejercicio =new Ejercicio_4();
				mi_ejercicio.contraseña();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 5: {

				System.out.println("Ingreso la opcion 5");
				Ejercicio_5 mi_ejercicio = new Ejercicio_5();
				mi_ejercicio.fibonacci();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 6: {

				System.out.println("Ingreso la opcion 6");
				Ejercicio_6 mi_ejercicio = new Ejercicio_6();
				mi_ejercicio.primos();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 7: {

				System.out.println("Ingreso la opcion 7");
				Ejercicio_7 mi_ejercicio = new Ejercicio_7();
				mi_ejercicio.contar();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 8: {

				System.out.println("Ingreso la opcion 8");
				Ejercicio_8 mi_ejercicio = new Ejercicio_8();
				mi_ejercicio.billetes();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 9: {

				System.out.println("Ingreso la opcion 9");
				Ejercicio_9 mi_ejercicio = new Ejercicio_9();
				mi_ejercicio.ordenamiento();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 10: {

				System.out.println("Ingreso la opcion 10");
				Ejercicio_10 mi_ejercicio = new Ejercicio_10();
				mi_ejercicio.ISBN();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 11: {

				System.out.println("Ingreso la opcion 11");
				Ejercicio_11 mi_ejercicio = new Ejercicio_11();
				mi_ejercicio.operando();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 12: {

				System.out.println("Ingreso la opcion 12");
				Ejercicio_12 mi_ejercicio = new Ejercicio_12();
				mi_ejercicio.ternario();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 13: {

				System.out.println("Ingreso la opcion 13");
				Ejercicio_13 mi_ejercicio = new Ejercicio_13();
				mi_ejercicio.IteRecur();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 14: {

				System.out.println("Ingreso la opcion 14");
				Ejercicio_14 mi_ejercicio = new Ejercicio_14();
				mi_ejercicio.Arrays();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 15: {

				System.out.println("Ingreso la opcion 15");
				Ejercicio_15 mi_ejercicio = new Ejercicio_15();
				mi_ejercicio.vocales();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			case 16: {

				System.out.println("Ingreso la opcion 16");
				Ejercicio_16 mi_ejercicio = new Ejercicio_16();
				mi_ejercicio.notas();
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
				break;
			}
			default:
				System.out.println("Incorrecto");
				System.out.print("Ingrese que ejercicio quiere: ");
				ejercicio =sc.nextInt();
			}
		}
		if (ejercicio == 0) {
			System.out.println("Se salio del menu de ejercicios");
		}
	}

}
