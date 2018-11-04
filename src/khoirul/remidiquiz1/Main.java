package khoirul.remidiquiz1;
public class Main {
    public static void main(String[] args) {
        //mengisi hal yang dibutuhkan
        Mouse nama = new Mouse ("Razer","Razer One");
        Keyboard jenis = new Keyboard ("Razer","USB");
        Cpu processor = new Cpu ("Intel Core i9","9900HQ");
        Komputer komputer = new Komputer ("ASUS AIO","Gaming PC", nama, jenis, processor, 35000000, 0.75f);
        
        System.out.println("\tKhoirul Comp. ");
        //pemanggilan semua info yang ada pada class komputer
        System.out.println(komputer.info());
    }
    
}
