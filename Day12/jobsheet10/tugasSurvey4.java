import java.util.Scanner;

public class tugasSurvey4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int survey[][] = new int[3][6];
        int totalSemua = 0;
        int jumlahData = survey.length * survey[0].length;

        System.out.println("Input Data Survey Kepuasan Pelanggan");
        System.out.println();

        for (int i = 0; i < survey.length; i++) {
            System.out.println("Responden ke-" + (i+1));
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("Pertanyaan ke-" + (j+1) + ": " );
                survey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < survey.length; i++) {
            for (int j = 0; j < survey[i].length; j++) {
                totalSemua += survey[i][j];
            }
        }

        double rataKeseluruhan = (double) totalSemua / jumlahData;
        System.out.println("\n Rata rata Keseluruhan");
        System.out.println("Nilai rata-rata keseluruhan: " + rataKeseluruhan);

    }
}
