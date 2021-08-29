import java.util.Scanner;

public class HenkiloOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();
		
		System.out.print("Anna osoite: ");
		String osoite = input.nextLine();
		
		
		Henkilo henk = new Henkilo();
		henk.set(nimi,osoite);
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
	
	public String toString() {
		String teksti = "Nimi: "+this.nimi+"\n"+"Osoite: "+this.osoite;
		return teksti;
		
	}
}

