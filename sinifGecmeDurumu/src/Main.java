import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // Degiskenleri tanımlayalım
        int mat, fizik, turkce, kimya, muzik;
        int dersToplami = 0;
        int dersSayisi = 5;


        Scanner input = new Scanner(System.in); // Kullanıcıdan veri almak için Scanner tanıtıldı.


        // Kullanıcıdan ders notlarını alalım

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        if ((mat>=0) && (mat<100)){
            dersToplami += mat;
        }else {
            System.out.println("Matematik dersinin ortalaması alınamaz.");
        }

        if ((fizik>=0) && (fizik<100)){
            dersToplami += fizik;
        }else {
            System.out.println("Fizik dersinin ortalaması alınamaz.");
        }

        if ((turkce>=0) && (turkce<100)){
            dersToplami += turkce;
        }else {
            System.out.println("Türkçe dersinin ortalaması alınamaz.");
        }

        if ((kimya>=0) && (kimya<100)){
            dersToplami += kimya;
        }else {
            System.out.println("Kimya dersinin ortalaması alınamaz.");
        }

        if ((muzik>=0) && (muzik<100)){
            dersToplami += muzik;
        }else {
            System.out.println("Müzik dersinin ortalaması alınamaz.");
        }




        double ortalama = dersToplami / 5 ;




        if ( ortalama <= 55  ) {
            System.out.println("Ortalamanız : " + ortalama);
            System.out.println("Bu ortalama sınıfı geçmene yeterli değil. Sınıfta kaldınız.");
        }else {
            System.out.println("Ortalamanız : " + ortalama);
            System.out.println("Tebriklerr sınıfı başarıyla geçtiniz.");

        }


    }
}