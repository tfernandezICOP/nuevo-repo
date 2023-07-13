package examen;
import java.util.*;

import examen.Poliza.Cobertura;



public class Aseguradora {
	Scanner sc = new Scanner (System.in);
	private String nombre;
	private List<Cliente> clientes;
	private List<Vehiculo> vehiculos;
	private List<Poliza> polizas;
	private List<Cuota> cuotas;

	
	public Aseguradora(String nombre) {
	    this.nombre = nombre;
	    this.clientes = new ArrayList<>();
	    this.vehiculos = new ArrayList<>();
	    this.polizas = new ArrayList<>();
	    this.cuotas = new ArrayList<>();
	}
	//mostrar clientes
	public void mostrarclientes(){
		System.out.println();
    	System.out.println("<<<<<<  LISTA DE CLIENTES >>>>>>");
    	if (clientes.isEmpty()) {
    		System.out.println("No hay empleados registrados.");
    		}else {
    		 for(int i=0; i< this.clientes.size();i++)
    		 {
    			 this.clientes.get(i).mostrar();
    		 }
    	}
	}
	//listar vehiculos
	public void mostrarvehiculos() {
	    System.out.println("----------------------------");
	    System.out.println("Ingrese que desea listar:");
	    System.out.println("1) Autobus\n2) Taxi\n3) TODOS");
	    System.out.print("Opcion: ");
	    int o = sc.nextInt();
	    switch (o) {
	        case 1:
	            System.out.println("1. Tipo de cobertura total");
	            System.out.println("2. Tipo de cobertura parcial");
	            System.out.println("3. Tipo de cobertura terceros");
	            int a = sc.nextInt();
	            switch (a) {
	                case 1:
	                    for (int i = 0; i < vehiculos.size(); i++) {
	                        if (vehiculos.get(i) instanceof Autobus && polizas.get(i).getTipoCobertura() == Cobertura.total) {
	                            vehiculos.get(i).mostrar();
	                        }
	                    }
	                    break;

	                case 2:
	                    for (int i = 0; i < vehiculos.size(); i++) {
	                        if (vehiculos.get(i) instanceof Autobus && polizas.get(i).getTipoCobertura() == Cobertura.parcial) {
	                            vehiculos.get(i).mostrar();
	                        }
	                    }
	                    break;

	                case 3:
	                    for (int i = 0; i < vehiculos.size(); i++) {
	                        if (vehiculos.get(i) instanceof Autobus && polizas.get(i).getTipoCobertura() == Cobertura.terceros) {
	                            vehiculos.get(i).mostrar();
	                        }
	                    }
	                    break;
	            }
	            break;

	        case 2:
	            System.out.println("1. Tipo de cobertura total");
	            System.out.println("2. Tipo de cobertura parcial");
	            System.out.println("3. Tipo de cobertura terceros");
	            int b = sc.nextInt();
	            switch (b) {
	                case 1:
	                    for (int i = 0; i < vehiculos.size(); i++) {
	                        if (vehiculos.get(i) instanceof Taxi && polizas.get(i).getTipoCobertura() == Cobertura.total) {
	                            vehiculos.get(i).mostrar();
	                        }
	                    }
	                    break;

	                case 2:
	                    for (int i = 0; i < vehiculos.size(); i++) {
	                        if (vehiculos.get(i) instanceof Taxi && polizas.get(i).getTipoCobertura() == Cobertura.parcial) {
	                            vehiculos.get(i).mostrar();
	                        }
	                    }
	                    break;

	                case 3:
	                    for (int i = 0; i < vehiculos.size(); i++) {
	                        if (vehiculos.get(i) instanceof Taxi && polizas.get(i).getTipoCobertura() == Cobertura.terceros) {
	                            vehiculos.get(i).mostrar();
	                        }
	                    }
	                    break;
	            }
	            break;

	        case 3:
	            for (int i = 0; i < vehiculos.size(); i++) {
	                vehiculos.get(i).mostrar();
	            }
	            break;

	        default:
	            System.out.println("No ingresó una opción válida");
	            break;
	    }
	    System.out.println();
	}

