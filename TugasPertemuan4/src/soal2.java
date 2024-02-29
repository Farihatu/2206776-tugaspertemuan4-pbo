/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int batasAwal, batasAkhir, jumlahGenap, i;
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        batasAwal = masuk.nextInt();
        System.out.print("Masukkan batas akhir: ");
        batasAkhir = masuk.nextInt();

        jumlahGenap = 0;

        for (i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                jumlahGenap += i;
            }
        }
        System.out.println("Jumlah deret bilangan genap antara " + batasAwal + 
                            " dan " + batasAkhir + " adalah: " + jumlahGenap);
    }
    
}