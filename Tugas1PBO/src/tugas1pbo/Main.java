package tugas1pbo;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float temp;
        int pil;
        Scanner input = new Scanner(System.in);
        System.out.println("--Konversi Suhu Air--");
        System.out.println("Input Data\n");
        System.out.print("Suhu Dalam Celcius : ");
        temp = input.nextFloat();

        do {
            System.out.print("\nPilihan");
            System.out.println("----\n");
            System.out.print("1. Lihat Data Konversi\n2. Edit Data Konversi\n3. Exit\nPilih : ");
            pil = input.nextInt();
            Konversi awCelcius = new Konversi(temp);
            
            if(pil == 1){
                System.out.println("Suhu dalam Celcius    : " + temp + "°C");
                System.out.println("Suhu dalam Fahrenheit : " + awCelcius.fahrenheit() + "°F");
                System.out.println("Suhu dalam Reamur     : " + awCelcius.reamur() + "°R");
                System.out.println("Suhu dalam Kelvin     : " + awCelcius.kelvin() + "K");
                System.out.println("Kondisi air "+ awCelcius.kondisiAir()+".");
            }else if(pil == 2){
                System.out.println("Input Data");
                System.out.println("----------");
                System.out.print("Suhu dalam Celcius : ");
                temp = input.nextFloat();
            }else if(pil == 3){
                System.out.println("Program Selesai\nTerima Kasih");
            }else{
                System.out.println("Pilihan tidak tersedia, mohon masukan pilihan dengan benar!");
            }
        }while(pil != 3);
    }
    
}
