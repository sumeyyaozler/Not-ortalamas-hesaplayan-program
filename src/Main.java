import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degişkenleri olustur
        int mat , fizik , kimya ,turkce , tarih , muzik;

        // Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan degerleri al
        System.out.print("Matemetik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz :");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz :");
        kimya = inp.nextInt();

        System.out.print("Turkçe notunuz :");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz :");
        tarih = inp.nextInt();

        System.out.print("Muzik notunuz : ");
        muzik =inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik) ;
        double sonuc =toplam / 6 ;


        System.out.println("ortamala :" + sonuc );
        String str = sonuc >= 60 ?"gecer" : "kalır";
        System.out.print(str);




    }
}
