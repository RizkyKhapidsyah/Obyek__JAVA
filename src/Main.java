import com.rizkykhapidsyah.javafundamental.obyek.Hewan;
import com.rizkykhapidsyah.javafundamental.obyek.Hewan2;

public class Main {
    public static void main(String[] args) {

        //Bagian 1: Menciptakan Obyek Dengan Nama 'ObyekHewan'
        System.out.println("--Bagian 1--");
        Hewan ObyekHewan = new Hewan();
        ObyekHewan.CetakNama("Elang" + "\n");

        //Bagian 2:
        System.out.println("--Bagian 2--");
        Hewan2 Elang = new Hewan2("Elang");
        Hewan2 Kucing = new Hewan2("Kucing");

        Elang.BeratHewan(5);
        Elang.JumlahKakiHewan(2);
        Elang.CetakHewan();

        Kucing.BeratHewan(2);
        Kucing.JumlahKakiHewan(4);
        Kucing.CetakHewan();
    }
}
