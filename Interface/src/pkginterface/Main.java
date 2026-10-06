/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author MSI
 */
public class Main {
    public static void main(String[] args) {
        SegiEmpat se = new SegiEmpat();
        se.lebar = 10;
        se.panjang = 10;
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas sebelum diperbesar = "+se.luas);
        System.out.println("Keliling sebelum diperbesar = "+se.keliling);
        se.perbesar();
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas setelah diperbesar = "+se.luas);
        System.out.println("Keliling setelah diperbesar = "+se.keliling);
    }
}
