public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Eko", "Subang");
        // person1.name = "Haikal";
        // person1.address = "Bandung";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        Person person2 = new Person("Joko", "Jakarta");

        Person person3;
        person3 = new Person("Budi", "Depok");
        // person3.name = "Budi Santoso";
        

    
    }
}
