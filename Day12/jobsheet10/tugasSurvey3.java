import java.util.Scanner;

public class tugasSurvey3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int survey[][] = new int[3][6];
        System.out.println("Input Data Survey Kepuasan Pelanggan");
        System.out.println();

        for (int i = 0; i < survey.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survey[i].length; j++) {
                System.out.println("Pertanyaan ke-" + (j+1) + ": ");
                survey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Rata Rata Per Pertanyaan");
        for (int j = 0; j < survey[0].length; j++) {
            int totalPertanyaan = 0;

            for (int i = 0; i < survey.length; i++) {
                totalPertanyaan += survey[i][j];
            }

            double rataPertanyaan = (double) totalPertanyaan/ survey.length;
            System.out.println("Pertanyaan ke-" + (j+1) + ": " +rataPertanyaan );
        }
        
    }
}
