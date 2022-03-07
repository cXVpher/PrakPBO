package Bangun;

public class PersegiPanjang implements hitungBidang{
    double panjang, lebar, keliling, luas;
    
    public PersegiPanjang(){
    };
    
    public double getPanjang(){
        return panjang;
    }
    
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    
    public double getLebar(){
        return lebar;
    }
    
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getKeliling(){
        return keliling;
    }
    
    public double getLuas(){
        return luas;
    }
    
    @Override
    public void keliling() {
        keliling = 2*(panjang + lebar);
    }

    @Override
    public void luas() {
        luas = panjang*lebar;
    }
    
}
