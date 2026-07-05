public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Eko";
        person.address = "Subang";

        Person person1 = new Person();
        person1.name = "Budi";
        person1.address = "Bandung";

        person.sayHello("Budi");
        person1.sayHello("Eko");

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

    
    }
}