	//buscar cliente por doc
	public Cliente buscarClienteDni(int dni) {
		for (int i=0; i<clientes.size();i++) {
			if (clientes.get(i).getDocumento()==dni) {
				return clientes.get(i);
			}
		}
		System.out.println("No se encontro persona.");
		return null;
	}
	public Cliente buscarClienteDni() {
		System.out.println("Ingresar numero de documento");
		int dni = sc.nextInt();
	    for (int i = 0; i < clientes.size(); i++) {
	        if (clientes.get(i).getDocumento() == dni) {
	            Cliente clienteEncontrado = clientes.get(i);
	            clienteEncontrado.mostrar();
	            return clienteEncontrado;
	        }
	    }
	    System.out.println("No se encontró persona.");
	    return null;
	}
	
	
	//buscar vehiculo por matricula
	public Vehiculo buscarVehiculoxpatente(String matricula) {
		for (int i=0; i<vehiculos.size();i++) {
			if (vehiculos.get(i).getMatricula().equals(matricula)) {
				return vehiculos.get(i);
			}
		}
		System.out.println("No se encontro vehiculo.");
		return null;
	}
	public Vehiculo buscarVehiculoxpatente() {
		System.out.println("Ingresar matricula");
		String matricula = sc.next();
		for (int i=0; i<vehiculos.size();i++) {
			if (vehiculos.get(i).getMatricula().equals(matricula)) {
				Vehiculo vehiculoEncontrado = vehiculos.get(i);
				vehiculoEncontrado.mostrar();
				return vehiculoEncontrado;
			}
		}
		System.out.println("No se encontro vehiculo.");
		return null;
	}
	//agregar vehiculo
		public void agregarVehiculo(Vehiculo vehiculo) {
			vehiculos.add(vehiculo);
		}
	//registrar vehiculo
		public void registrarvehiculo() {
		    System.out.println("Que vehiculo quieres registrar: ");
		    System.out.println("1. Taxi ");
		    System.out.println("2. Autobus ");
		    int a = sc.nextInt();
		    switch (a) {
		        case 1:
		            Taxi taxi = new Taxi();
		            agregarVehiculo(taxi);
		            break;

		        case 2:
		            Autobus autobus = new Autobus();
		            agregarVehiculo(autobus);
		            break;

		        default:
		            System.out.println("Opción inválida");
		            break;
		    }
		}
	//agregar cliente
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	//registrar cliente
	public void registrarcliente() {
		Cliente cliente = new Cliente();
		agregarCliente(cliente);
	}
		
	public void registrarPoliza() {
		Cliente cliente = null;
	    Vehiculo vehiculo = null;

	    System.out.println("Ingrese DNI del cliente: ");
	    int dni = sc.nextInt();
	    sc.nextLine();

	    cliente = buscarClienteDni(dni);
	    if (cliente == null) {
	        System.out.println("Cliente no encontrado. Registre al cliente primero.");
	        registrarcliente();
	        cliente = clientes.get(clientes.size() - 1); 
	    }

	    System.out.println("Ingrese matricula del vehículo: ");
	    String matricula = sc.nextLine();

	    vehiculo = buscarVehiculoxpatente(matricula);
	    if (vehiculo == null) {
	        System.out.println("Vehiculo no encontrado. Registre el vehiculo primero.");
	        registrarvehiculo();
	        vehiculo = vehiculos.get(vehiculos.size() - 1); 
	    }

	    System.out.println("Ingrese fecha de inicio: ");
	    String fechaInicio = sc.nextLine();

	    System.out.println("Ingrese fecha de fin: ");
	    String fechaFin = sc.nextLine();

	    System.out.println("Ingrese cantidad de cuotas: ");
	    int cantidadCuotas = sc.nextInt();

	    System.out.println("Ingrese forma de pago (1: Efectivo, 2: Transferencia, 3: Debito): ");
	    int formaPagoOption = sc.nextInt();
	    Poliza.FormaPago formaPago = null;
	    switch (formaPagoOption) {
	        case 1:
	            formaPago = Poliza.FormaPago.efectivo;
	            break;
	        case 2:
	            formaPago = Poliza.FormaPago.trasnferencia;
	            break;
	        case 3:
	            formaPago = Poliza.FormaPago.debito;
	            break;
	        default:
	            System.out.println("Opción de forma de pago invalida");
	            
	            return;
	    }

	    System.out.println("Ingrese monto total asegurado: ");
	    int montoTotalAsegurado = sc.nextInt();

	    System.out.println("Incluye granizo? (1: Si, 2: No): ");
	    int incluyeGranizoOption = sc.nextInt();
	    boolean incluyeGranizo = false;
	    int montoMaximoGranizo = 0;
	    if (incluyeGranizoOption == 1) {
	        incluyeGranizo = true;
	        System.out.println("Ingrese monto maximo de granizo: ");
	        montoMaximoGranizo = sc.nextInt();
	    }

	    System.out.println("Ingrese tipo de cobertura (1: Total, 2: Terceros, 3: Parcial): ");
	    int tipoCoberturaOption = sc.nextInt();
	    Poliza.Cobertura tipoCobertura = null;
	    switch (tipoCoberturaOption) {
	        case 1:
	            tipoCobertura = Poliza.Cobertura.total;
	            break;
	        case 2:
	            tipoCobertura = Poliza.Cobertura.terceros;
	            break;
	        case 3:
	            tipoCobertura = Poliza.Cobertura.parcial;
	            break;
	        default:
	            System.out.println("Opcion de tipo de cobertura invalida");
	            return;
	    }

	    Poliza poliza = new Poliza(fechaInicio, fechaFin, cantidadCuotas, formaPago, montoTotalAsegurado, incluyeGranizo, montoMaximoGranizo, tipoCobertura, cliente, vehiculo);
	    polizas.add(poliza);

	    System.out.println("Poliza registrada!! ");
	    System.out.println("Información de la póliza:");
	    poliza.mostrar();
	}
	//agregar polizas
	public void agregarpolizas(Poliza poliza) {
		polizas.add(poliza);
	}
	//Listar polizas
	public void mostrarpolizas(){
		System.out.println();
		
    	if (polizas.isEmpty()) {
    		System.out.println("No hay polizas registradas.");
    		}else {
    		 for(int i=0; i< this.polizas.size();i++)
    		 {
    			 this.polizas.get(i).mostrar();
    		 }
    	}
	}
	public Poliza buscarpoliza() {
		System.out.println("Ingresar numero de poliza");
		int nro = sc.nextInt();
		for (int i=0; i<polizas.size();i++) {
			if (polizas.get(i).getNumeroPoliza()== nro) {
				Poliza polizaEncontrada = polizas.get(i);
				polizaEncontrada.mostrar();
				return polizaEncontrada;
			}
		}
		System.out.println("No se encontro vehiculo.");
		return null;
	}
	//agregar cuota 
	public void agregarCuota(Cuota cuota) {
        cuotas.add(cuota);
    }
	
