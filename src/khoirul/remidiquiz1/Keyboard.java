package khoirul.remidiquiz1;
public class Keyboard {
    //membuat attribute
    private String mrk;
    private String jenis;
    
    public Keyboard(){
        
    }

    //membuat constructor
    public Keyboard(String mrk, String jenis) {
        this.mrk = mrk;
        this.jenis = jenis;
    }

    //membuat getter dan setter melalui nsert code
    public String getMrk() {
        return mrk;
    }

    public void setMrk(String mrk) {
        this.mrk = mrk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    //membuat info untuk ditampilkan di class komputer
    public String info(){
        String info = "";
        info += this.mrk + "\n";
        info += "Jenis\t\t: " + this.jenis;
        return info;
    }
}
