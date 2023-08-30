package semana_02;

public class Paciente {
	private String nombre,apellido;
	private int edad;
	private double talla;
	private double peso;
	
	public Paciente(String nom, String ape, int ed, double tal, double pes) {
		nombre = nom;
		apellido = ape;
		edad = ed;
		talla = tal;
		peso = pes;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String tipoEdad() {
		if(edad>=18) {
			return "mayor de edad";
		}else {
			return "menor de edad";
		}
	}
	
}
