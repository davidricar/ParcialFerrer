package examen.crawlers;

import examen.Crawler;
import examen.Seguidor;
import examen.interfaces.ICrawlerSeguidor;
import examen.utils.Contenido;

public class TwitterCrawler extends Crawler implements ICrawlerSeguidor {
	private Contenido[] tweets;
	private Seguidor seguidor;

	public TwitterCrawler(String url, Contenido[] tweets, Seguidor seguidor) {
		super(url);
		this.tweets = tweets;
		this.seguidor = seguidor;
	}

	@Override
	public  void mostrarInformacion() {
		System.out.println("La red social es: " + super.getUrl() + " y tiene el seguidor: " + this.seguidor.getNombre());
		for (Contenido tweet : tweets) {
			System.out.println("      El texto del tweet es: " + tweet.getTexto() + " y el número de Me Gusta: " + tweet.getNumeroMegusta());
		}
	}
	
	@Override
	public boolean redConSeguidores() {
		return true;
	}

	@Override
	public void mostrarSeguidor() {
		System.out.println(this.seguidor.toString());
		
	}

}
