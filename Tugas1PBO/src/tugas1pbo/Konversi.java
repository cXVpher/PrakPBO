package tugas1pbo;

public class Konversi {
    float celcius;
    Main data = new Main();
    public Konversi(float celcius){
        this.celcius = celcius;
    }
    float fahrenheit(){
        return (((9*celcius)/5)+32);
    }
    float reamur (){
        return (4*celcius)/5;
    }
    float kelvin (){
        return (float) (celcius + 273.15);
    }
    
    String kondisiAir(){
        if (celcius <= 0) {
           return "Beku";
        }
        else if (celcius >= 100) {
            return "Mendidih";
        }
        else {
            return "Normal";
        }
    }
}
