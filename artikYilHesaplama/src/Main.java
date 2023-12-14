import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenleri tanımlayalım
        int year;

        Scanner inp = new Scanner(System.in); // Kullanıcıdan veri almak için Scanner'ı tanımlayalım

        //Kullanıcıdan veriyi alalım
        System.out.print("Yıl giriniz : ");
        year = inp.nextInt();

        if (year >= 1 && year <= 999999){   // Yıl aralığını belirttik
            // Alınan yıl 4'ün katı olmalı seçeneği
            if (year % 4 == 0 ) {
                if (year % 100 == 0 && year % 400 == 0) { // 4'ün katı olan yılların 100'e ve 400'e bölünme kuralı
                    System.out.println(year + " Bir artık yıldır.");
                }
                else {
                    System.out.println(year + " Artık yıl değildir.");
                }
            // 4'e bölünmeyen yıllar için vereceğimiz mesaj.
            }else {
                System.out.println(year + " Artık yıl değildir.");
            }
            // Geçersiz bir yıl girdiği takdirde kullanıcıya verilen mesaj Örnek = 0
        }else {
            System.out.println("Geçersiz bir yıl girdiniz. tekrar deneyiniz.");
        }


    }
}