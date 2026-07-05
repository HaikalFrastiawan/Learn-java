public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Eko";
        person.address = "Subang";
        
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
    }
}
