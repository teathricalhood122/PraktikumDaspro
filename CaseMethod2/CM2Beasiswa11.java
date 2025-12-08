// Nama  : Helmi Mohammad Fajari
// Kelas : SIB-1B
// Absen : 11


import java.util.Scanner; // Import library untuk input dari user

public class CM2Beasiswa11 {

    // DEKLARASI GLOBAL (SCOPE VARIABLE)
    // Variabel di sini bersifat 'static' agar bisa diakses dan di baca oleh funvtion dibawah
    
    static Scanner sc = new Scanner(System.in);
    
    // Array Menyimpan banyak data mahasiswa dalam satu variabel array.
    // Kapasitas maksimal diset 10 data karena dalam cm2 hanya ada 4 mahasiswa jadi saya set 10 saja
    static Mahasiswa[] dataMhs = new Mahasiswa[10]; 
    
    // Untuk menghitung berapa data yang sudah pada saat program di jalankan dan di isii
    // 0 karena belum ada data yang masuk
    static int jumlahMhs = 0; 

    // CLASS MAHASISWA
    // Ini adalah code untuk membuat objek mahasiswa.
    public static class Mahasiswa {
        // Data yang dimiliki oleh masing masing mahasiswa 
        String nama;
        String nim;
        double ipk;
        String jenisBeasiswa;
        double penghasilanOrangTua;

        // Constructor: Fungsi khusus untuk mengisi data awal saat objek dibuat baru.
        public Mahasiswa(String nama, String nim, double ipk, String jenisBeasiswa, double penghasilanOrangTua) {
            this.nama = nama;
            this.nim = nim;
            this.ipk = ipk;
            this.jenisBeasiswa = jenisBeasiswa;
            this.penghasilanOrangTua = penghasilanOrangTua;
        }
    }

    // Main Method
    // Titik awal program berjalan. Di sini kita atur alur menu utamanya.
    // program akan menjalankan semua yang ada dalam class mahasiswa terlebih dahulu ketika semua sudah di jalankan maka akan lanjut ke 
    // siniii
    public static void main(String[] args) {
        boolean lanjut = true; // Penanda agar looping menu terus berjalan

        // Looping while: Selama 'lanjut' bernilai true, menu akan terus muncul
        while (lanjut) {
            tampilkanMenu(); // Memanggil fungsi tampilkanMenu
            
            // Menerima input dari user
            int menu = sc.nextInt();
            sc.nextLine(); // next line untuk kebawah
            
            /*
            Logika sederhana switch case untuk user bisa memilih mau menjalankan program mana 
            sesuai dengan kemauan si user, ketika memilih satu maka akan menambah mahasiswa, 2 untuk menampilkan data ,
            3 untuk mencari data, 4 untuk menghitung rata rata nya
            ke 5 untuk keluar  
            */
            switch (menu) {
                case 1:
                    tambahPendaftar(); // Masuk ke fungsi Tambah Data
                    break;
                case 2:
                    tampilkanSemua(); // Masuk ke fungsi Tampilkan Data
                    break;
                case 3:
                    cariBerdasarkanJenis(); // Masuk ke fungsi Pencarian
                    break;
                case 4:
                    hitungRataRataIPK(); // Masuk ke fungsi Hitung Rata-rata
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    lanjut = false; // menghentikan switch case untuk keluar dari loop
                    break;
                default:
                    System.out.println("Input tidak valid! Masukkan angka 1-5.");
            }
        }
    }

    /*
    Code untuk berbagai fungsi agar mudah di edit oleh sang programmer sejati
     */

    // --- menampilkan teks menu pilihan untuk user ---
    static void tampilkanMenu() {
        System.out.println("\n=== Sistem Pendaftaran Beasiswa ===");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }

