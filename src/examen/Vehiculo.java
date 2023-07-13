package examen;
import java.util.*;
public class Vehiculo {
	Scanner sc = new Scanner(System.in);
	private String marca;
	private String matricula;
	private int modelo;
	private int nro_motor;
	private int chasis;
	private int potenciaCV;
	
	
	
	
	
	
	public Vehiculo() {
		super();
		System.out.println("Ingresar marca del vehiculo");
		this.marca=sc.next();
		System.out.println("Ingresar matricula del vehiculo");
		this.matricula=sc.next();
		System.out.println("Ingresar modelo del vehiculo");
		this.modelo=sc.nextInt();
		System.out.println("Ingresar numero de motor del vehiculo");
		this.nro_motor=sc.nextInt();
		System.out.println("Ingresar chasis del vehiculo");
		this.chasis=sc.nextInt();
		System.out.println("Ingresar potencia del vehiculo");
		this.potenciaCV= sc.nextInt();
		
	}







	
	
	




	public Vehiculo(String marca, String matricula, int modelo, int nro_motor, int chasis, int potenciaCV) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
		this.nro_motor = nro_motor;
		this.chasis = chasis;
		this.potenciaCV = potenciaCV;
	}














	public String getMarca() {
		return marca;
	}






	public void setMarca(String marca) {
		this.marca = marca;
	}






	public String getMatricula() {
		return matricula;
	}






	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}






	public int getModelo() {
		return modelo;
	}






	public void setModelo(int modelo) {
		this.modelo = modelo;
	}






	public int getPotenciaCV() {
		return potenciaCV;
	}






	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}






	public int getNro_motor() {
		return nro_motor;
	}














	public void setNro_motor(int nro_motor) {
		this.nro_motor = nro_motor;
	}














	public int getChasis() {
		return chasis;
	}














	public void setChasis(int chasis) {
		this.chasis = chasis;
	}














	public void mostrar() {
		System.out.println("Marca: " + this.marca+ " matricula: " + this.matricula + " modelo: "+this.modelo+" numero de motor: "+this.nro_motor );
	}
	
}
