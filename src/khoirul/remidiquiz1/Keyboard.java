package khoirul.remidiquiz1;
public class Keyboard {
    private String mrk;
    private String jenis;
    
    public Keyboard(){
        
    }

    public Keyboard(String mrk, String jenis) {
        this.mrk = mrk;
        this.jenis = jenis;
    }

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
    
    public String info(){
        String info = "";
        info += this.mrk + "\n";
        info += "Jenis\t\t: " + this.jenis;
        return info;
    }
}
