/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Praktikan
 */
public class Kalkulator {
    public static void main(String[] args) {
        
    SetterGetter may = new SetterGetter();
        System.out.println("PENJUMLAHAN");
        may.setAngka1(20);
        may.setAngka2(100);
        System.out.println("Angka 1  = " + may.getAngka1());
        System.out.println("Angka 2  = " + may.getAngka2());
        System.out.println(may.getAngka1() + " + " + may.getAngka2() + " = "+ may.getJumlah());
        System.out.println("");
        
        System.out.println("PENGURANGAN");
        may.setAngka1(50);
        may.setAngka2(37);
        System.out.println("Angka 1  = " + may.getAngka1());
        System.out.println("Angka 2  = " + may.getAngka2());
        System.out.println(may.getAngka1() + " - " + may.getAngka2() + " = "+ may.getKurang());
        System.out.println("");
        
        System.out.println("PERKALIAN");
        may.setAngka1(13);
        may.setAngka2(9);
        System.out.println("Angka 1  = " + may.getAngka1());
        System.out.println("Angka 2  = " + may.getAngka2());
        System.out.println(may.getAngka1() + " * " + may.getAngka2() + " = "+ may.getKali());
        System.out.println("");
        
        System.out.println("PEMBAGIAN");
        may.setAngka1(81);
        may.setAngka2(9);
        System.out.println("Angka 1  = " + may.getAngka1());
        System.out.println("Angka 2  = " + may.getAngka2());
        System.out.println(may.getAngka1() + " / " + may.getAngka2() + " = "+ may.getBagi());
}
}