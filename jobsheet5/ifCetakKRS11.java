package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (True/False): ");
        boolean uktLunas = input.nextBoolean();
        
        String output = uktLunas ? "Cetak KRS berhasil, silakan ambil di bagian akademik \n Jangan lupa tanda tangan DPA" 
        : "Cetak KRS gagal, silakan lunasi UKT terlebih dahulu.";
        System.out.println(output);    


        input.close();
    }

}