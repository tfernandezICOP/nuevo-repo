package examen;

public class Taxi extends Vehiculo {
	private int nrolicencia;

	
	
	
	public Taxi() {
		super();
		System.out.println("Ingresar numero de licencia");
		this.nrolicencia= sc.nextInt();
	}




	




	public Taxi(String marca, String matricula, int modelo, int nro_motor, int chasis, int potenciaCV,
			int nrolicencia) {
		super(marca, matricula, modelo, nro_motor, chasis, potenciaCV);
		this.nrolicencia = nrolicencia;
	}









	public int getNrolicencia() {
		return nrolicencia;
	}




	public void setNrolicencia(int nrolicencia) {
		this.nrolicencia = nrolicencia;
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("numero de licencia: "+ this.nrolicencia+ " ");
		System.out.println("------------------------");
	}
	
}
