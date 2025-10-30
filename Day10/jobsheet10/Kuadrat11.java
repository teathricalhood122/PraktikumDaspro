import java.util.Scanner;

public class Kuadrat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i <=n; i++){
            int totalKuadrat = 0;
            String deretAngka = "";
        for(int j =1; j <= i; j++){
            int Kuadrat = j * j;
            totalKuadrat += Kuadrat;

            deretAngka += Kuadrat;
            if (j < i){
                deretAngka += "+";
            }
        }
        if(i == 1){
            System.out.println("n = " + i + "-> jumlah kuadrat = " + totalKuadrat);
        } else{
            System.out.println("n = " + i + " -> jumlah kuadrat = " + deretAngka + " = " + totalKuadrat);
        }
    }
    sc.close();
    }
}
