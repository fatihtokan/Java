import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Random rsayi = new Random();
        int sayi = rsayi.nextInt(100) + 1;
        int hak = 3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 ile 100 arasında bir sayı tahmin edin:");

        while (hak > 0) {
            System.out.print("Tahimn edilen sayıyı giriniz: ");
            int tahmin = scanner.nextInt();

            if (tahmin == sayi) {
                System.out.println("Tebrikler doğru bildiniz!");
                break;
            } else {
                hak--;
                if (hak > 0) {
                    System.out.println("Yanlış tahmin. Kalan hak: " + hak);
                } else {
                    System.out.println("Hakkınız bitti. Doğru sayı: " + sayi);
                }
            }
        }

        scanner.close();

    }
}