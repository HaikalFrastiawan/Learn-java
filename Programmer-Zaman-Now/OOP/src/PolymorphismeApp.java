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
        sayHello(new VicePresiden("joko"));
    }

    //check and cast
    static void sayHello(Employee employee){
        if(employee instanceof VicePresiden){
            VicePresiden vicePresident = (VicePresiden) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
         
        }
    }
}
