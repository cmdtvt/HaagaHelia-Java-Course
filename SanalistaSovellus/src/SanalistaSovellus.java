import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SanalistaSovellus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("0.00");
		
		ArrayList<String> esineet = new ArrayList<String>();
		
		
		
		while(true) {
			
			System.out.println("1 = Lis‰‰ sana");
			System.out.println("2 = Listaa sanat");
			System.out.println("3 = Laske sanat");
			System.out.println("4 = Poista sanat");
			System.out.println("0 = Lopeta");
			System.out.println("Anna valintasi: ");
			String sana = input.nextLine();
			
			
			if(sana.equals("0")) {
				break;
				
			} else if (sana.equals("1")) {
				System.out.print("Anna sana: ");
				esineet.add(input.nextLine());
				
			} else if (sana.equals("2")) {
				for(String sana2 : esineet) {
					System.out.print(" "+sana2);
				}
				System.out.println();
				
			} else if(sana.equals("3")) {
				System.out.print("Anna sana, mink‰ esiintymiskerrat lasketaan: ");
				int count = 0;
				String haluttu = input.nextLine();
				for(String sana2 : esineet) {
					if(sana2.equals(haluttu)) {
						count++;
					}
				}
				System.out.println("Sana "+haluttu+" esiintyi "+count+" kertaa");
				
			} else if(sana.equals("4")) {
				System.out.print("Anna sana, joka poistetaan: ");
				String haluttu = input.nextLine();
				if(esineet.contains(haluttu)) {
					//for(int i = 0; i < esineet.size(); i++) {
					esineet.removeAll(Collections.singleton(haluttu));
					//}
					
					System.out.println("Jokainen sana "+haluttu+" on poistettu listasta");
				} else {
					System.out.println("Sanaa "+haluttu+" ei ollut listassa");
				}
			}
		}
	}
}
