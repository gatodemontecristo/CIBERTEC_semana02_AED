package semana_02;

public class Pelota {
	private String marca;
	private double peso_gramos,	presion_lbra,diam_cm,precio;
	public Pelota(String mar, double peso, double pres, double diam, double pre) {
		marca = mar;
		peso_gramos = peso;
		presion_lbra = pres;
		diam_cm = diam;
		precio = pre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPeso_gramos() {
		return peso_gramos;
	}
	public void setPeso_gramos(double peso_gramos) {
		this.peso_gramos = peso_gramos;
	}
	public double getPresion_lbra() {
		return presion_lbra;
	}
	public void setPresion_lbra(double presion_lbra) {
		this.presion_lbra = presion_lbra;
	}
	public double getDiam_cm() {
		return diam_cm;
	}
	public void setDiam_cm(double diam_cm) {
		this.diam_cm = diam_cm;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public double radio() {
		return diam_cm/2;
	}
	public double volumenBalon() {
		return 4*3.1416*radio()*radio()*radio()/3;
	}
	public double descuento() {
		return precio*.9;
	}
	public double importePagar() {
		return precio - descuento();
	}
}
