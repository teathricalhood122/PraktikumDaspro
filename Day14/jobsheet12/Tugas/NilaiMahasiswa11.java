package Tugas;

import java.util.Scanner;

public class NilaiMahasiswa11 {

    // a. Fungsi isianArray
    // Tugas: Mengisi array dengan inputan user
    static void isianArray(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
    }

    // b. Fungsi tampilArray
    // Tugas: Menampilkan semua nilai di dalam array
    static void tampilArray(int[] array) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + array[i]);
        }
    }

    // c. Fungsi hitTot
    // Tugas: Menghitung total nilai (Return value berupa int)
    static int hitTot(int[] array) {
        int total = 0;
        for (int nilai : array) {
            total += nilai;
        }
        return total;
    }

    // d. Fungsi Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Baca nilai N (jumlah mahasiswa)
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        // 2. Buat array dengan ukuran N
        int[] nilaiMhs = new int[N];

        // 3. Panggil fungsi isianArray (kirim array kosong & scanner)
        isianArray(nilaiMhs, sc);

        // 4. Panggil fungsi tampilArray
        tampilArray(nilaiMhs);

        // 5. Panggil fungsi hitTot dan simpan hasilnya
        int totalNilai = hitTot(nilaiMhs);

        // 6. Tampilkan total nilai
        System.out.println("\nTotal nilai seluruh mahasiswa adalah: " + totalNilai);
    }
}

