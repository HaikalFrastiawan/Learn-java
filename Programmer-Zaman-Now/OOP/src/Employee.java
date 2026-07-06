class Employee {
    String name;
     
    Employee(String name){
        this.name = name;
    }

    void SayHello(String name) {
        System.out.println("Hello, " + name + ", My name is Emloyee " + this.name);
    }
    
}