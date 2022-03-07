package tugas2;

import Bangun.Balok;
import Bangun.Tabung;
import java.util.Scanner;

public class Tugas2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Balok balok = new Balok();
        Tabung tabung = new Tabung();
        
        int rep = 1;
        
        while(rep == 1){
            System.out.println("============");
            System.out.println(" Menu Utama ");
            System.out.println("============");
            
            System.out.println("1. Hitung Balok\n2. Hitung Tabung\n0. Exit");
            System.out.print("Pilih : ");
            
            int pilihan = input.nextInt();
            
            switch(pilihan){
                case 1 :{
                    System.out.print("Input Panjang : ");
                    double panjang = input.nextDouble();
                    System.out.print("Input Lebar : ");
                    double lebar = input.nextDouble();
                    System.out.print("Input Tinggi : ");
                    double tinggi = input.nextDouble();
                    
                    balok.setAll(panjang, lebar, tinggi);
                    
                    System.out.println("Luas Persegi Panjang : " + balok.getLuas());
                    System.out.println("Keliling Persegi Panjang : " + balok.getKeliling());
                    System.out.println("Volume Balok : " + balok.getVolume());
                    System.out.println("Luas Permukaan Balok : " + balok.getLuasPermukaan());
                    
                    rep = konfirmasi();
                    
                    break;
                }
                
                case 2 :{
                    System.out.print("Input Tinggi : ");
                    double tinggi = input.nextDouble();
                    System.out.print("Input Jari-jari : ");
                    double radius = input.nextDouble();
                    
                    tabung.setAll(radius, tinggi);
                    
                    System.out.println("Luas Lingkaran : " + tabung.getLuas());
                    System.out.println("Keliling Lingkaran : " + tabung.getKeliling());
                    System.out.println("Volume Tabung : " + tabung.getVolume());
                    System.out.println("Luas Permukaan Tabung : " + tabung.getLuasPermukaan());
                    
                    rep = konfirmasi();
                    
                    break;
                }
            }
        }
    }
    
    public static int konfirmasi(){
        System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
        return input.nextInt();
    }
}
