import java.util.Scanner;

public class bioskopWithScanner11 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[][] penonton = new String[4][2];
        int baris, kolom;
        String nama;

        // --- (SOAL 2) 
        while (true) {
            System.out.println("--- MENU BIOSKOP 11 ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            
            if (!sc.hasNextInt()) {
                System.out.println("Pilihan tidak valid. Masukkan angka 1, 2, atau 3.");
                sc.next(); 
                continue;  
            }
            
            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.println("--- Input Data Penonton ---");
                    System.out.print("Masukan Nama: ");
                    nama = sc.nextLine();
                    
                    // Loop untuk validasi kursi (Soal 3 & 4)
                    while(true) {
                        System.out.print("Masukan Baris (1-4): ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Input baris harus angka!");
                            sc.next(); 
                            continue;
                        }
                        baris = sc.nextInt();
                        
                        System.out.print("Masukan Kolom (1-2): ");
                        if (!sc.hasNextInt()) {
                            System.out.println("Input kolom harus angka!");
                            sc.next(); 
                            continue;
                        }
                        kolom = sc.nextInt();
                        sc.nextLine(); 

                        // Konversi ke 0-based index
                        int idxBaris = baris - 1;
                        int idxKolom = kolom - 1;

                        // (SOAL 3) Handle kursi tidak tersedia
                        if (idxBaris >= 0 && idxBaris < penonton.length && idxKolom >= 0 && idxKolom < penonton[0].length) {
                            
                            // (SOAL 4) Handle kursi sudah terisi 
                            if (penonton[idxBaris][idxKolom] == null) {
                                penonton[idxBaris][idxKolom] = nama;
                                System.out.println("Data " + nama + " berhasil disimpan di kursi " + baris + "-" + kolom + ".");
                                break; 
                            } else {
                                System.out.println("Maaf, kursi " + baris + "-" + kolom + " sudah terisi oleh " + penonton[idxBaris][idxKolom] + ".");
                                System.out.println("Silakan pilih kursi lain.");
                            }
                        } else {
                            System.out.println("Kursi tidak tersedia. Masukkan baris (1-4) dan kolom (1-2).");
                        }
                    }
                    break; 

                case 2:
                    // (SOAL 5) 
                    System.out.println("--- Daftar Penonton ---");
                    System.out.println("=========================");
                    System.out.println("BARIS\tKOLOM 1\tKOLOM 2");
                    System.out.println("-------------------------");
                    
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris " + (i + 1) + "\t");
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t"); 
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println(); 
                    }
                    System.out.println("=========================");
                    break; 

                case 3:
                    // --- Menu 3: Exit ---
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    sc.close(); 
                    System.exit(0); 

                default:
                    System.out.println("Pilihan menu tidak valid. Coba lagi.");
            }
            
            System.out.println("\n(Tekan Enter untuk kembali ke menu...)");
            sc.nextLine(); 
        }
    }
}