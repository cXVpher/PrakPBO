package kuis;
import hitung.Android;
import hitung.WebDev;
import java.util.Scanner;

public class KuisPBO {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int form,menu;
        boolean ulang = true;
        
        System.out.println("FORM PENDAFTARAN PT LIES MAKNYUS");
        System.out.println("1. Android Development\n2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        form = input.nextInt();
        
        System.out.println("");
        
        switch(form){
                   
        
            case 1 : {
            
                Android andro = new Android();
                
                Scanner input2 = new Scanner(System.in);
                Scanner input3 = new Scanner(System.in);

                System.out.println("FORM PENDAFTARAN");
                 System.out.print("Input NIK : ");
                 andro.setNik(input2.nextLine());
                 System.out.print("Input Nama : ");
                 andro.setNama(input3.nextLine());
                
                editAndro(andro,input);
                
                
                while(ulang == true){
                 
                     System.out.println("\nMenu :");
                     System.out.println("1. Edit\n2. Tampil\n3. Exit");
                     System.out.print("Pilih : ");
                     menu = input.nextInt();
                     
                     switch(menu){
                     
                         case 1 : {
                                    System.out.println("\nFORM EDIT");
                                    editAndro(andro,input);
                                    break;
                         }
                         
                         case 2 : {
                                    hasilAndro(andro);
                                    break;
                         }
                         case 3 : {
                                    ulang = false;
                                    break;
                         }
                         
                     }
                 
                 }
            
            break;
            }
        
            
            case 2 : {
            
                WebDev web = new WebDev();
                
                Scanner input2 = new Scanner(System.in);
                Scanner input3 = new Scanner(System.in);

                System.out.println("FORM PENDAFTARAN");
                 System.out.print("Input NIK : ");
                 web.setNik(input2.nextLine());
                 System.out.print("Input Nama : ");
                 web.setNama(input3.nextLine());
                
                editWeb(web,input);
                
                while(ulang == true){
                 
                     System.out.println("\nMenu :");
                     System.out.println("1. Edit\n2. Tampil\n3. Exit");
                     System.out.print("Pilih : ");
                     menu = input.nextInt();
                     
                     switch(menu){
                     
                         case 1 : {
                                    System.out.println("\nFORM EDIT");
                                    editWeb(web,input);
                                    break;
                         }
                         
                         case 2 : {
                                    hasilWeb(web);
                                    break;
                         }
                         case 3 : {
                                    ulang = false;
                                    break;
                         }
                         
                     
                     }
                 
                 }
            
                break;
            }
        }    
    }
    
    public static void editAndro(Android andro,Scanner input){

         
         System.out.print("Input Nilai Tes Tulis : ");
         andro.setNilait(input.nextFloat());
         System.out.print("Input Nilai Tes Coding : ");
         andro.setNilaic(input.nextFloat());
         System.out.print("Input Nilai Tes Wawancara : ");
         andro.setNilaiw(input.nextFloat());

    }
    
    public static void hasilAndro(Android andro){
        
        andro.hitungBobot();
   
        System.out.println("Nilai Akhir : " + andro.getHasil());
        if(andro.getHasil()>= 85){
            System.out.println("Keterangan : Lolos");
            System.out.println("Selamat kepada " + andro.getNama() + " telah diterima sebagai Android");
        }else{
            System.out.println("Keterangan : Gagal");
            System.out.println("Mohon maaf kepada " + andro.getNama() + " telah ditolak sebagai Android");
        } 
    
    }
    
    public static void editWeb(WebDev web,Scanner input){
        
         
         System.out.print("Input Nilai Tes Tulis : ");
         web.setNilait(input.nextFloat());
         System.out.print("Input Nilai Tes Coding : ");
         web.setNilaic(input.nextFloat());
         System.out.print("Input Nilai Tes Wawancara : ");
         web.setNilaiw(input.nextFloat());

    }
    
    public static void hasilWeb(WebDev web){
        
        web.hitungBobot();
        
        System.out.println("Nilai Akhir : " + web.getHasil());
        if(web.getHasil()>= 85){
            System.out.println("Keterangan : Lolos");
            System.out.println("Selamat kepada " + web.getNama() + " telah diterima sebagai Web");
        }else{
            System.out.println("Keterangan : Gagal");
            System.out.println("Mohon maaf kepada " + web.getNama() + " telah ditolak sebagai Web");
        } 
    
    }
    
    
}
