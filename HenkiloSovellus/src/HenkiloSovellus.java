import java.util.Scanner;

public class HenkiloSovellus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Henkilo henk = new Henkilo();
		
		
		while(true) {
			
			System.out.println("1. Anna henkilö");
			System.out.println("2. Näytä henkilön tiedot");
			System.out.println("3. Muuta henkilön tietoja");
			System.out.println("0. Lopetus");
			System.out.println("Anna valintasi (0-3): ");
			String inp = input.nextLine();
			
			if(inp.equals("1")) {
				System.out.print("Anna nimi: ");
				String nimi = input.nextLine();
				
				System.out.print("Anna osoite: ");
				String osoite = input.nextLine();
				
				
				henk.set(nimi, osoite);
				
			} else if(inp.equals("2")) {
				
				
				if(henk.isHenk()) {
					System.out.println(henk.get());	
				} else {
					System.out.println("Henkilöä ei ole");
				}
				
			} else if(inp.equals("3")) {
				
				if(henk.isHenk()) {
					System.out.print("Anna nimi: ");
					String nimi = input.nextLine();
					
					System.out.print("Anna osoite: ");
					String osoite = input.nextLine();
					
					
					henk.set(nimi, osoite);	
				} else {
					System.out.println("Henkilöä ei ole");
				}
				

				
			} else if(inp.equals("0")) {
				break;
			}
			
			
			
			
			
		}

	}

}



class Henkilo {
	private String nimi;
	private String osoite;
	private boolean henkon = false;
	
	public Henkilo() {
		
	}
	
	public void set(String nimi, String osoite) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.henkon = true;
	}
	
	public String get() {
		return "nimi="+this.nimi+", osoite="+this.osoite;
	}
	
	public boolean isHenk() {
		return this.henkon;
	}
	
	public String toString() {
		String teksti = "Nimi: "+this.nimi+"\n"+"Osoite: "+this.osoite;
		return teksti;
		
	}
}

