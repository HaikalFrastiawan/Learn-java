package com.latian;


    class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Penulis : " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Contoh 1: Dua Reference ke Satu Object ===");
        Buku bukuA = new Buku("HTML Dasar", "Siti");
        Buku bukuB = bukuA; // bukuB menunjuk ke object yang sama

        bukuB.judul = "CSS Lanjut"; // mengubah melalui bukuB
        bukuA.display(); // bukuA ikut berubah karena menunjuk object sama

        System.out.println("\n=== Contoh 2: Reference di Function ===");
        Buku bukuC = new Buku("Java Dasar", "Rudi");
        updateJudul(bukuC); // kirim object ke function
        bukuC.display(); // judul berubah menjadi "Java Advanced"

        System.out.println("\n=== Contoh 3: Mengganti Reference di Function ===");
        Buku bukuD = new Buku("C# Dasar", "Andi");
        gantiBuku(bukuD); // mencoba mengganti object
        bukuD.display(); // bukuD tetap sama, tidak berubah

        System.out.println("\n=== Contoh 4: Cek Address Object ===");
        System.out.println("Address bukuA: 0x" + Integer.toHexString(System.identityHashCode(bukuA)));
        System.out.println("Address bukuB: 0x" + Integer.toHexString(System.identityHashCode(bukuB)));
        System.out.println("Address bukuC: 0x" + Integer.toHexString(System.identityHashCode(bukuC)));
        System.out.println("Address bukuD: 0x" + Integer.toHexString(System.identityHashCode(bukuD)));
    }

    // Function untuk mengubah atribut object
    public static void updateJudul(Buku buku) {
        buku.judul = "Java Advanced"; // perubahan mempengaruhi object asli
    }

    // Function untuk mengganti reference object
    public static void gantiBuku(Buku buku) {
        buku = new Buku("Python Dasar", "Budi"); // hanya reference lokal berubah
    }
}
