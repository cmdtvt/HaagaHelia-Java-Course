import java.util.ArrayList;
import java.util.Scanner;

public class PelaajalistaSovellus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		ArrayList<Pelaaja2> esineet = new ArrayList<Pelaaja2>();
		
		while(true) {
			
			
			
			System.out.println("1. Lis‰‰ pelaaja");
			System.out.println("2. Hae pelaaja");
			System.out.println("3. N‰yt‰ pelaajat");
			System.out.println("0. Lopetus");
			System.out.println("Anna valintasi (0-3): ");
			String inp = input.nextLine();
			
			if(inp.equals("1")) {
				System.out.println("Anna pelinumero: ");
				String pelinro = input.nextLine();
				System.out.println("Anna nimi: ");
				String nimi = input.nextLine();
				System.out.println("Anna pelipaikka: ");
				String pelipaikka = input.nextLine();
				
				Pelaaja2 temp = new Pelaaja2(nimi,pelinro,pelipaikka);
				esineet.add(temp);
				
			} else if(inp.equals("2")) {
				System.out.println("Anna pelinumero: ");
				String pelinro = input.nextLine();
				Boolean found = false;
				
				for(Pelaaja2 i : esineet) {
					if(i.getPelinumero().equals(pelinro)) {
						found = true;
						i.print();
					}
				}
				
				if(found == false) {
					System.out.println("Pelaaja ei ole pelinumerolla "+pelinro);
				}
				
			} else if(inp.equals("3")) {
				for(Pelaaja2 i : esineet) {
					i.print();
				}
				
			} else if(inp.equals("0")) {
				break;
			}
			
			
			
			
			
			
		}

	}

}

class Pelaaja2 {
	private String nimi;
	private String pelinumero;
	private String pelipaikka;
	
	public Pelaaja2(String nimi,String pelinr,String pelipaik) {
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
	
	public String getPelinumero() {
		return this.pelinumero;
	}
	
	public void print() {
		System.out.println("Pelinumero: "+this.pelinumero);
		System.out.println("Nimi: "+this.nimi);
		System.out.println("Pelipaikka: "+this.pelipaikka);
		System.out.println();
	}
	
	
	
}

