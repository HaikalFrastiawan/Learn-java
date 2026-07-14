package Haikal.data;

public class ProdukApp {
    public static void main(String[] args){
        Produk produk = new Produk("mac book", 50000);
        System.out.println(produk.name);
        System.out.println(produk.price);

        System.out.println(produk);
        Produk produk2 = new Produk("mac book", 50000);

        System.out.println(produk.equals(produk2)); //compare apakah equals
    }



}
