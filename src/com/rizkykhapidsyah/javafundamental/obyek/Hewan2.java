package com.rizkykhapidsyah.javafundamental.obyek;

public class Hewan2 {
    String vNama;
    int vBerat;
    int vJumlahKaki;

    //Ini merupakan konstruktor dari kelas Hewan2. konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
    public Hewan2(String NamaHewan) {
        vNama = NamaHewan;
    }

    public void BeratHewan(int BeratHewan) {
        vBerat = BeratHewan;
    }

    public void JumlahKakiHewan(int JumlahKakiHewan) {
        vJumlahKaki = JumlahKakiHewan;
    }

    public void CetakHewan() {
        System.out.println("Nama Hewan: " + vNama);
        System.out.println("Berat Hewan: " + vBerat + " Kg");
        System.out.println("Jumlah Kaki: " + vJumlahKaki + "\n");
    }
}

