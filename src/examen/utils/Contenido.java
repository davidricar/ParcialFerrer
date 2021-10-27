package examen.utils;

public class Contenido {
	private String texto;
	private int numeroMegusta;
	
	public Contenido(String texto) {
		this.texto = texto;
		this.numeroMegusta = 0;
	}
	
	public Contenido(String texto, int numeroMegusta) {
		this.texto = texto;
		this.numeroMegusta = numeroMegusta;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getNumeroMegusta() {
		return numeroMegusta;
	}

	public void setNumeroMegusta(int numeroMegusta) {
		this.numeroMegusta = numeroMegusta;
	}
	
	

}
