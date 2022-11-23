/**
 *
 * @author Amdzak
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CREATE SCANNER OBJEK
        Scanner input = new Scanner(System.in);
        
        //TIPE DATA
        double total,diskon,bayar;
        
        //INPUT USER
        System.out.println("=== Program Diskon Sederhana ===");
        System.out.print("Masukan total belanja anda : ");
        total = input.nextDouble();
        
        //IF ELSE
        if (total > 100000){
            diskon = total * 0.3;
            bayar = total - diskon;
            System.out.println("\nSelamat anda mendapatkan diskon 30% \nkarena belanja di atas Rp 100.000");
            System.out.println("Total pembayaran anda menjadi : Rp " + (int)bayar);
        } else {
            System.out.println("Total belanja anda sebanyak : Rp " + (int)total);
        }
    }
}
