import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenleri tanımlayalım
        final double perKm = 0.10;
        int distance, age, type;
        double total;
        double discount, discount2, totalDiscount;


        //Scanner tanımlayalım
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan verileri alalım
        System.out.print("Katedilen mesafe : ");
        distance = inp.nextInt();

        System.out.print("Yolcunun yaşı : ");
        age = inp.nextInt();

        System.out.println("Yolculuk tipi seçiniz :");
        System.out.println("Tek yön ise 1'e basınız.");
        System.out.println("Gidiş-dönüş ise 2'ye basınız.");
        type = inp.nextInt();


        if (distance > 0) {         // Eğer kullanıcının girdiği KM 0'dan küçükse HATA Vermesi için girilen kod
            switch (type) {
                case 1:             // Kullanıcı tek yön gidişi seçerse girilecek olan yapı burası.
                    if (age >= 1 && age < 12) {     // Kullanıcının yaşına göre yapılan indirim ve bilet fiyatı uygulaması
                        discount = (distance * perKm) / 2;
                        total = (distance * perKm) - discount;
                        System.out.println("Kullanıcıya uygulanan indirim : " + discount);
                        System.out.println("Kullanıcıya %50 indirim uygulanmıtşır bilet fiyatı : " + total + " TL");

                    } else if (age >= 12 && age < 24) { // Kullanıcının yaşına göre yapılan indirim ve bilet fiyatı uygulaması
                        discount = (distance * perKm) * 0.1;
                        total = (distance * perKm) - discount;
                        System.out.println("Kullanıcıya uygulanan indirim : " + discount);
                        System.out.println("Kullanıcıya %10 İndirim uygulanmıştır bilet fiyatı : " + total + " TL");
                    } else if (age >= 65 && age < 110) {    // Kullanıcının yaşına göre yapılan indirim ve bilet fiyatı uygulaması
                        discount = (distance * perKm) * 0.3;
                        total = (distance * perKm) - discount;
                        System.out.println("Kullanıcıya uygulanan indirim : " + discount);
                        System.out.println("Kullanıcıya %30 İndirim uygulanmıştır bilet fiyatı : " + total + " TL");
                    } else if (age >= 25 && age < 65) {     // Kullanıcının yaşına göre yapılan indirim ve bilet fiyatı uygulaması
                        total = (distance * perKm);
                        System.out.println("Kullanıcıya indirim uygulanmamıştır bilet fiyatı : " + total + " TL");
                    } else {
                        System.out.println("Hatalı yaş girdiniz. tekrar deneyiniz.");
                    }
                    break;

                case 2:             //// Kullanıcı gidiş dönüş  seçerse girilecek olan yapı burası.
                    System.out.println("Gidiş Dönüş bileti seçtiniz. işlem sonunda %20 indirim uygulanacaktır.");

                    if (age >= 1 && age < 12) {     // Kullanıcının yaşına göre yapılan indirim ve bilet fiyatı uygulaması
                        discount = (distance * perKm) / 2;
                        discount2 = (distance * perKm) * 0.2;
                        totalDiscount = discount + discount2;
                        total = (distance * perKm) - discount - discount2;
                        System.out.println("Kullanıcıya uygulanan indirim : " + totalDiscount + " TL");
                        System.out.println("Bilet fiyatı : " + total + " TL");

                    } else if (age >= 12 && age < 24) {     // Kullanıcının yaşına göre yapılan indirim ve bilet fiyatı uygulaması
                        discount = (distance * perKm) * 0.1;
                        discount2 = (distance * perKm) * 0.2;
                        totalDiscount = discount + discount2;
                        total = (distance * perKm) - discount - discount2;
                        System.out.println("Kullanıcıya uygulanan indirim : " + totalDiscount + " TL");
                        System.out.println("Bilet fiyatı : " + total + " TL");

                    } else if (age >= 65 && age < 110) {        // Kullanıcının yaşına göre yapılan indirim ve bilet fiyatı uygulaması
                        discount = (distance * perKm) * 0.3;
                        discount2 = (distance * perKm) * 0.2;
                        totalDiscount = discount + discount2;
                        total = (distance * perKm) - discount - discount2;
                        System.out.println("Kullanıcıya uygulanan indirim : " + totalDiscount + " TL");
                        System.out.println("Bilet fiyatı : " + total + " TL");

                    } else if (age >= 25 && age < 65) {     // Kullanıcının yaşına göre yapılan indirim ve bilet fiyatı uygulaması
                        discount2 = (distance * perKm) * 0.2;
                        total = (distance * perKm) - discount2;
                        totalDiscount = discount2;
                        System.out.println("Kullanıcıya %20 indirim uygulanmıştır : " + totalDiscount + " TL");
                        System.out.println("Bilet fiyatı : " + total + " TL");
                        // Hatalı yaş girilmesi durumunda kullanıcıya verilecek olan mesaj.
                    } else {
                        System.out.println("Hatalı yaş girdiniz. tekrar deneyiniz.");
                    }


                    break;

                // Yanlış tip seçimi yapıldıktan sonra kullanıcıya verilecek olan mesaj.
                default:
                    System.out.println("Yanlış tip seçtiniz. tekrar deneyiniz");
            }
        // Kullanıcıdan alınan KM'nin 0 dan küçük olması durumunda kullanıcıya verilecek olan mesaj.
        } else {
            System.out.println("Kilometre 0'dan küçük olamaz");
        }


    }
}