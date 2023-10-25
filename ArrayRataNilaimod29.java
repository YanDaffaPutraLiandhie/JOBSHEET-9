import java.util.Scanner;
public class ArrayRataNilaimod29{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan jumlah mahasiswa :");
        int k = sc.nextInt();

        int[] nilaiMhs = new int[k];       
        int jumlahmahasiswa; 
        double totallulus= 0;
        double totaltidaklulus=0;
        double rata2lulus;
        double rata2tidaklulus=0;
        int luluscount=0;
        int tidakluluscount=0;

        for (int i =0; i < nilaiMhs.length; i++){
            System.out.print("masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            nilaiMhs[i]= sc.nextInt();
            if(nilaiMhs[i]>70){
            luluscount++;
            totallulus += nilaiMhs[1];
            }
        
        else{ 
        tidakluluscount++;
        totaltidaklulus+=nilaiMhs[i];
        }
    }
        
        rata2lulus= totallulus/luluscount;
        rata2tidaklulus = totaltidaklulus/tidakluluscount;
        System.out.println("rata rata nilai mahasiswa lulus :" + rata2lulus);
        System.out.println("Rata-rata nilai mahasiswa tidak lulus : =" + rata2tidaklulus);
        sc.close();
        }
}