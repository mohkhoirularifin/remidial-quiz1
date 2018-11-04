package khoirul.remidiquiz1;
public class Cpu {
    //membuat attribute
    private String processor;
    private String generasi;
    
    public Cpu(){
        
    }

    //membuat constructor
    public Cpu(String processor, String generasi) {
        this.processor = processor;
        this.generasi = generasi;
    }

    //membuat getter dan setter melalui insert code
    public String getGenerasi() {
        return generasi;
    }

    public void setGenerasi(String generasi) {
        this.generasi = generasi;
    }

    
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    
    //membuat info untuk ditampilkan di class komputer
    public String info(){
        String info = "";
        info += this.processor + "\n";
        info += "Generasi\t: " + this.generasi;
        return info;
    }
}
