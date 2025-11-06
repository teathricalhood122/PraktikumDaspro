import java.util.Scanner;

public class TugasKafe11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt(); 
        
        
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        double totalBiaya = 0;

        System.out.println(); 

        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("--- Pesanan ke-" + (i + 1) + " ---");
            
            System.out.print("Nama Makanan/Minuman: ");
            namaPesanan[i] = sc.nextLine(); 
            
            System.out.print("Harga: ");
            hargaPesanan[i] = sc.nextDouble(); 

            sc.nextLine(); 
            
            totalBiaya += hargaPesanan[i];

            System.out.println(); 
        }

        System.out.println("======================================");
        System.out.println("      DAFTAR PESANAN ANDA");
        System.out.println("======================================");
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + "\t- Rp " + hargaPesanan[i]);
        }
        
        System.out.println("--------------------------------------");
        System.out.println("TOTAL BIAYA : Rp " + totalBiaya);
        System.out.println("======================================");
        
        sc.close(); 
    }
}