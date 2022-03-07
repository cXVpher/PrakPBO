package Bangun;

public class Tabung extends Lingkaran implements hitungRuang{
    protected double tinggi, luaspermukaan, volume;
    
    public Tabung(){
    }
    
    public Tabung(double radius, double tinggi){
        super(radius);
        this.tinggi = tinggi;
    }
    
    public double getLuasPermukaan(){
        return luaspermukaan;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    @Override
    public void luaspermukaan() {
        this.luaspermukaan = this.keliling*this.tinggi + 2*(this.getLuas());
    }

    @Override
    public void volume() {
        this.volume = this.luas*this.tinggi;
    }
    
    public void setAll(double radius, double tinggi){
        this.setRadius(radius);
        this.setDiameter();
        this.setTinggi(tinggi);
        
        this.keliling();
        this.luas();
        this.luaspermukaan();
        this.volume();
    }
}
