import java.util.Scanner;

public  class TugasSearchKafe11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappucino", 
            "Chocolate Ice"
        };
        
        System.out.println("===== MENU KAFE =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("- " + menu[i]);
        }
        System.out.println("=====================");
        
        System.out.print("Masukkan nama makanan yang dicari: ");
        String key = sc.nextLine(); 

        boolean ditemukan = false; 
        
     
        for (int i = 0; i < menu.length; i++) {
            
            
            if (menu[i].equalsIgnoreCase(key)) {
                
                ditemukan = true;
                break;            
            }
        }

        System.out.println(); 
        
        if (ditemukan) {
            System.out.println("Pesanan '" + key + "' TERSEDIA di menu.");
        } else {
            System.out.println("Maaf, pesanan '" + key + "' TIDAK ADA di menu.");
        }
        
        sc.close();
    }
}