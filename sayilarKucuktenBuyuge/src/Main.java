import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenleri tanımlayalım
        int a, b ,c;

        Scanner input = new Scanner(System.in); // Scanner tanımlandı

        // Kullanıcıdan Sayıları isteyelim.
        System.out.print("1. Sayıyı giriniz : ");
        a = input.nextInt();

        System.out.print("2. Sayıyı giriniz : ");
        b = input.nextInt();

        System.out.print("3. Sayıyı giriniz : ");
        c = input.nextInt();

        // Kullanıcıdan aldığımız sayıları if else yapısı ile karşılaştıralım.

        if ((a < b) && (a < c)){
            if (b < c){
                System.out.println("Sıralamanız : a < b < c");
            }else {
                System.out.println("Sıralamanız : a < c < b");
            }
        }else if ((b < a ) && (b < c)) {
            if (a < c){
                System.out.println("Sıralamanız : b < a < c ");
            }else {
                System.out.println("Sıralamanız : b < c < a");
            }
        }else {
            if (a < b) {
                System.out.println("Sıralamanız : c < a < b");
            }else {
                System.out.println("Sıralamanız : c < b < a");
            }
        }



    }
}