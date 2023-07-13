package examen;

import java.util.Scanner;

import examen.Poliza.Cobertura;
import examen.Poliza.FormaPago;
public class Main {
	private static int eleccion;
	private static void Menu()
	{
		System.out.println("1. Registrar cliente");
		System.out.println("2. Listar todos los clientes");
		System.out.println("3. Buscar cliente por documento");
		System.out.println("4. Registrar vehiculo");
		System.out.println("5. Listar vehiculos");
		System.out.println("6. Buscar vehiculo por matricula");
		System.out.println("7. Registrar poliza");
		System.out.println("8. Pagar cuota");
		System.out.println("9. Listar polizas");
		System.out.println("10. Buscar poliza");
		System.out.println("11. Ver datos estadisticos");
		System.out.println("0. Salir");
		Scanner sc = new Scanner(System.in);
		System.out.print("Opcion: ");
		eleccion = sc.nextInt();

		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aseguradora aseguradora = new Aseguradora("La Tercera Seguros");
		Cliente cliente1 = new Cliente("marcos", "Stival", "Masculino", 1234, "marcos@hotmail.com", "Calle Principal 123", 987654321);
		Cliente cliente2 = new Cliente("lucia", "gigliotti", "Femenino", 5678, "lucia@hotmail.com", "Avenida Secundaria 456", 123456789);
		Cliente cliente3 = new Cliente("Maria", "Gomez", "Femenino", 9876, "maria@hotmail.com", "Calle Secundaria 789", 987654321);
		Cliente cliente4 = new Cliente("Mariano", "Martinez", "Masculino", 4321, "mariano@hotmail.com", "Avenida Principal 789", 654987321);

		aseguradora.agregarCliente(cliente1);
		aseguradora.agregarCliente(cliente2);
		aseguradora.agregarCliente(cliente3);
		aseguradora.agregarCliente(cliente4);

		Taxi taxi1 = new Taxi("Toyota", "ABC123", 2022, 12345, 67890, 150, 123456);
		Autobus autobus1 = new Autobus("Mercedes-Benz", "DEF456", 2023, 54321, 98765, 200, 500);
		Taxi taxi2 = new Taxi("Nissan", "GHI789", 2021, 54321, 98765, 200, 654321);
		Autobus autobus2 = new Autobus("Volvo", "JKL012", 2023, 98765, 43210, 150, 300);
		aseguradora.agregarVehiculo(autobus1);
		aseguradora.agregarVehiculo(autobus2);
		aseguradora.agregarVehiculo(taxi1);
		aseguradora.agregarVehiculo(taxi2);

		Poliza poliza1 = new Poliza("2023-07-12", "2024-07-12", 12, FormaPago.debito, 100000, true, 5000, Cobertura.terceros, cliente1, autobus1);
		Poliza poliza2 = new Poliza("2023-08-01", "2024-08-01", 6, Poliza.FormaPago.efectivo, 150000, false, 0, Poliza.Cobertura.total, cliente2, taxi1);
		Poliza poliza3 = new Poliza("2023-09-01", "2024-09-01", 10, Poliza.FormaPago.efectivo, 200000, true, 8000, Poliza.Cobertura.parcial, cliente3, autobus2);
		Poliza poliza4 = new Poliza("2023-10-01", "2024-10-01", 8, Poliza.FormaPago.trasnferencia, 180000, false, 0, Poliza.Cobertura.total, cliente4, taxi2);

		aseguradora.agregarpolizas(poliza1);
		aseguradora.agregarpolizas(poliza2);
		aseguradora.agregarpolizas(poliza3);
		aseguradora.agregarpolizas(poliza4);
		Cuota cuota = new Cuota(1, 500, true, "15/08/2023", Cuota.FormaPago.efectivo, poliza1);
		aseguradora.agregarCuota(cuota);
		
		eleccion = -1;
		while (eleccion != 0) {
			Menu();
		    switch (eleccion) {
		        case 1:
		            aseguradora.registrarcliente();
		            break;
		        case 2:
		            aseguradora.mostrarclientes();
		            break;
		        case 3:
		            aseguradora.buscarClienteDni();
		            break;
		        case 4:
		            aseguradora.registrarvehiculo();
		            break;
		        case 5:
		            aseguradora.mostrarvehiculos();
		            break;
		        case 6:
		        	aseguradora.buscarVehiculoxpatente();
		            break;
		        case 7:
		            aseguradora.registrarPoliza();
		            break;
		        case 8:
		        	aseguradora.pagarCuotasPoliza();
		            break;
		        case 9:
		        	aseguradora.mostrarpolizas();
		            break;
		        case 10:
		        	aseguradora.buscarpoliza();
		            break;
		        case 11:
		        	aseguradora.mostrarEstadisticas();
		        	break;
		        case 0:
		            System.out.println("saliste!");
		            break;
		        default:
		            System.out.println("Opcion invalida");
		            break;
		    }
		}
		}
	}
	




