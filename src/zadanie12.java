import java.util.Scanner;
public class zadanie12 {
    public static void main(String[] args) {
        Scanner liczby = new Scanner(System.in);
        System.out.print("podaj zjedzone ciasteczka ");
        double zjedzone = liczby.nextDouble();
        liczby.nextLine();
        double kalorie = 300;
        System.out.println("zjadles:"+ zjedzone+ "jedno ciastko ma 300 kalorii a razem zjadles:" + zjedzone*kalorie);


    }
}
