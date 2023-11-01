import java.util.Scanner;

public class ArrayRataNilai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int k = sc.nextInt();

        int[] nilaiMhs = new int[k];
        double total = 0;
        int lulus = 0; // Deklarasikan variabel lulus di sini

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            
            if (nilaiMhs[i] > 70) {
                lulus++;
                System.out.println("Mahasiswa ke-" + (i + 1) + " lulus.");
            }
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        System.out.println("Jumlah mahasiswa lulus: " + lulus);
    }
}
