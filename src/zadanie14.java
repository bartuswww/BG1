import java.util.Scanner;
public class zadanie14 {
    public static void main(String[] args) {
        Scanner cena = new Scanner(System.in);
        System.out.println("wprowadz cene:" );
        double cenadetaliczna = cena.nextDouble();
        double marza;
        marza = 0.4;
        double zysk;
        zysk = cenadetaliczna*marza;
        System.out.println( "zysk:"+ zysk);


    }
}
