import java.util.Scanner;

public class kafe11 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda Adalah Member, Dapatkan Diskon 10% Untuk Setiap Pembelian");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000 ");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan Pilih Menu Yang Anda Inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% berhasil diterapkan.");
            hargaTotal = hargaTotal / 2; 
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% berhasil diterapkan.");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100); 
        } else if (!kodePromo.equalsIgnoreCase("none")) {
            System.out.println("Kode invalid"); 
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;
        String lanjut;

        Menu("Andi", true); 

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            
            System.out.print("Masukkan kode promo (ketik 'none' jika tidak ada): ");
            String kodePromo = sc.next();

            int hargaItem = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += hargaItem;

            System.out.print("Apakah anda ingin memesan menu lain? (y/n): ");
            lanjut = sc.next();

        } while (lanjut.equalsIgnoreCase("y"));

        System.out.println("\nTotal Keseluruhan Pesanan Anda: Rp" + totalKeseluruhan);
    }
}