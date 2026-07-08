package Haikal.application;


import Haikal.data.Produk;

public class Aplication {
    public static void main(String[] args) {
        Produk produk = new Produk("mac book", 50000);
        System.out.println(produk.name);
        System.out.println(produk.price);
    }
}
