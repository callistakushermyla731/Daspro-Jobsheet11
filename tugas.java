import java.util.Scanner;
public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        int[][] survei = new int[jumlahResponden][jumlahPertanyaan];

        for (int i = 0; i < jumlahResponden; i++) {
        System.out.println("Input nilai responden ke-" + (i + 1));
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Nilai pertanyaan " + (j + 1) + ": ");
                survei[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nRata-rata setiap responden");
        for (int i = 0; i < jumlahResponden; i++) {
            double total = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                total += survei[i][j];
            }
            System.out.println("Responden " + (i + 1) + ": " + (total / jumlahPertanyaan));
        }

        System.out.println("\nRata-rata setiap pertanyaan");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            double total = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                total += survei[i][j];
            }
            System.out.println("Pertanyaan " + (j + 1) + ": " + (total / jumlahResponden));
        }

        double totalKeseluruhan = 0;
        int jumlahData = jumlahResponden * jumlahPertanyaan;

        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }

        System.out.println("\nRata-rata keseluruhan: " + (totalKeseluruhan / jumlahData));
    }

}

