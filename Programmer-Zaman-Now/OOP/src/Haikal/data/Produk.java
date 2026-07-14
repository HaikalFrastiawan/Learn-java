package Haikal.data;

import java.util.Objects;

public class Produk {
    public String name;
    public int price;

    public Produk(String name,int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Produk Name:" + name + "Price" +price;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Produk produk)) return false;

        return price == produk.price && Objects.equals(name, produk.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + price;
        return result;
    }

    //    public boolean equals (Object o){
//        if(o == this){
//            return true;
//        }
//
//        if(!(o instanceof Produk)){
//            return false;
//        }
//        Produk produk = (Produk) o;
//        if(this.price != produk.price) {
//            return false;
//        }
//        if (this.name != null) {
//            return this.name.equals(produk.name);
//        }else {
//            return produk.name == null
//        }
//
//    }
}
