/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgabstract;

/**
 *
 * @author MSI
 */
public class Main {
    public static void main(String[] args) {
        SegitigaSamaKaki stsk = new SegitigaSamaKaki();
        stsk.alas = 10;
        stsk.tinggi = 4;
        stsk.hitungLuas();
        stsk.hitungKeliling();
        System.out.println("Luas STSK = "+stsk.luas);
        System.out.println("Keliling STSK = "+stsk.keliling);
        
        SegiEmpat se = new SegiEmpat();
        se.panjang = 12;
        se.lebar = 7;
        se.hitungLuas();
        se.hitungKeliling();
        System.out.println("Luas SE = "+se.luas);
        System.out.println("Keliling SE = "+se.keliling);
        
        Lingkaran lk = new Lingkaran();
        lk.jariJari = 5;
        lk.hitungLuas();
        lk.hitungKeliling();
        System.out.println("Luas LK = "+lk.luas);
        System.out.println("Keliling LK = "+lk.keliling);
    }
}