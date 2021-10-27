package examen.crawlers;

import java.io.File;
import java.util.ArrayList;

import examen.Crawler;
import examen.utils.Contenido;
import examen.utils.Datos;

public class FacebookCrawler extends Crawler {
	
	private Contenido[] posts;
	private int numeroAmigos;

	public FacebookCrawler(String url, Contenido[] posts, int numeroAmigos) {
		super(url);
		this.posts = posts;
		this.numeroAmigos = numeroAmigos;
	}
	
	public void ModificarContenidoPost() {
		for (Contenido contenido : posts) {
			contenido.setTexto(((contenido.getTexto()).toUpperCase()).replace(" ", "_"));
		}
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("La red social es: " + super.getUrl());
		for (Contenido post : posts) {
			System.out.println("      El texto del post es: " + post.getTexto() + " y el número de Me Gusta: " + post.getNumeroMegusta());
		}
	}

	@Override
	public boolean redConSeguidores() {
		return false;
	}

}
