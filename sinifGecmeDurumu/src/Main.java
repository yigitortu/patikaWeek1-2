import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // Degiskenleri tanımlayalım
        int mat, fizik, turkce, kimya, muzik;
        int matNot, fizikNot, turkceNot, kimyaNot, muzikNot;
        int dersToplami = 0;
        int dersSayisi = 0;
        int x = 0;


        Scanner input = new Scanner(System.in); // Kullanıcıdan veri almak için Scanner tanıtıldı.


        // Kullanıcıdan ders notlarını alalım



        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        if (( mat >= 0 ) && ( mat <= 100 )){
            System.out.print("Sisteme eklendi : ");     // Her bir ders notunun koşulu sağladığından emin olalım
            dersToplami += mat;

        }else {
            System.out.println("Bu dersin ortalaması alınamaz.");

        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        if (( fizik >= 0 ) && ( fizik <= 100 )){
            System.out.print("Sisteme eklendi : ");     // Her bir ders notunun koşulu sağladığından emin olalım
            dersToplami += fizik;
        }else {
            System.out.println("Bu dersin ortalaması alınamaz.");
        }

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        if (( turkce >= 0) && ( turkce <= 100 )){
            System.out.print("Sisteme eklendi : ");     // Her bir ders notunun koşulu sağladığından emin olalım
            dersToplami += turkce;
        }else {
            System.out.println("Bu dersin ortalaması alınamaz.");
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        if (( kimya >= 0 ) && ( kimya < 100 )){
            System.out.print("Sisteme eklendi : ");     // Her bir ders notunun koşulu sağladığından emin olalım
            dersToplami += kimya;
        }else {
            System.out.println("Bu dersin ortalaması alınamaz.");
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();


        if (( muzik >= 0) && ( muzik < 100 )) {
            System.out.print("Sisteme eklendi : ");     // Her bir ders notunun koşulu sağladığından emin olalım
            dersToplami += muzik;
        }else {
            System.out.println("Bu dersin ortalaması alınamaz.");
        }

        // Alınan derslerin ortalamasını alalım ekrana yazdıralım.


        double ortalama = dersToplami / 5;

        if (ortalama <= 55) {
            System.out.println("Ortalamanız : " + ortalama);
            System.out.println("Bu ortalama sınıfı geçmene yeterli değil. Sınıfta kaldınız.");
        } else {
            System.out.println("Ortalamanız : " + ortalama);
            System.out.println("Tebriklerr sınıfı başarıyla geçtiniz.");

        }
    }

}