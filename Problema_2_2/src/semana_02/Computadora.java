package semana_02;

public class Computadora {

	// Atributos Privados
	private int codigo;
	private String marca, color;
	private double precioDolar;
	
	// Constuctor
	public Computadora(int cod, String mar, String col,	double pre) {
		codigo = cod;
		marca = mar;
		color = col;
		precioDolar = pre;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

	public double getPrecioDolar() {
		return precioDolar;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrecioDolar(double precioDolar) {
		this.precioDolar = precioDolar;
	}
	
	//======================================================================================
	
	public double retornarPrecioSoles(){
		return precioDolar * 3.65;
	}
	
	public double retornarPrecioEuros(){
		return precioDolar / 1.2;
	}
}
