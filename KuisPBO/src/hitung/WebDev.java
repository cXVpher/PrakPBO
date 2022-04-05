package hitung;

public class WebDev extends Output implements Pembobotan{
    
    @Override
    public void hitungBobot() {
        float hasil;
        
        hasil = (float) ((0.4*this.nilait) + (0.35*this.nilaic) + (0.25*this.nilaiw));
        
        this.hasil = hasil;
    }

    @Override
    public void editNilai(float a, float b, float c) {
        this.nilait = nilait;
        this.nilaic = nilaic;
        this.nilaiw = nilaiw;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getHasil() {
        return hasil;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNilait(float nilait) {
        this.nilait = nilait;
    }

    public void setNilaic(float nilaic) {
        this.nilaic = nilaic;
    }

    public void setNilaiw(float nilaiw) {
        this.nilaiw = nilaiw;
    }
    
}
