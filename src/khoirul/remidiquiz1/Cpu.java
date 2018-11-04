package khoirul.remidiquiz1;
public class Cpu {
    private String processor;
    
    public Cpu(){
        
    }

    public Cpu(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    
    public String info(){
        String info = "";
        info += this.processor;
        return info;
    }
}
