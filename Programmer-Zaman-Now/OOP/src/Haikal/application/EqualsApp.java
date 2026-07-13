package Haikal.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Haikal";
        first = first + " " + "Frastiawan";
        System.out.println(first);

        String second = "Haikal Frastiawan";
        System.out.println(second);
        String third = "Haikal Frastiawan";

        System.out.println(first == second); //ini membandinggkan apakah object sama apa bukan (bukan isi)
        System.out.println(third == second);

        System.out.println(second.equals(first)); //ini  baru benar
    }
}
