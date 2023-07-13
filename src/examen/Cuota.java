package examen;

public class Cuota {
	private int numeroCuota;
    private int montoTotalCuota;
    private boolean pagada;
    private String fechaVencimiento;
    private FormaPago formaPago;
    private Poliza poliza;


	public Cuota(int numeroCuota, int montoTotalCuota, boolean pagada, String fechaVencimiento, FormaPago formaPago,
			Poliza poliza) {
		super();
		this.numeroCuota = numeroCuota;
		this.montoTotalCuota = montoTotalCuota;
		this.pagada = pagada;
		this.fechaVencimiento = fechaVencimiento;
		this.formaPago = formaPago;
		this.poliza = poliza;
	}

	public Cuota() {
		super();
	}

	public int getNumeroCuota() {
		return numeroCuota;
	}

	public void setNumeroCuota(int numeroCuota) {
		this.numeroCuota = numeroCuota;
	}

	public int getMontoTotalCuota() {
		return montoTotalCuota;
	}

	public void setMontoTotalCuota(int montoTotalCuota) {
		this.montoTotalCuota = montoTotalCuota;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	
	
	public FormaPago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}



	public Poliza getPoliza() {
		return poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}



	public enum FormaPago{
		efectivo,
		trasnferencia,
		debito
	}

    
    public void mostrar() {
    	System.out.println("numero de cuotas  " + this.numeroCuota + "monto total: " +this.montoTotalCuota + "pagada :" +this.pagada
    			+ "fecha de vencimiento: " + this.fechaVencimiento + "forma de pago "+ this.formaPago);
    }
    
    
}
