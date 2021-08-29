import java.text.DecimalFormat;
import java.util.Scanner;

public class KokoOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna pituus metreinä: ");
		double pituus = input.nextDouble();
		
		System.out.print("Anna paino kiloina: ");
		int paino = input.nextInt();
		
		
		Koko henk = new Koko();
		henk.set(pituus,paino);
		System.out.println(henk.toString());

	}

}



class Koko {
	private Double pituus;
	private Integer paino;
	
	public Koko() {
		
	}
	
	public void set(Double pituus, Integer paino) {
		this.pituus = pituus;
		this.paino = paino;
	}
	
	public String get() {
		return "nimi="+this.pituus+", osoite="+this.paino;
	}
	
	public String toString() {
		DecimalFormat d = new DecimalFormat("0.00");
		double painoindx = this.paino / (this.pituus*this.pituus);
		String teksti = "Pituus: "+d.format(this.pituus)+"\n Paino: "+this.paino+"\n Painoindeksi: "+d.format(painoindx);
		return teksti;
		
	}
}

