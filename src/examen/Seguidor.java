package examen;


public class Seguidor {
	private String nombre;
	private String nick;
	
	public Seguidor(String nombre, String nick) {
		this.nombre = nombre;
		this.nick = nick;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return this.nombre + ": " + this.nick;
	}

}
