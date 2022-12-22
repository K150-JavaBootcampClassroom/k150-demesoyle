import java.util.Random;// kütüphane import  ettim

public class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int counter = 0; // her adımda artırılacak olan ve sonunda  ekranda kaçıncı
                      // adımda olduğunu söyleyen değişken

    while (true) {
      int number = r.nextInt(500);  // 0 ile 500 arasından sayı seç
      counter++;  // her adımda bir  artır

      if (number >= 50 && number <= 100) {  // 50 ile 100 arasında sayı bulduysak
        System.out.println("Bulduğum sayı: " + number);
        System.out.println("Kaçıncı adımda buldu: " + counter);
        break;  // Döngüyü sonlandır
      }
    }
  }
}
