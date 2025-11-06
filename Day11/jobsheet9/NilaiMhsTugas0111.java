import java.util.Scanner;

public class NilaiMhsTugas0111 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahNilai = sc.nextInt();

        if (jumlahNilai <= 0) {
            System.out.println("Jumlah harus lebih dari 0. Program berhenti.");
            return; 
        }

        int[] nilaiMhs = new int[jumlahNilai]; 
        double total = 0; 
        
        int nilaiTertinggi = Integer.MIN_VALUE; 
        int nilaiTerendah = Integer.MAX_VALUE;

        System.out.println(); 

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int nilaiInput = sc.nextInt(); 

            nilaiMhs[i] = nilaiInput;

            total += nilaiInput;

            if (nilaiInput > nilaiTertinggi) {
                nilaiTertinggi = nilaiInput;
            }

            if (nilaiInput < nilaiTerendah) {
                nilaiTerendah = nilaiInput;
            }
        }

        double rataRata = total / jumlahNilai;


        System.out.println("\n========== HASIL PENGELOLAAN NILAI ==========");

        System.out.println("Semua nilai yang dimasukkan:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print(nilaiMhs[i] + (i < nilaiMhs.length - 1 ? ", " : ""));
        }
        
        System.out.println("\n---------------------------------------------");

        System.out.println("Nilai Rata-rata : " + rataRata);
        
        System.out.println("Nilai Tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai Terendah  : " + nilaiTerendah);
        
        System.out.println("=============================================");
    }
}