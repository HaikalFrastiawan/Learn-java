class VicePresiden extends Manager{
    
    // Overriding method
    @Override
    void SayHello(String name) {
        System.out.println("Hello, " + name + ", My name is VP " + this.name);
    }
}

