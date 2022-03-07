package Bangun;

public class Balok extends PersegiPanjang implements hitungRuang{
    protected double tinggi, luaspermukaan, volume;
    
    public Balok(){
    }
    
    public Balok(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public void luaspermukaan() {
        this.luaspermukaan = 2*((this.panjang*this.lebar) + (this.panjang*this.tinggi) + (this.lebar*this.tinggi));
    }

    @Override
    public void volume() {
        this.volume = this.panjang*this.lebar*this.tinggi;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double getLuasPermukaan(){
        return luaspermukaan;
    }
    
    public void setAll(double panjang, double lebar, double tinggi){
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
        
        this.keliling();
        this.luas();
        this.luaspermukaan();
        this.volume();
    }
}











