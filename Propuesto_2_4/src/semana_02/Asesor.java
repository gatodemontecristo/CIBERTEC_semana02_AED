package semana_02;

public class Asesor {
	private int codigo,hor_trabajo;
	private String nombre;
	private double tarifa;
	
	public Asesor(int cod, int hor, String nom, double tar) {
		codigo = cod;
		hor_trabajo = hor;
		nombre = nom;
		tarifa = tar;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getHor_trabajo() {
		return hor_trabajo;
	}

	public void setHor_trabajo(int hor_trabajo) {
		this.hor_trabajo = hor_trabajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public double sueldoBruto() {
		return hor_trabajo*tarifa;
	}
	public double descuento() {
		return sueldoBruto()*0.15;
	}
	public double sueldoNeto() {
		return sueldoBruto() - descuento();
	}
	
}

