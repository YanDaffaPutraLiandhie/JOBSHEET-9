import java.util.Scanner;

public class ArrayNilai29{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nilaiAkhir = new int[10];
    
    for (int i = 0; i < 10; i++){
    System.out.print("Masukkan nilai ke-"+i+":" );
    nilaiAkhir[i] = sc.nextInt();
    
    }
    for (int i = 0; i < 10; i++){
        System.out.println("nilai akhir ke-"+i+"adalah"+nilaiAkhir[i]);
}

} 
}