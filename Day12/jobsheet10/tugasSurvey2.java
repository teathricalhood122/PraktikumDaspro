import java.util.Scanner;

public class tugasSurvey2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int survey[][] = new int[3][6];
        double rata2;
        double total;

        System.out.println("Input Data Survey Kepuasan Pelanggan");
        System.out.println();

        for (int i = 0; i < survey.length; i++) {
            total = 0;
            System.out.println("Responden ke-" + (i+1));

            for (int j = 0; j < survey[i].length; j++) {
                System.out.println("Pertanyaan ke-" + (j+1));
                survey[i][j] = sc.nextInt();
                total += survey[i][j];
            }

            rata2 = total / survey[i].length;
            System.out.println("Rata-rata responden ke-" + (i+1) + "adalah: " + rata2 ) ;
            System.out.println();
        }
    }
}
