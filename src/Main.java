import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak Sayısı: ");
        int basamakSayisi = scanner.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            // Boşlukları ekle
            for (int j = 0; j < basamakSayisi - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları ekle
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Bir satır atla
            System.out.println();
        }

        scanner.close();
    }
}