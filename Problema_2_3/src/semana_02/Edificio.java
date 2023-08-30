package semana_02;

public class Edificio {

	// Atributos Privados
	private int codigo, ndepa, cantpiso;
	private double precioDolar;

	public Edificio(int cod, int ndep, int cntpiso, double preDolar) {
		codigo = cod;
		ndepa = ndep;
		cantpiso = cntpiso;
		precioDolar = preDolar;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getNdepa() {
		return ndepa;
	}

	public int getCantpiso() {
		return cantpiso;
	}

	public double getPrecioDolar() {
		return precioDolar;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNdepa(int ndepa) {
		this.ndepa = ndepa;
	}

	public void setCantpiso(int cantpiso) {
		this.cantpiso = cantpiso;
	}

	public void setPrecioDolar(double precioDolar) {
		this.precioDolar = precioDolar;
	}

	public double calcularPrecioEdificio() {
		return ndepa * precioDolar;
	}
}
