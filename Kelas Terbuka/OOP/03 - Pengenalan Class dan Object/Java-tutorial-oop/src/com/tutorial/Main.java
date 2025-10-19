package com.tutorial;

//membuat class sebagai template
class Mahasiswa{
    String nama;
    String nim;
    String jurusan;
    double ipk;
    int umur;
}



public class Main {
    public static void main(String[] args) throws Exception {
        //intansi object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Haikal";
        mahasiswa1.nim = "411242044";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.ipk = 3.8;
        mahasiswa1.umur = 20;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.ipk);
        System.out.println(mahasiswa1.umur);

                
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Frastiawan";
        mahasiswa2.nim = "411242043";
        mahasiswa2.jurusan = "Teknik Informatika";
        mahasiswa2.ipk = 4.0;
        mahasiswa2.umur = 20;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.nim);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.ipk);
        System.out.println(mahasiswa2.umur);

    }
}