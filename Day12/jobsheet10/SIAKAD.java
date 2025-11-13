import java.util.Scanner;

public class SIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        // 1. Inputan User
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jmlSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        int jmlMatkul = sc.nextInt();

        // 2. Buat array secara dinamis 
        int[][] nilai = new int[jmlSiswa][jmlMatkul];
        


        System.out.println(); 


        for (int i = 0; i < nilai.length; i++) { 
            System.out.println("Input Mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0; //7

            for (int j = 0; j < nilai[i].length; j++) { 
                System.out.print("Nilai Mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];//7
            }

            // 3. Jangan bagi 3, tapi bagi dengan jumlah mata kuliah
            System.out.println("Nilai rata-rata: " + totalPerSiswa / nilai[i].length); 
        }

        System.out.println("\n====================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");
        
        // --- MODIFIKASI DIMULAI ---
        // 4. Jangan loop sampai 3, tapi sampai jumlah mata kuliah
        for (int j = 0; j < nilai[0].length; j++) { // <-- KODE BARU (ambil length kolom dari baris 0)
            
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) { 
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul / nilai.length );
        }
        
        sc.close(); 
    }
}