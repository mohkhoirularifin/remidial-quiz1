package khoirul.remidiquiz1;
public class Mouse {
    private String nama;
    private String produk;
    
    public Mouse(){
        
    }

    public Mouse(String nama, String produk) {
        this.nama = nama;
        this.produk = produk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProduk() {
        return produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
    }
    
    public String info(){
        String info = "";
        info += this.nama + "\n";
        info += "Produk Mouse\t: " + this.produk;
        return info;
    }
}
