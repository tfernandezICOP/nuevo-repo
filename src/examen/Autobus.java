package examen;

public class Autobus extends Vehiculo {
	private int nrodepiezas;

	
	
	public Autobus() {
		super();
		System.out.println("Ingresar numero de piezas");
		this.nrodepiezas= sc.nextInt();
		
	}



	
	
	public Autobus(String marca, String matricula, int modelo, int nro_motor, int chasis, int potenciaCV,
			int nrodepiezas) {
		super(marca, matricula, modelo, nro_motor, chasis, potenciaCV);
		this.nrodepiezas = nrodepiezas;
	}





	public void mostrar() {
		super.mostrar();
		System.out.println("Numero de piezas: " + this.nrodepiezas+" " );
		System.out.println("----------------------");
		
	}
	
}
