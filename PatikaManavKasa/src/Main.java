import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /* Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine
    göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL */
      double armut,elma,domates,muz,patlıcan;
      double armutdeger=2.14,elmadeger=3.67,domatesdeger=1.11,muzdeger=0.95,patlıcandeger=5.00;
      double armutfiyat,elmafiyat,domatesfiyat,muzfiyat,patlıcanfiyat,ToplamFiyat;

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç kilogram armut alacaksınız : ");
        armut = scan.nextDouble();
        armutfiyat = armutdeger*armut;

        System.out.println("Kaç kilogram elma alacaksınız : ");
        elma = scan.nextDouble();
        elmafiyat= elmadeger*elma;

        System.out.println("Kaç kilogram domates alacaksınız : ");
        domates = scan.nextDouble();
        domatesfiyat = domatesdeger*domates;

        System.out.println("Kaç kilogram muz alacaksınız : ");
        muz = scan.nextDouble();
        muzfiyat = muzdeger*muz;

        System.out.println("Kaç kilogram patlıcan alacaksınız : ");
        patlıcan = scan.nextDouble();
        patlıcanfiyat=patlıcandeger*patlıcan;

        ToplamFiyat = armutfiyat+elmafiyat+domatesfiyat+muzfiyat+patlıcanfiyat;
        System.out.println("Toplam tutar : " + ToplamFiyat + " TL");

    }
}