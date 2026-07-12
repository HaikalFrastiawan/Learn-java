package Haikal.application;

import Haikal.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("ID");
//        category.id = null; maksa getter untuk ngambil id
        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
