import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenleri atayalım
        int degree;

        Scanner inp = new Scanner(System.in); // Scanner tanıtıldı.

        // Sıcakldık değerini kullanıcıdan isteyelim.
        System.out.print("Sıcaklık derecesini giriniz : ");
        degree = inp.nextInt();

        if ( degree < 5 ) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }else if ( degree >= 5 && degree < 15 ) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if ( degree >= 15 && degree < 25 ) {
            System.out.println("Piknik yapmaya gidebilirsiniz.");
        }else if ( degree >= 25){
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

        System.out.println("İyi Tatiller.");
    }
}