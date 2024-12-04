
public class Persona {
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private int edad;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
			this.edad = edad;
	}
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
		
}
