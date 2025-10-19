package com.tutorial;

//class dengan constuctor 
class Mahasiswa{
  String nama;
  String nim;
  String jurusan;

  //constructor di panggil saja object pertama kali dibuat
//   Mahasiswa(){
//     System.out.println("ini adalah constructor");
//   }

  //constructor dengan parameter
    Mahasiswa(String inputNama, String inputNim, String inputJurusan){
        nama = inputNama;
        nim = inputNim;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(nim);
        System.out.println(jurusan);

    }
}



public class Main {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa("UCUP", "123", "TEKNIK INFORMATIKA");
        Mahasiswa mahasiswa2 = new Mahasiswa("OTONG", "456", "TEKNIK SIPIL");




    }
}