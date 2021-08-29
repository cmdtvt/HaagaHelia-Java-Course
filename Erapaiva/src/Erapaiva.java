

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Erapaiva {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna laskun p‰iv‰m‰‰r‰ (vvvv-kk-pp): ");
        String date = lukija.next();
        LocalDate paivamaara = LocalDate.parse(date);
        
        //DateTimeFormatter d = new DateTimeFormatter();
        
        String paivays = paivamaara.format(DateTimeFormatter.ofPattern("MMM dd, yyyy"));
        
        LocalDate lisapaivat = paivamaara.plusDays(14);
        
        System.out.println("Er‰p‰iv‰ on " +date + lisapaivat);
        

    }

}