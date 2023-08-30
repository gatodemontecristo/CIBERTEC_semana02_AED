package semana_02;

public class Obrero {
	private int codigo, hor_trabajadas;
	private String nombre;
	private double tarifa;
	public Obrero(int cod, int hor_tra, String nom, double tar) {
		codigo = cod;
		hor_trabajadas = hor_tra;
		nombre = nom;
		tarifa = tar;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getHor_trabajadas() {
		return hor_trabajadas;
	}
	public void setHor_trabajadas(int hor_trabajadas) {
		this.hor_trabajadas = hor_trabajadas;
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
		return hor_trabajadas*tarifa;
	}
	public double descuentoAFP() {
		return 0.1*sueldoBruto();
	}
	public double descuentoEPS() {
		return 0.05*sueldoBruto();
	}
	public double sueldoNeto() {
		return sueldoBruto()-descuentoAFP()-descuentoEPS();
	}
}
