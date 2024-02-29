/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, pbt;
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan bilangan a: ");
        a = masuk.nextInt();
        System.out.print("Masukkan bilangan b: ");
        b = masuk.nextInt();

        do {
            pbt = b;
            b = a % b;
            a = pbt;
        } while (b != 0);
        System.out.println("Pembagi Bersama Terbesar "
                + "dari a dan b adalah: " + pbt);
    }
    
}