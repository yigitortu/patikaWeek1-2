import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenleri atayalım
        int number1, number2, selectNumber;

        Scanner inp = new Scanner(System.in); // Scanner tanıtıldı

        // Kullanıcıdan sayıları isteyelim
        System.out.print("Birinci sayıyı giriniz : ");
        number1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        number2 = inp.nextInt();

        //Kullanıcıdan yapmasını istediğimiz işlemi seçmesini isteyelim.
        System.out.println("1- Toplama\n2- Çıkartma\n3- Çarpma\n4- Bölme");
        System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
        selectNumber = inp.nextInt();

        // Switch - case yapısı ile hesap makinesini oluşturalım

        switch (selectNumber) {
            case 1:
                System.out.println("Toplam : " + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkartma : " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma : " + (number1 * number2));
                break;
            case 4:
                switch (number2) {   //Sayı 2'nin  0 olma durumunda
                    case 0:          //Sayı 2 = 0 ' a eşit olursa bu case içine girecektir.
                        System.out.println("Sayı 0a Bölünemez");
                        break;
                    default:        // Sayı 2 0 haricinde olursa bu case içine girecektir.
                        System.out.println("Bölme : " + number1 / number2);


                }


        }


    }
}