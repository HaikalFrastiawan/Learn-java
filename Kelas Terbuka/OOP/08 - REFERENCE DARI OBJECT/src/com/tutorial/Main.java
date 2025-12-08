package com.tutorial;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nJudul:" + this.judul);
        System.out.println("\nPenulis:" + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java","Budi");
        
        buku1.display();

        //menampilkan adress
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println("\nAddress buku1: 0x" + addressBuku1);



        buku1.judul = "Pemrograman Python";
        buku1.display();

        
        Buku bukuA = new Buku("HTML Dasar","Siti");
        Buku bukuB = bukuA;

        bukuB.judul = "CSS Lanjut";

        bukuA.display();


    }


    public static void fungsi (Buku dataBuku){

    }
}