package Tugas;

import java.util.Scanner;

public class NilaiMahasiswa11 {

  
    static void isianArray(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
    }

  
    static void tampilArray(int[] array) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + array[i]);
        }
    }

   
    static int hitTot(int[] array) {
        int total = 0;
        for (int nilai : array) {
            total += nilai;
        }
        return total;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

      
        int[] nilaiMhs = new int[N];

        isianArray(nilaiMhs, sc);

        tampilArray(nilaiMhs);

      
        int totalNilai = hitTot(nilaiMhs);

   
        System.out.println("\nTotal nilai seluruh mahasiswa adalah: " + totalNilai);
    }
}

