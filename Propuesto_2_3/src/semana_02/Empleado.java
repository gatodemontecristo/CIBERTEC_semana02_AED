package semana_02;

public class Empleado {
	private int codigo, num_celular;
	private String nombre;
	private double sueldo_soles;
	
	public Empleado(int cod, int num, String nom, double soles) {
		codigo = cod;
		num_celular = num;
		nombre = nom;
		sueldo_soles = soles;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNum_celular() {
		return num_celular;
	}

	public void setNum_celular(int num_celular) {
		this.num_celular = num_celular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo_soles() {
		return sueldo_soles;
	}

	public void setSueldo_soles(double sueldo_soles) {
		this.sueldo_soles = sueldo_soles;
	}
	public String tipoSueldo() {
		if(sueldo_soles<3500) {
			return "mayor a 3500";
		}else if(sueldo_soles==3500) {
			return "igual a 3500";
		}else {
			return "menor a 3500";
		}
	}
	
}
