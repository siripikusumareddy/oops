class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        System.out.println("Original Person:");
        p1.display();
        
        Person p2 = new Person(p1);
        System.out.println("Copied Person:");
        p2.display();
    }
}
