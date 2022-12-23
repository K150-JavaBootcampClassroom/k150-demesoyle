import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        double balance=1_000_000; //  belirlenen bakiye
        double  rest=0; //  Kalan bakiye

        System.out.println("Yapılacak olan işlemi seçiniz ");       // mesaj kısımları
                                                                    // kulanıcıyı yönlendirme

        String message = "İşmlemler \n"
                .concat("belirleyeceğiniz miktarı çekmek için lütfen 1 'e basınız\n ")
                .concat("Para yatırmak için 2'ye.\n")
                .concat("Bakiyenizi öğrenmek için 3 e .\n")
                .concat("Çıkmak için lütfen 4'e basınız .");

        System.out.println(message);
        Scanner sc = new Scanner(System.in);  // Klavyeden girdi almak için bir Scanner  oluşturudm

        System.out.print("Lütfen bir komut girin: ");
        String command = sc.nextLine();  // aldığımız komutu commanda atadım

        System.out.println("Girdiğiniz komut: " + command);  // Alınan komutu ekrana yadırdık ..
        switch (command) {
            case "1" :
            System.out.println("bakiyeniz : " + balance);
                Scanner scan = new Scanner(System.in);

                System.out.print("Lütfen çekmek istediğiniz miktarı giriniz: ");
                double number = scan.nextInt();
                if (number > balance) {
                    System.out.println("Yetersiz Bakiye.");
                } else {
                    rest = balance-number;
                    System.out.println("Kalan bakiyeniz : "+ rest);

                }
                break;
            case "2":
                Scanner scan1 = new Scanner(System.in);  //

                System.out.print("Lütfen yatırmak istediğiniz  miktarı giriniz: ");
                double number1 = scan1.nextInt();  // Bir double sayı girdik  ve bunu number1 e atadık
                rest=balance+number1;
                System.out.println("Yeni bakiyeniz : "+ rest);

                break;
            case "3":
                rest=balance;
                System.out.println("Olan bakiyeniz : "+ rest);
                break;
            case "4":

                System.out.println("AEO kib BB bi daha gelme bu atmye :)");
                break;

            default:
                System.out.println("Geçersiz bir komut girdiniz");
                break;
        }






    }
}