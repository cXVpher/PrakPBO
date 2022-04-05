package hitung;

public class Android extends Output implements Pembobotan{

    public Android() {
    }

    
    @Override
    public void hitungBobot() {
        float hasil;
        hasil = (float)((0.2*this.nilait) + (0.5*this.nilaic) + (0.3*this.nilaiw));
        
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
