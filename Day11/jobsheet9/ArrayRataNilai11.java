import java.util.Scanner;

public class ArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int MahasiswaLulus = 0;
        double totalNilaiLulus =0;
        int MahasiswaTidakLulus=0;
        double totalNilaiTidakLulus =0;
        
        
        int jumlahMahasiswa = 0;
        System.out.print("Masukan Jumlah Mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];
        


        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i+1) + " : ");      
            nilaiMhs[i] = sc.nextInt();   
        }
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] >70) {
                MahasiswaLulus++;
                totalNilaiLulus += nilaiMhs[i];
            } else {
                MahasiswaTidakLulus++;
                totalNilaiTidakLulus += nilaiMhs[i];
            }
        }
        
        double rata2Lulus = 0.0;
        if (MahasiswaLulus > 0) {
            rata2Lulus = totalNilaiLulus/MahasiswaLulus;        
        }

        double rata2TdkLulus = 0.0;
        if (MahasiswaTidakLulus >0) {
            rata2TdkLulus = totalNilaiTidakLulus/MahasiswaTidakLulus;
        }

        System.out.println("Rata-rata Nilai Mahasiswa Lulus = " + rata2Lulus);
        System.out.println("Rata-rata Nilai Mahasiswa Tidak Lulus = "+ rata2TdkLulus);
        sc.close();
    }
}
