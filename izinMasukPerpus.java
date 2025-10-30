import java.util.Scanner;
public class izinMasukPerpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang di Perpustakaan");
        System.out.print("Apakah anda sudah memiliki kartu anggota perpustakaan? (True/False): ");
        boolean kartuPerpus= sc.nextBoolean();

        System.out.println("Apakah anda sudah melakukan pendaftaran online? (True/False): ");
        boolean daftarOnline =sc.nextBoolean();

        if (kartuPerpus || daftarOnline){
            System.out.println("Anda diperbolehkan masuk ke perpustakaan");
        } else {
            System.out.println("Anda tidak diperbolehkan masuk ke perpustakaan");
        }
        sc.close();
    }
}
