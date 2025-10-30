import java.util.Scanner;

public class Triangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai n = ");
        int n = sc.nextInt();
        int i = 1; //merubah inisiasi awal dari 0 menjadi 1
        while (i<= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");//mengggunakan print tidak prinln
                j++;               
            }
            System.out.println();//menambahkan println untuk baris agar bisa menjadi pola
            i++; //menambah baris
        }
        sc.close();
    }
}
