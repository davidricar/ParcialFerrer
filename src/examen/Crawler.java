package examen;

public abstract class Crawler {
	private String url;
	public Crawler() {
		this.url = null;
	}
	public Crawler(String url) {
		this.url = url;
	}
	public abstract void mostrarInformacion();
	public abstract boolean redConSeguidores();
	public String getUrl() {
		return url;
	}
	
}