    // --- Menambah Data dari user ---
    static void tambahPendaftar() {
        System.out.println("\n--- Tambah Data Pendaftar ---");
        
        System.out.print("Nama Mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("NIM: ");
        String nim = sc.nextLine();

        /*Memvalidasi ipk nya mahasiswa  */
        double ipk = 0;
        boolean ipkValid = false;
        while (!ipkValid) {
            System.out.print("IPK terakhir (0.0 - 4.0): ");
            ipk = sc.nextDouble();
            sc.nextLine(); 
            if (ipk >= 0.0 && ipk <= 4.0) {
                ipkValid = true; // Jika benar, loop berhenti
            } else {
                System.out.println("IPK tidak valid! Harus antara 0.0 s/d 4.0");
            }
        }

        // Validasi Jenis Beasiswa (Looping While)
        // User dipaksa input ulang jika salah ketik jenis beasiswa
        String jenis = "";
        boolean jenisValid = false;
        while (!jenisValid) {
            System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
            jenis = sc.nextLine();
            // equalsIgnoreCase: Cek sama atau tidak tanpa peduli huruf besar/kecil
            if (jenis.equalsIgnoreCase("Reguler") || 
                jenis.equalsIgnoreCase("Unggulan") || 
                jenis.equalsIgnoreCase("Riset")) {
                jenisValid = true; // Jika benar, loop berhenti
            } else {
                System.out.println("Input salah! Hanya boleh: Reguler, Unggulan, atau Riset.");
            }
        }

        // Input Penghasilan
        System.out.print("Penghasilan orang tua: ");
        double penghasilan = sc.nextDouble();
        sc.nextLine();

        // Logika Validasi Akhir 
        // Jika penghasilan > 2 juta, data DITOLAK
        if (penghasilan > 2000000) {
            System.out.println("Pendaftaran dibatalkan karena penghasilan melebihi batas maksimal (Rp 2.000.000).");
        } else {
            // Jika lolos, simpan data ke Array 'dataMhs' di indeks ke-'jumlahMhs'
            dataMhs[jumlahMhs] = new Mahasiswa(nama, nim, ipk, jenis, penghasilan);
            jumlahMhs++; // Naikkan counter agar data berikutnya tersimpan di indeks selanjutnya
            System.out.println("Pendaftar berhasil disimpan. Total pendaftar: " + jumlahMhs);
        }
    }

    // --- Menampilkan Semua Data ---
    static void tampilkanSemua() {
        // Cek dulu, kalau counter 'jumlahMhs' masih 0, berarti belum ada data
        if (jumlahMhs == 0) {
            System.out.println("Belum ada pendaftar.");
        } else {
            System.out.println("\n--- Data Pendaftar Beasiswa ---");
            // Header Tabel
            System.out.printf("%-20s %-12s %-5s %-12s %-15s\n", "Nama", "NIM", "IPK", "Jenis", "Penghasilan");
            System.out.println("---------------------------------------------------------------------");
            
            // Menampilkan data dari indeks 0 sampai indeks terakhir
            for (int i = 0; i < jumlahMhs; i++) {
                System.out.printf("%-20s %-12s %-5.2f %-12s Rp%-15.0f\n", 
                    dataMhs[i].nama, 
                    dataMhs[i].nim, 
                    dataMhs[i].ipk, 
                    dataMhs[i].jenisBeasiswa, 
                    dataMhs[i].penghasilanOrangTua);
            }
        }
    }

    // Pencarian ---
    static void cariBerdasarkanJenis() {
        System.out.print("Masukkan jenis beasiswa yang dicari: ");
        String keyword = sc.nextLine();
        
        System.out.println("\n--- Hasil Pencarian: " + keyword + " ---");
        boolean ditemukan = false; // Flag penanda apakah data ketemu atau tidak
        
        System.out.printf("%-20s %-12s %-5s\n", "Nama", "NIM", "IPK");
        System.out.println("---------------------------------------");

       // Algoritma Linear Search: Cek satu per satu data di array 
        for (int i = 0; i < jumlahMhs; i++) {
            // Jika jenis beasiswa di data ke-i SAMA dengan keyword yang dicari
            if (dataMhs[i].jenisBeasiswa.equalsIgnoreCase(keyword)) {
                System.out.printf("%-20s %-12s %-5.2f\n", 
                    dataMhs[i].nama, dataMhs[i].nim, dataMhs[i].ipk);
                ditemukan = true; // Ubah penanda jadi true karena data ketemu
            }
        }

        // Jika setelah looping selesai 'ditemukan' masih false, berarti tidak ada data yg cocok
        if (!ditemukan) {
            System.out.println("Tidak ada pendaftar untuk jenis beasiswa tersebut.");
        }
    }

    // --- Menghitung Rata-rata  ---
    static void hitungRataRataIPK() {
        // Variabel penampung total IPK dan jumlah orang per kategori
        double totalReg = 0, totalUng = 0, totalRis = 0;
        int countReg = 0, countUng = 0, countRis = 0;

        // Looping seluruh data untuk dikelompokkan
        for (int i = 0; i < jumlahMhs; i++) {
            if (dataMhs[i].jenisBeasiswa.equalsIgnoreCase("Reguler")) {
                totalReg += dataMhs[i].ipk; // Tambahkan IPK ke total Reguler
                countReg++;                 // Tambahkan jumlah orang Reguler
            } else if (dataMhs[i].jenisBeasiswa.equalsIgnoreCase("Unggulan")) {
                totalUng += dataMhs[i].ipk;
                countUng++;
            } else if (dataMhs[i].jenisBeasiswa.equalsIgnoreCase("Riset")) {
                totalRis += dataMhs[i].ipk;
                countRis++;
            }
        }

        System.out.println("\n--- Rata-rata IPK per Jenis Beasiswa ---");
        
        // Menampilkan hasil rata-rata.
        //  Menggunakan ternary operator ( ? : ) untuk mencegah Error "Division by Zero" (NaN)
        // Logikanya: Jika count > 0, maka hitung (total/count). Jika 0, tulis 0.0.   
        System.out.printf("Reguler : %.2f\n", (countReg > 0 ? totalReg / countReg : 0.0));
        System.out.printf("Unggulan: %.2f\n", (countUng > 0 ? totalUng / countUng : 0.0));
        System.out.printf("Riset   : %.2f\n", (countRis > 0 ? totalRis / countRis : 0.0));
    }
}