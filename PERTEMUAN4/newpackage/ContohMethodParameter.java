/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN4.newpackage;

/**
 *
 * @author LULUK
 */
public class ContohMethodParameter {
    void LuasSegitiga(int alas,int tinggi){
        int a=alas;
        int t=tinggi;
        double L=0.5*a*t;
        System.out.println("Luas Segitiga="+L);
    }
    //CONTOH FUNGSI PARAMETER
    double LuasLingkaran(double jari2){
        double phi=3.14;
        double r=jari2;
        double L=phi*r*r;
        System.out.println("Luas Lingkaran="+L);
        return L;
    }
    public static void main(String[] args) {
        ContohMethodParameter Prosedur=new ContohMethodParameter();
        Prosedur.LuasSegitiga(10,5);
        ContohMethodParameter Fungsi=new ContohMethodParameter();
        Fungsi.LuasLingkaran(7.0);       
    }
}

