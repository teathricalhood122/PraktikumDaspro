import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan angka : ");
        int angka = sc.nextInt();

        if (angka % 2 == 0){
            System.out.println(angka + " adalah bilangan genap");
        } else {
            System.out.println(angka + " adalah bilangan ganjil");
        }
        sc.close();
    }
}
