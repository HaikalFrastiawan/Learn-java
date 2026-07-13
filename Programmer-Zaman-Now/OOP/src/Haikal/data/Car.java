package Haikal.data;

public interface Car extends HashBrand,IsMaintentance  {

    void drive();

    int getTier();

    //default method
    default boolean isBig() {
        return false;
    }

}
