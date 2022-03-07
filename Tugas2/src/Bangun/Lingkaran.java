package Bangun;

public class Lingkaran implements hitungBidang{
    protected double radius, diameter, keliling, luas;
    
    public Lingkaran(){
    };
    
    public Lingkaran(double radius){
        this.radius = radius;
        this.diameter = 2*radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getDiameter(){
        return diameter;
    }
    
    public void setDiameter(){
        this.diameter = 2*this.radius;
    }
    
    public double getKeliling(){
        return keliling;
    }
    
    public void setKeliling(double keliling){
        this.keliling = keliling;
    }
    
    public double getLuas(){
        return luas;
    }
    
    public void setLuas(double luas){
        this.luas = luas;
    }
    
    @Override
    public void keliling() {
        keliling = 3.14*diameter;
    }

    @Override
    public void luas() {
        luas = 3.14*radius*radius;
    }
    
}
