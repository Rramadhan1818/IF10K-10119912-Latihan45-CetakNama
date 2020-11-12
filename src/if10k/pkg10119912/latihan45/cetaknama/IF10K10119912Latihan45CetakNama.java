/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan45.cetaknama;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */
public class IF10K10119912Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("===Aplikasi Pencetakkan Nama===");
        
        Scanner scn = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.print("Masukkan nama anda : ");
        printer.setNama(scn.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(scn.nextInt());
        
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
