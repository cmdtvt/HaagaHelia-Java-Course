import java.util.Scanner;

public class Alkuluku {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Syötä jokin positiivinen kokonaisluku: ");
        int luku = input.nextInt();

        boolean ok = false;

        for(int i=2;i<luku;i++) {
            if(luku%i==0)
                ok = true;
        }
       

        if(ok == true) {
            System.out.println("Luku " + luku + " ei ole alkuluku.");
        } else {
            System.out.println("Luku " + luku + " on alkuluku.");
        }

    }
}