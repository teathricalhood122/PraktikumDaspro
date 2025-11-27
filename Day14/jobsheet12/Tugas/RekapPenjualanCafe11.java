package Tugas;

import java.util.Scanner;

public class RekapPenjualanCafe11 {

    static void inputPenjualan(int[][] data, String[] namaMenu, Scanner sc) {
        System.out.println("\n--- Input Data Penjualan ---");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Input penjualan untuk menu: " + namaMenu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilkanData(int[][] data, String[] namaMenu) {
        System.out.println("\n--- Tabel Rekap Penjualan ---");
        System.out.printf("%-20s", "Menu"); 
        
        for (int j = 0; j < data[0].length; j++) {
            System.out.printf("%-10s", "Hari ke " + (j + 1));
        }
        System.out.println(); 

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-20s", namaMenu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-10d", data[i][j]);
            }
            System.out.println(); 
        }
    }

    static void menuTertinggi(int[][] data, String[] namaMenu) {
        int maxPenjualan = 0;
        String menuJuara = "";
        for (int i = 0; i < data.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < data[i].length; j++) {
                totalPerMenu += data[i][j];
            }
            if (totalPerMenu > maxPenjualan) {
                maxPenjualan = totalPerMenu;
                menuJuara = namaMenu[i];
            }
        }
        System.out.println("\n--- Menu Terlaris ---");
        System.out.println("Menu dengan penjualan tertinggi adalah: " + menuJuara);
        System.out.println("Total penjualan: " + maxPenjualan);
    }

    static void rataRata(int[][] data, String[] namaMenu) {
        System.out.println("\n--- Rata-Rata Penjualan ---");
        for (int i = 0; i < data.length; i++) {
            double total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            double rata = total / data[i].length;
            System.out.printf("Rata-rata %-15s: %.2f\n", namaMenu[i], rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumHari = sc.nextInt();
        sc.nextLine(); 

        String[] namaMenu = new String[jumMenu];
        int[][] dataPenjualan = new int[jumMenu][jumHari];

        System.out.println("Masukkan nama-nama menu:");
        for(int i=0; i<jumMenu; i++){
            System.out.print("Nama Menu ke-" + (i+1) + ": ");
            namaMenu[i] = sc.nextLine();
        }

        inputPenjualan(dataPenjualan, namaMenu, sc);
        tampilkanData(dataPenjualan, namaMenu);
        menuTertinggi(dataPenjualan, namaMenu);
        rataRata(dataPenjualan, namaMenu);
    }
}

