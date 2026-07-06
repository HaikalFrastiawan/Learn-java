public class PolymorphismeApp {
    public static void main(String[] args) {
        Employee employee = new Employee("John");
       employee.SayHello("Budi");

       employee = new Manager("Doe");
       employee.SayHello("Budi");

         employee = new Manager("Doe", "Google");
         employee.SayHello("Budi");

        sayHello(new Employee("John"));
        sayHello(new Manager("Doe"));
        sayHello(new Manager("joko"));
    }

    static void sayHello(Employee employee){
       System.out.println("Hello " + employee.name);
    }
}
