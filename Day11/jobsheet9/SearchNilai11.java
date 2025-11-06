import java.util.Scanner;

public class SearchNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];

        System.out.println(); 

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");       
            nilaiMhs[i] = sc.nextInt();   
        }

        System.out.println(); 

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();


        int hasilIndeks = -1; 
        
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] == key) {
                hasilIndeks = i; 
                break; 
            }
        }

        if (hasilIndeks != -1) {
           
            System.out.println();
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasilIndeks + 1));
        
        } else {

            System.out.println();
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}