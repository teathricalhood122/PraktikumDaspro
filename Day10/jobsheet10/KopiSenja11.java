import java.util.Scanner;

public class KopiSenja11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int totalSeluruhPelanggan = 0;
        int totalSeluruhItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();
        System.out.println("=== Input Penjualan Per Cabang ===");

        
        for (int i = 1; i <= jumlahCabang; i++) {
            
          
            int totalItemCabangIni = 0; 
            
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int jumlahItem = sc.nextInt();
                
       
                totalItemCabangIni += jumlahItem;
            }

           
            totalSeluruhPelanggan += jumlahPelanggan;
            totalSeluruhItem += totalItemCabangIni;
            
            
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabangIni + " item");
        }

        // --- Print Laporan GRAND TOTAL ---
        // Ini dilakuin SETELAH outer loop selesai
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalSeluruhPelanggan + " orang");
        System.out.println("Item terjual: " + totalSeluruhItem + " item");

        sc.close();
    }
}

