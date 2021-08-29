import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinigolfTilasto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("0.00");
		
		ArrayList<Integer> tulokset = new ArrayList<Integer>();
		
		System.out.print("Pelaajien lukum‰‰r‰: ");
		int maara = input.nextInt();
		
		for(int i = 1; i < maara+1; i++) {
			
			System.out.print("Anna pelaajan "+i+". tulos: ");
			int tulos = input.nextInt();
			tulokset.add(tulos);	
			
		}
		
		Collections.sort(tulokset);
		Collections.reverse(tulokset);
		System.out.println("Pienin peli oli "+tulokset.get(maara-1));
		System.out.println("Pienin peli oli "+tulokset.get(0));
		
	    double avg = 0; 
	    for (int i = 0; i < tulokset.size(); i++)  
	        avg += tulokset.get(i);     
	    avg = avg / tulokset.size();
	    
	    int pelaajat = 0;
	    for (int i=0; i < tulokset.size(); i++) {
	    	if(tulokset.get(i) > avg) {
	    		pelaajat ++;
	    	}
	    }
		
		
		System.out.println(pelaajat+" palaajalla oli keskiarvoa pienempi tulos");
		
			
	}

}
