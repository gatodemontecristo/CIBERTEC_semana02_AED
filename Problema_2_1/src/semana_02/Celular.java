package semana_02;

public class Celular {

	// Atributos Privados
	private int numero, segundos;
	private String usuario;
	private double precio;
	
	// Constructor
	public Celular(int num, String usu, int seg, double pre) {
		numero = num;
		segundos = seg;
		usuario = usu;
		precio = pre;
	}

	// Set y Get
	public int getNumero() {
		return numero;
	}

	public int getSegundos() {
		return segundos;
	}

	public String getUsuario() {
		return usuario;
	}

	public double getPrecio() {
		return precio;
	}

	public void setNumero(int num) {
		numero = num;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//==================================================================================
	
	public double calcularCostoconsumo(){
		return segundos * precio;
	}
	
	public double calcularCostoIGV(){
		return calcularCostoconsumo() * 0.18;
	}
	
	public double calcularTotalPagar(){
		return calcularCostoconsumo() - calcularCostoIGV();
	}
} // llave final
