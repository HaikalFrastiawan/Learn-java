package com.tutorial;

//class dengan constuctor 
class Mahasiswa{
  String nama;
  String nim;

    //constructor
    Mahasiswa(String nama, String nim){
      this.nama = nama;
      this.nim = nim;
    }

    //method tanpa return tanpa parameter
    void show(){
      System.out.println("Nama : " + this.nama);
      System.out.println("NIM : " + this.nim);
    }

    //method tanpa return dengan parameter
    void setNama(String nama){
      this.nama = nama;
    }

    //method dengan return tanpa parameter
    String getNama(){
      return this.nama;
    }
    String getNim(){
      return this.nim;
    }

    //method dengan return dengan parameter
    String SayHay(String Message){
      return Message + "Juga, Nama saya " + this.nama;
    }
}



public class Main {
    public static void main(String[] args)  {
    Mahasiswa mahasiswa1 = new Mahasiswa("Andi","101");
    
    //panggil method show
    mahasiswa1.show();

    //ubah nama menggunakan method setNama
    mahasiswa1.setNama("Budi");
    mahasiswa1.show();

    //panggil method getNama dan getNim
    System.out.println(mahasiswa1.getNama());
    System.out.println(mahasiswa1.getNim());

    //panggil method SayHay
    String pesan = mahasiswa1.SayHay("Halo ");
    System.out.println(pesan);    
    }
}