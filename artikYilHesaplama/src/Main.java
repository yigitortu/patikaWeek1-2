import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenleri tanımlayalım
        int year;

        Scanner inp = new Scanner(System.in); // Kullanıcıdan veri almak için Scanner'ı tanımlayalım

        //Kullanıcıdan veriyi alalım
        System.out.print("Yıl giriniz : ");
        year = inp.nextInt();

        if (year >= 1 && year <= 999999){
            if (year % 4 == 0 ) {
                if (year % 100 == 0 && year % 400 == 0) {
                    System.out.println(year + " Bir artık yıldır.");
                }
                else {
                    System.out.println(year + " Artık yıl değildir.");
                }

            }else {
                System.out.println(year + " Artık yıl değildir.");
            }


        }else {
            System.out.println("Geçersiz bir yıl girdiniz. tekrar deneyiniz.");
        }


    }
}