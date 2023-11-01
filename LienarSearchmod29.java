import java.util.Scanner;

public class LinearSearchmod29 {
    public static void main(String[] args) {
       
        int key = 0;
        int hasil = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah array: ");
        int j = sc.nextInt();
        int[] arr = new int[j];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai array ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != 0) {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        }
        sc.close();
    }
}
