package examen.principal;

import examen.Crawler;
import examen.Seguidor;
import examen.crawlers.FacebookCrawler;
import examen.crawlers.TwitterCrawler;
import examen.utils.Contenido;

public class Examen {

	public static void main(String[] args) {
		Crawler[] crawlers = new Crawler[4];
		Contenido[] posts = new Contenido[2];
		
		posts[0] = new Contenido("Este es el Primer post", 8);
		posts[1] = new Contenido("Este es el Segundo post", 14);
		crawlers[0] = new FacebookCrawler("http:facebook/1", posts, 9);
		
		posts[0] = new Contenido("Primero del segundo", 7);
		posts[1] = new Contenido("Segundo del segundo", 11);
		crawlers[1] = new FacebookCrawler("http:facebook/2", posts, 6);
		
		Contenido[] tweets = new Contenido[2];
		tweets[0] = new Contenido("Este es el Primer tweet", 8);
		tweets[1] = new Contenido("Este es el Segundo tweet", 14);
		
		crawlers[2] = new TwitterCrawler("http:twitter/1", tweets, new Seguidor("Jose", "jgaviria"));
		
		tweets = new Contenido[3];
		tweets[0] = new Contenido("tweets 1", 9);
		tweets[1] = new Contenido("tweets 2", 1);
		tweets[2] = new Contenido("tweets 3", 11);
		
		crawlers[3] = new TwitterCrawler("http:twitter/2", tweets, new Seguidor("Borja", "borja.sanz"));
		
		MostrarUrls(crawlers);
		MostrarContenidoRedSocial(crawlers);
		MostrarSeguidor(crawlers);
	}
	
	public static void MostrarContenidoRedSocial(Crawler[] crawlers) {
		for (Crawler crawler : crawlers) {
			crawler.mostrarInformacion();
		}
	}
	
	public static void MostrarSeguidor(Crawler[] crawlers) {
		for (Crawler crawler : crawlers) {
			if (crawler.redConSeguidores()) {
				((TwitterCrawler) crawler).mostrarSeguidor();
			}
		}
	}
	public static void MostrarUrls(Crawler[] crawlers) {
		for (Crawler crawler : crawlers) {
			System.out.println("La URL del la red social es: " + crawler.getUrl());
		}
	}
}
