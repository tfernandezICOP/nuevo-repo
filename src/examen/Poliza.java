package examen;
import java.util.*;
public class Poliza {
	Scanner sc = new Scanner (System.in);
	private static int numeroPolizaActual = 1000;
	private int numeroPoliza;
    private String fechaInicio;
    private String fechaFin;
    private int cantidadCuotas;
    private FormaPago formaPago;
    private int montoTotalAsegurado;
    private boolean incluyeGranizo = false;
    private int montoMaximoGranizo;
    private Cobertura tipoCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private List<Cuota> cuotas;
    
    
    
    
    
    
    public Poliza() {
		super();
		this.numeroPoliza= numeroPolizaActual++;
		this.cliente=cliente;
		this.vehiculo= vehiculo;
				
		System.out.println("fecha de inicio");
		this.fechaInicio=sc.next();
		System.out.println("fecha de fin");
		this.fechaFin=sc.next();
		System.out.println("Cantidad de cuotas");
		this.cantidadCuotas=sc.nextInt();
		System.out.println("forma de pago");
		System.out.println("1.Efectivo");
		System.out.println("2.Transferencia");
		System.out.println("3.Debito");
		int a = sc.nextInt();
		switch (a) {
		case 1:
			this.formaPago=FormaPago.efectivo;
			break;

		case 2:
			this.formaPago=FormaPago.trasnferencia;
			break;
		case 3:
			this.formaPago=FormaPago.debito;
		}
		System.out.println("Monto total :");
		this.montoTotalAsegurado= sc.nextInt();
		System.out.println("Incluye granizo?");
		System.out.println("1.si");
		System.out.println("2.no");
		int b = sc.nextInt();
		if(b == 1) {
			this.incluyeGranizo= true;
			System.out.println("Monto maximo de granizo");
			this.montoMaximoGranizo = sc.nextInt();
		}else {
			this.incluyeGranizo= false;
			this.montoMaximoGranizo= 0;
		}
		
		System.out.println("Tipo de cobertura");
		System.out.println("1.total");
		System.out.println("2.terceros");
		System.out.println("3.parcial");
		int j= sc.nextInt();
		switch (j) {
		case 1:
			this.tipoCobertura= Cobertura.total;
			break;

		case 2:
			this.tipoCobertura= Cobertura.terceros;
			break;
		case 3:
			this.tipoCobertura= Cobertura.parcial;
		}
		System.out.println("fecha de inicio");
		System.out.println("fecha de inicio");
		
	}
















	public Poliza( String fechaInicio, String fechaFin, int cantidadCuotas, FormaPago formaPago,
			int montoTotalAsegurado, boolean incluyeGranizo, int montoMaximoGranizo, Cobertura tipoCobertura,
			Cliente cliente, Vehiculo vehiculo) {
		super();
		this.numeroPoliza= numeroPolizaActual++;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cantidadCuotas = cantidadCuotas;
		this.formaPago = formaPago;
		this.montoTotalAsegurado = montoTotalAsegurado;
		this.incluyeGranizo = incluyeGranizo;
		this.montoMaximoGranizo = montoMaximoGranizo;
		this.tipoCobertura = tipoCobertura;
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		cuotas = new ArrayList<>();
		
	}




	public int getNumeroPoliza() {
		return numeroPoliza;
	}








	public void setNumeroPoliza(int numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}








	public String getFechaInicio() {
		return fechaInicio;
	}








	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}








	public String getFechaFin() {
		return fechaFin;
	}








	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}








	public int getCantidadCuotas() {
		return cantidadCuotas;
	}








	public void setCantidadCuotas(int cantidadCuotas) {
		this.cantidadCuotas = cantidadCuotas;
	}








	public FormaPago getFormaPago() {
		return formaPago;
	}








	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}








	public int getMontoTotalAsegurado() {
		return montoTotalAsegurado;
	}








	public void setMontoTotalAsegurado(int montoTotalAsegurado) {
		this.montoTotalAsegurado = montoTotalAsegurado;
	}








	public boolean isIncluyeGranizo() {
		return incluyeGranizo;
	}








	public void setIncluyeGranizo(boolean incluyeGranizo) {
		this.incluyeGranizo = incluyeGranizo;
	}








	public int getMontoMaximoGranizo() {
		return montoMaximoGranizo;
	}








	public void setMontoMaximoGranizo(int montoMaximoGranizo) {
		this.montoMaximoGranizo = montoMaximoGranizo;
	}








	public Cobertura getTipoCobertura() {
		return tipoCobertura;
	}








	public void setTipoCobertura(Cobertura tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}








	public Cliente getCliente() {
		return cliente;
	}








	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}








	public Vehiculo getVehiculo() {
		return vehiculo;
	}








	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}



















	public List<Cuota> getCuotas() {
		return cuotas;
	}
















	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}



















	public enum FormaPago {
		efectivo,
		trasnferencia,
		debito
	}


	public enum Cobertura{
    	total,
    	terceros,
    	parcial
    }
	public void mostrar() {
		System.out.println("numero de poliza: " + this.numeroPoliza + " cuotas: "+ this.cantidadCuotas+ " fecha inicio: " + this.fechaInicio + " fecha fin: "+ this.fechaFin + " forma de pago: "+ this.formaPago+
			" incluye granizo: " + this.incluyeGranizo	+ " monto maximo: " + this.montoMaximoGranizo+ " monto total asegurado: "+ this.montoTotalAsegurado + " tipo de cobertura: "+this.tipoCobertura 
			+ " Numero de documento del cliente: " + cliente.getDocumento() + " Matricula del vehiculo: " + vehiculo.getMatricula());
	
	}

	




	
}
