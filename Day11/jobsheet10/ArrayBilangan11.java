public class ArrayBilangan11 {
    public static void main(String[] args) {
        // int[] bil = new int[4];

        // bil[0] = 5;
        // bil[1] = 13;
        // bil[2] = -7;
        // bil[3] = 17; //Kurang efisien untuk mendeklarasikan bilangan array karena mengetik satu satu.

        int[] bil = {5, 13, -7, 17};

        System.out.println("Mencetak Elemenn Array dengan Metode Perulangan: ");
        for (int i = 0; i <=4; i++) {
            System.out.println("Elemen ke-" + i + ": " + bil[i]);
        }
        // System.out.println(bil[0]);
        // System.out.println(bil[1]);
        // System.out.println(bil[2]);
        // System.out.println(bil[3]);

    }
}
