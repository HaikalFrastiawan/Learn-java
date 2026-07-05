class Person {
    String name;
    String address;
    final String country = "Indonesia"; 
    
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String paramName) {
        this(paramName, null); //method constructor chaining, memanggil constructor lain di dalam constructor yang sama
    }

    Person() {
        this(null); //method constructor chaining, memanggil constructor lain di dalam constructor yang sama
    }

    
    
    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name);
    }
}

