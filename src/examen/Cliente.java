package examen;
import java.util.*;
public class Cliente {
	Scanner sc = new Scanner (System.in);
	private String nombre;
    private String apellido;
    private String genero;
    private int documento;
    private String email;
    private String domicilio;
    private int telefono;
	
    
    
    
    
    
    public Cliente() {
		super();
		System.out.println("Ingresar nombre");
		this.nombre = sc.next();
		System.out.println("Ingresar apellido");
		this.apellido = sc.next();
		System.out.println("Ingresar genero");
		this.genero = sc.next();
		System.out.println("Ingresar documento");
		this.documento = sc.nextInt();
		System.out.println("Ingresar email");
		this.email = sc.next();
		System.out.println("Ingresar domicilio");
		this.domicilio = sc.next();
		System.out.println("Ingresar telefono");
		this.telefono = sc.nextInt();
	}





	public Cliente(String nombre, String apellido, String genero, int documento, String email, String domicilio,
			int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.documento = documento;
		this.email = email;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}
    
    
    
    
    
    public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getApellido() {
		return apellido;
	}





	public void setApellido(String apellido) {
		this.apellido = apellido;
	}





	public String getGenero() {
		return genero;
	}





	public void setGenero(String genero) {
		this.genero = genero;
	}





	public int getDocumento() {
		return documento;
	}





	public void setDocumento(int documento) {
		this.documento = documento;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getDomicilio() {
		return domicilio;
	}





	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}





	public int getTelefono() {
		return telefono;
	}





	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}





	public void mostrar() {
    	System.out.println("nombre: " + this.nombre + "/Apellido: " +this.apellido + "/documento: " + this.documento);
     
    }
    
}
