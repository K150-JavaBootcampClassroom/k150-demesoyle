import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int counter = 0;

    while (true) {
      int number = r.nextInt(500);  // 0 ile 500 arasından sayı seç
      counter++;  // Adım sayıcısını artır

      if (number >= 50 && number <= 100) {  // 50 ile 100 arasında sayı bulduysak
        System.out.println("Bulduğum sayı: " + number);
        System.out.println("Kaçıncı adımda buldu: " + counter);
        break;  // Döngüyü sonlandır
      }
    }
  }
}
