import java.util.Scanner;

public class TyontekijaOhjelma {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		
		
		System.out.println("Syötä työntekijan tiedot!");
		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();
		System.out.print("Anna osoite: ");
		String osoite = input.nextLine();
		System.out.print("Anna tuntipalkka: ");
		Double tpalkka = input.nextDouble();
		
		Tyontekija henk = new Tyontekija(tpalkka);
		henk.setNimi(nimi);
		henk.setOsoite(osoite);
		
		System.out.println(henk.toString());
		
		
	}

}

class Henkilo {
	private String nimi;
	private String osoite;
	
	public Henkilo() {
		
	}
	
	public void set(String nimi, String osoite) {
		this.nimi = nimi;
		this.osoite = osoite;
	}
	
	public String get() {
		return "nimi="+this.nimi+", osoite="+this.osoite;
	}
	
	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

}

class Tyontekija extends Henkilo {
	
	private double tuntipalkka;
	
	public Tyontekija(double tuntipalkka) {
		this.tuntipalkka = tuntipalkka;
	}
	
	public double getTuntipalkka() {
		return tuntipalkka;
	}

	public void setTuntipalkka(double tuntipalkka) {
		this.tuntipalkka = tuntipalkka;
	}

	public String toString() {
		String teksti = "TYÖNTEKIJÄTIEDOT\n Nimi: "+this.getNimi()+"\n"+"Osoite: "+this.getOsoite()+"\n Tuntipalkka: "+this.tuntipalkka;
		return teksti;
	}
}