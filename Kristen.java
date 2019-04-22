package pbo8;

public class Kristen extends Manusia{
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
        System.out.println("Kristen : ");
        System.out.println("Sembahyang\n");
    }

}
