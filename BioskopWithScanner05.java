import java.util.Scanner;
public class BioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                while (true) {
                System.out.print("Masukkan nama: ");
                nama=sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();

                            if (baris < 1 || baris > penonton.length) {
                                System.out.println("Baris tidak tersedia. Pilih 1 sampai " + penonton.length);
                            } else {
                                break;
                            }
                    }
                
                    while (true) {
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();

                        if (kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Kolom tidak tersedia. Pilih 1 sampai " + penonton[0].length);
                            continue;
                        }

                        if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("Kursi sudah terisi. Pilih kursi lain.");
                            continue;
                        }
                        break;
                    }

                    sc.nextLine();
                    penonton[baris-1][kolom-1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next=sc.nextLine();

                    if  (next.equalsIgnoreCase("n")) {
                        break;
                    }

                }
            }

            if (pilih == 2) {
                System.out.println("\nDaftar penonton");
                for(int i = 0; i < penonton.length; i++){
                    for(int j = 0; j < penonton[i].length; j++){
                        String isi = penonton[i][j];
                        if (isi == null) {
                            isi = "-";
                        }
                        System.out.print(isi + " ");
                    }
                    System.out.println();
                }
            }

            if (pilih == 3) {
                break;
            }
        }

        
    }
}
