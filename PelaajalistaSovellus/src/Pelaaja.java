
public class Pelaaja {
	private String nimi;
	private String pelinumero;
	private String pelipaikka;
	
	public Pelaaja(String nimi,String pelinr,String pelipaik) {
		this.nimi = nimi;
		this.pelinumero = pelinr;
		this.pelipaikka = pelipaik;
	}
	
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public void setPelinumero(String pelinumero) {
		this.pelinumero = pelinumero;
	}
	
	public void setPelipaikka(String pelipaikka) {
		this.pelipaikka = pelipaikka;
	}
	
	
	
}
