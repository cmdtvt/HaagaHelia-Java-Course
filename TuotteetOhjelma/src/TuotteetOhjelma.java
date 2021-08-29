import java.util.Scanner;

public class TuotteetOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Syötä kirjatuotteen tiedot!");
		System.out.print("Anna tuotekoodi: ");
		String tuotekoodi = input.nextLine();
		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();
		System.out.print("Anna hinta: ");
		Double hinta = input.nextDouble();
		System.out.print("Anna sivumäärä: ");
		int sivut = input.nextInt();
		System.out.print("Anna sidosasu: ");
		input = new Scanner(System.in);
		String sidosasu = input.nextLine();
		
		KirjaTuote kirja = new KirjaTuote();
		kirja.setTuotekoodi(tuotekoodi);
		kirja.setNimi(nimi);
		kirja.setHinta(hinta);
		kirja.setSivumaara(sivut);
		kirja.setSidosasu(sidosasu);
		
		
		
		
		DVDTuote dvd = new DVDTuote();
		System.out.println("Syötä dvdtuotteen tiedot!");
		System.out.print("Anna tuotekoodi: ");
		tuotekoodi = input.nextLine();
		System.out.print("Anna nimi: ");
		nimi = input.nextLine();
		System.out.print("Anna hinta: ");
		hinta = input.nextDouble();
		System.out.print("Anna kesto(min): ");
		int kesto = input.nextInt();
		input = new Scanner(System.in);
		System.out.print("Anna ikäsuositus: ");
		String ikas = input.nextLine();
		
		dvd.setTuotekoodi(tuotekoodi);
		dvd.setNimi(nimi);
		dvd.setHinta(hinta);
		dvd.setKesto(kesto);
		dvd.setIkasuositus(ikas);
		
		
		System.out.println(kirja.toString());
		System.out.println(dvd.toString());
		
	}

}


class Tuote {
	
	private String nimi;
	private double hinta;
	private String tuotekoodi;
	
	public String getTuotekoodi() {
		return tuotekoodi;
	}
	public void setTuotekoodi(String tuotekoodi) {
		this.tuotekoodi = tuotekoodi;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public double getHinta() {
		return hinta;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	
	
}

class KirjaTuote extends Tuote {
	int sivumaara;
	String sidosasu;
	
	public int getSivumaara() {
		return sivumaara;
	}
	public void setSivumaara(int sivumaara) {
		this.sivumaara = sivumaara;
	}
	public String getSidosasu() {
		return sidosasu;
	}
	public void setSidosasu(String sidosasu) {
		this.sidosasu = sidosasu;
	}
	
	
	public String toString() {
		String teksti = "\nKIRJATUOTTEEN TIEDOT:\n Tuotekoodi: "+this.getTuotekoodi()+"\n"+"Nimi: "+this.getNimi()+"\n Hinta: "+this.getHinta()+"\n Sivumäärä: "+this.getSivumaara()+"\n Sidosasu: "+this.getSidosasu();
		return teksti;
	}
	
}

class DVDTuote extends Tuote {
	private int kesto;
	private String ikasuositus;
	
	public int getKesto() {
		return kesto;
	}
	public void setKesto(int kesto) {
		this.kesto = kesto;
	}
	public String getIkasuositus() {
		return ikasuositus;
	}
	public void setIkasuositus(String ikasuositus) {
		this.ikasuositus = ikasuositus;
	}
	
	public String toString() {
		String teksti = "\nDVDTUOTTEEN TIEDOT:\n Tuotekoodi: "+this.getTuotekoodi()+"\n"+"Nimi: "+this.getNimi()+"\n Hinta: "+this.getHinta()+"\n Kesto(min): "+this.getKesto()+"\n Ikäsuositus: "+this.getIkasuositus();
		return teksti;
	}
	
}
