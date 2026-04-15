/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN4.newpackage;

/**
 *
 * @author LULUK
 */
public class ContohMETHOD {
   //contoh Prosedur
    void LuasPersegiPanjang(){
        int p=10;
        int l=5;
        int L=p*l;
        System.out.println("Luas Persegi Panjang="+L);
    }
    //contoh Fungsi
    int LuasPersegi(){
        int sisi=10;
        int L=sisi*sisi;
        System.out.println("Luas Persegi Panjang="+L);
        return L;
    }
    //psvm untuk mengerun
    public static void main(String[] args) {
        ContohMETHOD Prosedur=new ContohMETHOD();
        Prosedur.LuasPersegiPanjang();
        ContohMETHOD Fungsi=new ContohMETHOD();
        Fungsi.LuasPersegi();  
    }
    
}
