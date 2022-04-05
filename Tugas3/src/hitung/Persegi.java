package hitung;

public class Persegi implements MenghitungBidang{
    double panjang, lebar, keliling, luas;
    
    public Persegi(){
        
    };

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public Persegi(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getKeliling() {
        return keliling;
    }

    public double getLuas() {
        return luas;
    }
    
    @Override
    public void keliling() {
        keliling = (2*panjang) + (2*lebar);
    }

    @Override
    public void luas() {
        luas = panjang*lebar;
    }
    
}
