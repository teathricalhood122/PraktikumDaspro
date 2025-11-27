public class pengunjungCafe11 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        
       for (String nama : namaPengunjung) {
        System.out.println("- " + nama);
    }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        
        daftarPengunjung("Andi");
        
        // Contoh 3: Kirim 4 nama sekaligus
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}
