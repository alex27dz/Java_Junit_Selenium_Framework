package com.eviltester.webdriver;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person1 = new Person("Alice", 30);

        // Call methods on the person1 object
        person1.displayPersonDetails(); // Output: Name: Alice, Age: 30

        // Modify the name and age
        person1.setName("Bob");
        person1.setAge(35);

        // Display updated details
        person1.displayPersonDetails(); // Output: Name: Bob, Age: 35
    }
}


