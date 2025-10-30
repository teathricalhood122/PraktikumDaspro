import java.util.Scanner;

public class NilaiKelompok11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =1;
        double totalNilai;
        int j= 1;
        double rataNilai;
        int Nilai;
        double rataTertinggi = 0;
        int kelompokTerbaik =0;
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
        if(rataNilai > rataTertinggi){
            rataTertinggi = rataNilai;
            kelompokTerbaik = i;
        }
        i++;
        System.out.println();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Kelompok dengan rata rata tertinggi adalah :");
        System.out.println("Kelompok " + kelompokTerbaik + " dengan nilai " + rataTertinggi);

        sc.close();

    }
}
