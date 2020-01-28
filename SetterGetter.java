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
public class SetterGetter {

   int angka1;
   int angka2;
   int total;
   int jumlah;
   int kurang;
   int kali;
   int bagi;

    public int getAngka1() {
        return angka1;
    }

    public void setAngka1(int angka1) {
        this.angka1= angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }

    public int getJumlah(){
        jumlah = angka1 + angka2;
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getKurang() {
        kurang = angka1 - angka2;
        return kurang;
    }

    public void setKurang(int kurang) {
        this.kurang = kurang;
    }

    public int getKali() {
        kali = angka1*angka2;
        return kali;
    }

    public void setKali(int kali) {
        this.kali = kali;
    }

    public int getBagi() {
        bagi = angka1/angka2;
        return bagi;
    }

    public void setBagi(int bagi) {
        this.bagi = bagi;
    }
    
    

    }
    
