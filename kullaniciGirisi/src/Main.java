import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    // degiskenleri tanımlayalım
        String userName, password, yeniSifre, resetPassword;


        Scanner inp = new Scanner(System.in); // t
        // Kullanıcı adı ve şifre oluşturdugumuz kısım.
        System.out.print("Kullanıcı adı giriniz : ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = inp.nextLine();

        // kullanıcı adının doğru olup olmadıgını dogruladıgımız yer
        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş başarılı.");
        }else { //şifre yanlış ise yeni şifre için yönlendirme yaptıgımız kısım
            System.out.println("Kullanıcı adı veya şifre yanlış.");
            System.out.println("Şifrenizi yenilemek ister misiniz ?\n Evet ise y \n Hayır ise n tuşlayınız.");


        }

        // Kullanıcıdan şifre yenileme isteğini yes or no komutuyla kontrol etmek için kullanıcıdan veri bekliyoruz
        resetPassword = inp.nextLine();

        switch (resetPassword) {
            case "y":       // kullanıcı y ile devam ederse şifre değiştirmeyi kabul ettiği varsayılıyor.
                System.out.print("Şifre yenileme isteği kabul edildi yeni şifreyi oluşturun : ");
                yeniSifre = inp.nextLine();
                switch (yeniSifre) {
                    case "java123":
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                        break;
                    default:
                        System.out.println("Şifre oluşturuldu");
                }
            break;

            case "n": // şifre yenileme isteğine n cevabını verirse aşağıdaki uyarıyı veriyor
                System.out.println("Yeni bir şifre belirlemeniz gerekiyor.");
                break;
                default:    // y veya n seçilmezse kullanıcıya herhangi birini seçmesi için uyarı veriliyor
                    System.out.println("Lütfen y/n olmak üzere seçim yapınız.");
                    System.out.println("Programdan çıkış yapılıyor");
        }



    }
}