	private Poliza buscarPoliza(int numeroPoliza) {
	    for (Poliza poliza : polizas) {
	        if (poliza.getNumeroPoliza() == numeroPoliza) {
	            return poliza;
	        }
	    }
	    return null;
	}
	//recorre nro de poliza y cuota
	public void mostrarPolizasYCoutas() {
	    for (Poliza poliza : polizas) {
	        System.out.println("Numero de poliza: " + poliza.getNumeroPoliza());
	        System.out.println("Cantidad de cuotas:" + poliza.getCuotas());
	        for (Cuota cuota : poliza.getCuotas()) {
	            cuota.mostrar();
	        }
	        System.out.println("----------------------------------------");
	    }
	}
	public void pagarCuotasPoliza() {
		mostrarPolizasYCoutas();
		System.out.println("Ingrese el numero de poliza:");
	    
	    int numeroPoliza = sc.nextInt();

	    Poliza poliza = buscarPoliza(numeroPoliza);
	    if (poliza != null) {
	        if (poliza.getCuotas().isEmpty()) {
	            System.out.println("La poliza no tiene cuotas registradas.");
	        } else {
	            System.out.println("Cuotas pendientes:");
	            for (Cuota cuota : poliza.getCuotas()) {
	                if (!cuota.isPagada()) {
	                    cuota.mostrar();
	                    System.out.println("¿Desea pagar esta cuota? (1: Si, 2: No)");
	                    int opcion = sc.nextInt();
	                    if (opcion == 1) {
	                        cuota.setPagada(true);
	                        System.out.println("Cuota pagada correctamente.");
	                    }
	                }
	            }
	        }
	    } else {
	        System.out.println("No se encontro la póliza.");
	    }
	}

// Estadisticas 
	 public void mostrarEstadisticas() {
	        System.out.println("Estadisticas de la aseguradora " + nombre);
	        System.out.println("----------------------------");
	        System.out.println("Cantidad de clientes: " + clientes.size());
	        System.out.println("Cantidad de vehiculos: " + vehiculos.size());
	        System.out.println("Cantidad de polizas: " + polizas.size());
	        System.out.println();

	        mostrarEstadisticasPorTipoCobertura();
	        mostrarEstadisticasPorTipoVehiculo();
	        
	    }

	    private void mostrarEstadisticasPorTipoCobertura() {
	        System.out.println("Estadisticas por tipo de cobertura");
	        System.out.println("---------------------------------");
	        int totalTotal = 0;
	        int totalTerceros = 0;
	        int totalParcial = 0;

	        for (Poliza poliza : polizas) {
	            switch (poliza.getTipoCobertura()) {
	                case total:
	                    totalTotal++;
	                    break;
	                case terceros:
	                    totalTerceros++;
	                    break;
	                case parcial:
	                    totalParcial++;
	                    break;
	            }
	        }

	        System.out.println("Total: " + totalTotal);
	        System.out.println("Terceros: " + totalTerceros);
	        System.out.println("Parcial: " + totalParcial);
	        System.out.println();
	    }

	    private void mostrarEstadisticasPorTipoVehiculo() {
	        System.out.println("Estadisticas por tipo de vehiculo");
	        System.out.println("---------------------------------");
	        int totalAutobus = 0;
	        int totalTaxi = 0;

	        for (Vehiculo vehiculo : vehiculos) {
	            if (vehiculo instanceof Autobus) {
	                totalAutobus++;
	            } else if (vehiculo instanceof Taxi) {
	                totalTaxi++;
	            }
	        }

	        System.out.println("Autobus: " + totalAutobus);
	        System.out.println("Taxi: " + totalTaxi);
	        System.out.println();
	    }
	}
	









