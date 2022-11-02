import java.util.Scanner;
public class zadanie11 {
    public static void main(String[] args) {

        Scanner liczby = new Scanner(System.in);
        System.out.print("podaj kilometry przejechane ");
double przewalonekilometry = liczby.nextDouble();
liczby.nextLine();
System.out.println("zuzyte paliwo");
double zuzytepaliwko = liczby.nextDouble();

System.out.println("przejechane kilometry:"+przewalonekilometry + "zuzyte paliwo:"+ zuzytepaliwko +
        "kilometry na litrze:"+ przewalonekilometry/zuzytepaliwko);



    }
}
