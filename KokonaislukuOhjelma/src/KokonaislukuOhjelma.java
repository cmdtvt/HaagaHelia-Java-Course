import java.util.ArrayList;
import java.util.Scanner;

public class KokonaislukuOhjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> esineet = new ArrayList<Integer>();
		int maara = 1;
		System.out.println("Anna "+maara+". luku: ");
		while(maara < 11) {
			
			Scanner input = new Scanner(System.in);
			
			boolean success = false;
			try {
				int tulos = input.nextInt();
				if( tulos % 1 == 0) {
					esineet.add(tulos);
				    success = true;
				    maara ++;
				}


			    
			    
			} catch (Exception e) {
			    
			}
			if (success == false) {
			   System.out.print("Syötä kokonaisluku numeronäppäimillä!");
			   System.out.print("Anna "+maara+". luku: ");
			} else {
				System.out.print("Anna "+maara+". luku: ");
			}
			//success = false;
			
			
			
			
		}
		
		System.out.println("LUVUT: ");
		System.out.println(esineet);
		
		
	}

}
