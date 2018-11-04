package khoirul.remidiquiz1;
public class Komputer {
    private String merk;
    private String tipe;
    private Mouse nama;
    private Keyboard jenis;
    private Cpu processor;
    private int harga;
    
    public Komputer(){
        
    }

    public Komputer(String merk, String tipe, Mouse nama, Keyboard jenis, Cpu processor, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.nama = nama;
        this.jenis = jenis;
        this.processor = processor;
        this.harga = harga;
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

    public Cpu getProcessor() {
        return processor;
    }

    public void setProcessor(Cpu processor) {
        this.processor = processor;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public String info(){
        String info = "";
        info += "Merk\t\t: " + this.merk + "\n";
        info += "Tipe\t\t: " + this.tipe + "\n";
        info += "Mouse\t\t: " + this.nama.info() + "\n";
        info += "Keyboard\t: " + this.jenis.info() + "\n";
        info += "Processor\t: " + this.processor.info() + "\n";
        info += "Harga\t\t: Rp." + this.harga + "\n";
        return info;
    }
}
