import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Degiskenleri atayalım
        int birthOfYear;
        String burc = "";

        Scanner inp = new Scanner(System.in); // Scanner tanıtıldı.

        //Kullanıcıdan doğum tarihini alalım
        System.out.print("Doğum tarihinizi giriniz : ");
        birthOfYear = inp.nextInt();


        if (birthOfYear >= 1 && birthOfYear <= 9999 ){  // Kullanıcı doğum yılını 0 seçerse program hata verecektir
            if (birthOfYear % 12 == 0){
                burc = "Maymun";
            }
            if (birthOfYear % 12 == 1){
                burc = "Horoz";
            }
            if (birthOfYear % 12 == 2){
                burc = "Köpek";
            }
            if (birthOfYear % 12 == 3){
                burc = "Domuz";
            }
            if (birthOfYear % 12 == 4){
                burc = "Fare";
            }
            if (birthOfYear % 12 == 5){
                burc = "Öküz";
            }
            if (birthOfYear % 12 == 6){
                burc = "Kaplan";
            }
            if (birthOfYear % 12 == 7){
                burc = "Tavşan";
            }
            if (birthOfYear % 12 == 8){
                burc = "Ejderha";
            }
            if (birthOfYear % 12 == 9){
                burc = "Yılan";
            }
            if (birthOfYear % 12 == 10){
                burc = "At";
            }
            if (birthOfYear % 12 == 11){
                burc = "Koyun";
            }

            System.out.println("Çin zodyağı burcunuz : " + burc);

        }else {
            System.out.println("Yanlış bir doğum tarihi girdiniz. tekrar deneyiniz.");
        }

    }
}