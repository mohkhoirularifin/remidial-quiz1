package khoirul.remidiquiz1;
public class Komputer {
    private String merk;
    private String tipe;
    private Mouse nama;
    private Keyboard jenis;
    private Cpu generasi;
    private int harga;
    private float diskon;
    
    public Komputer(){
        
    }

    public Komputer(String merk, String tipe, Mouse nama, Keyboard jenis, Cpu generasi, int harga, float diskon) {
        this.merk = merk;
        this.tipe = tipe;
        this.nama = nama;
        this.jenis = jenis;
        this.generasi = generasi;
        this.harga = harga;
        this.diskon = diskon;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public Mouse getNama() {
        return nama;
    }

    public void setNama(Mouse nama) {
        this.nama = nama;
    }

    public Keyboard getJenis() {
        return jenis;
    }

    public void setJenis(Keyboard jenis) {
        this.jenis = jenis;
    }

    public Cpu getGenerasi() {
        return generasi;
    }

    public void setGenerasi(Cpu generasi) {
        this.generasi = generasi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public float getDiskon() {
        return diskon;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    public int setTotal(){
        return harga = (int) (harga * diskon);
    }
    
    public String info(){
        String info = "";
        info += "Merk\t\t: " + this.merk + "\n";
        info += "Tipe\t\t: " + this.tipe + "\n";
        info += "Mouse\t\t: " + this.nama.info() + "\n";
        info += "Keyboard\t: " + this.jenis.info() + "\n";
        info += "Processor\t: " + this.generasi.info() + "\n";
        info += "Harga\t\t: Rp. " + this.harga + "\n";
        info += "Diskon\t\t: " + this.getDiskon() + "%\n";
        info += "Harga Bersih\t: Rp. " + this.setTotal();
        return info;
    }
}
