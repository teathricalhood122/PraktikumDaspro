import java.util.Scanner;
public class Tugas1 {
    static int totalRekursif(int[] data, int index) {
        if (index < 0) {
            return 0;
        } else {
            return data[index] +totalRekursif(data, index-1);
        }
    }

    static int totalIteratif(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N =  sc.nextInt();
        int[] data = new int[N];

        for (int i = N-1; i >= 0; i--) {
            System.out.print("Masukkan angka ke-"+(i+1)+": ");
            data[i] = sc.nextInt();
            sc.nextLine();
        }

        int totalR = totalRekursif(data, N-1);
        int totalI = totalIteratif(data);

        System.out.println("Total dari "+N+" angka (Rekursif): "+totalR);
        System.out.println("Total dari "+N+" angka (Iteratif): "+totalI);
        sc.close();
    }
}
