class Person {
    String name;
    String address;
    final String country = "Indonesia"; 
    
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName) {
        // name = paramName;
        this(paramName, null); //method constructor chaining, memanggil constructor lain di dalam constructor yang sama
    }

    Person() {
        this(null); //method constructor chaining, memanggil constructor lain di dalam constructor yang sama
    }

    
    
    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + name);
    }
}

