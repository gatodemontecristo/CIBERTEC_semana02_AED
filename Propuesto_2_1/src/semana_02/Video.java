package semana_02;

public class Video {
	private int codigo;
	private String video;
	private double duracion,pre_soles,tipo_cambio;
	
	public Video(int cod, String vid, double dura, double pre, double cambio) {
		codigo = cod;
		video = vid;
		duracion = dura;
		pre_soles = pre;
		tipo_cambio = cambio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public double getPre_soles() {
		return pre_soles;
	}

	public void setPre_soles(double pre_soles) {
		this.pre_soles = pre_soles;
	}

	public double getTipo_cambio() {
		return tipo_cambio;
	}

	public void setTipo_cambio(double tipo_cambio) {
		this.tipo_cambio = tipo_cambio;
	}
	
	public double precioDolares() {
		return pre_soles/tipo_cambio;
	}
	
}
