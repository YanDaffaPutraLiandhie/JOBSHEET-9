import java.util.Scanner;

public class tugasno1jobsheet9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int maximum = arr[0];
        int minimum = arr[0];
        int total = arr[0];
        for (int i = 1; i < a; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
            total += arr[i];
        }
        double rata2 = total / a;
        System.out.println("Nilai Tertinggi: " + maximum);
        System.out.println("Nilai Terendah: " + minimum);
        System.out.println(" Rata-rata: " + rata2);
        
        sc.close();
    }
}