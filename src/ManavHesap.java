import java.util.Scanner;

public class ManavHesap {

    public static void main(String[] args) {

        double armutFiyat= 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        double armutKG= 0.0;
        double elmaKG= 0.0;
        double domatesKG = 0.0;
        double muzKG= 0.0 ;
        double patlicanKG= 0.0;
        double toplam=0.0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? " );
        armutKG = scan.nextDouble();

        System.out.print("Elma Kaç Kilo ? " );
        elmaKG = scan.nextDouble();

        System.out.print("Domates Kaç Kilo ? " );
        domatesKG = scan.nextDouble();

        System.out.print("Muz Kaç Kilo ? " );
        muzKG = scan.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? " );
        patlicanKG = scan.nextDouble();

        double hesapla = armutFiyat*armutKG + elmaFiyat*elmaKG + domatesFiyat*domatesKG + muzKG*muzFiyat + patlicanKG*patlicanFiyat ;

        System.out.print("Toplam Tutar : " + hesapla + " TL" );



    }

}
