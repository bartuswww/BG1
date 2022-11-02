import java.util.Scanner;
public class zadanie13 {
    public static void main(String[] args) {
        Scanner liczby = new Scanner(System.in);
        int liczy =3;
        System.out.println("podaj ocene z pierwszego testu");
        int pierwszy;
        pierwszy = liczby.nextInt();
        System.out.println("podaj ocene z drugiego testu");
        int drugi;
        drugi = liczby.nextInt();
        System.out.println("podaj ocene z trzeciego testu");
        int trzeci;
        trzeci = liczby.nextInt();
        int suma;
        suma = pierwszy + drugi + trzeci;
        double srednia = suma/liczy;
        System.out.println("pierwszy:"+ pierwszy);
        System.out.println("drugi"+ drugi );
        System.out.println("trzeci:"+trzeci );
        System.out.println( "srednia ocen:"+ srednia);




    }
}
