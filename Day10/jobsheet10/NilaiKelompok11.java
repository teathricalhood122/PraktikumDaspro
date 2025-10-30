import java.util.Scanner;

public class NilaiKelompok11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =1;
        double totalNilai;
        int j= 1;
        double rataNilai;
        int Nilai;
        while (i <= 6) {
            System.out.println("Kelompok "+ i);
            totalNilai = 0;
             for(j=1; j <= 5; j++ ){
            System.out.print("Nilai dari Kelompok Penilai " + j + " : ");
            Nilai = sc.nextInt();
            totalNilai += Nilai;

        }

        rataNilai = totalNilai / 5;
        System.out.println("Kelompok" + i + ": nilai rata-rata = " + rataNilai);
        i++;
        }
    }
}
