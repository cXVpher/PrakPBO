package hitung;

public class Balok extends Persegi implements MenghitungRuang{
    protected double tinggi, volume,luasPermukaan;
    
    public Balok(){
        
    }
    
    public Balok(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
        
        this.keliling();
        this.luas();
        this.luasPermukaan();
        this.volume();
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
    
    @Override
    public void luasPermukaan() {
        this.luasPermukaan = 2*((this.panjang*this.lebar) + (this.panjang*this.tinggi) + (this.lebar*this.tinggi));
    }

    @Override
    public void volume() {
        this.volume = this.panjang*this.lebar*this.tinggi;
    }
    
    public void setAll(double panjang, double lebar, double tinggi){
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
        
        this.keliling();
        this.luas();
        this.luasPermukaan();
        this.volume();
    }
}
