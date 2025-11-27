package Tugas;
import java.util.Scanner;

public class kubus11 { // Ganti 11 dengan nomor absenmu

    // Fungsi 1: Menghitung Volume Kubus (sisi x sisi x sisi)
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi 2: Menghitung Luas Permukaan Kubus (6 x sisi x sisi)
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    // Main Method buat jalanin program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int s = sc.nextInt();

        // Panggil fungsi volume
        int vol = hitungVolume(s);
        System.out.println("Volume Kubus adalah " + vol);

        // Panggil fungsi luas permukaan
        int luas = hitungLuasPermukaan(s);
        System.out.println("Luas Permukaan Kubus adalah " + luas);
    }
}

