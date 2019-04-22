package pbo8;

public class Islam extends Manusia{

    @Override
    void orang() {
        System.out.println("Nama : ");
        String nama = in.next();
    }
    @Override
    void umur() {
        System.out.println("Umur : ");
        String usia = in.next();
    }
    protected void Ibadah() {
        System.out.println("Macam-macam Ibadah");
        System.out.println("Islam : ");
        System.out.println("Syahadat");
        System.out.println("Sholat");
        System.out.println("Puasa");
        System.out.println("Zakat");
        System.out.println("Haji bila mampu\n");
    }

}
