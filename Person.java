
/**
 * Lab 5
 * TKRB
 * 
 * Task: 
 * Class for a Person.
 * Preconditions:
 * For set methods: the person has been created.
 * For test methods: the persons have been created and have values for name and age.
 * Postconditions:
 * Set methods: one or both attributes is assigned a value.
 * Test methods: true or false is returned.
 */

import java.util.*;

public class Person {
    private String name;
    private int age;

    /**
     * Initializes a Person. Reads name and age of a person
     * from System.in.
     */
    public void readInput() {
        // Create a scanner to ...
        Scanner keyboard = new Scanner(System.in);

        // read name...
        System.out.println("What is the person's name?");
        name = keyboard.nextLine();

        // and age from System.in
        System.out.println("What is the person's age?");
        age = keyboard.nextInt();
        while (age < 0) {
            // Make sure that age is not negative!!!
            System.out.println("Age cannot be negative.");
            System.out.println("Re-enter age:");
            age = keyboard.nextInt();
        }

        keyboard.close();
    }

    /**
     * Print a description of this Person to System.out
     */
    public void writeOutput() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }

    /**
     * Initializes this Person with name <i>newName</i> and age
     * <i>newAge</i>
     * 
     * @param newName - new name of this Person
     * @param newAge  - new age of this Person
     */
    public void set(String newName, int newAge) {
        setName(newName); // Set name..
        setAge(newAge); // and age
    }

    /**
     * Sets the name of this Person to <i>newName</i>
     * 
     * @param newName - new name of this Person
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Sets the new age of this Person
     * 
     * @param newAge - new age of this Person
     */
    public void setAge(int newAge) {
        if (newAge >= 0)
            age = newAge;
        else {
            System.out.println("ERROR: Used a negative age.");
            System.exit(0);
        }
    }

    /**
     * Returns the name of this Person
     * 
     * @return The name of this Person
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age of this Person
     * 
     * @return The age of this Person
     */
    public int getAge() {
        return age;
    }

    /**
     * Test same name
     * Case insensitive
     * @param anotherPerson
     * @return true if have same name
     */
    public boolean isSameName(Person anotherPerson) {
        return this.name.equalsIgnoreCase(anotherPerson.getName());
    }

    /**
     * Test same age
     * @param anotherPerson
     * @return true if of same gae
     */
    public boolean isSameAge(Person anotherPerson) {
        return this.age == anotherPerson.getAge();
    }

    /**
     * Test whether two eprsons are equal
     * i.e. same name & age
     * @param anothPerson
     * @return true if equal, else false
     */
    public boolean equals(Person anotherPerson){
        return this.age == anotherPerson.getAge() && 
        this.name.equalsIgnoreCase(anotherPerson.getName());
    }

    /**
     * Test whether the instance is older than anotherPerson
     * 
     * @param anotherPerson
     * @return true if older
     */
    public boolean isOlderThan(Person anotherPerson) {
        return this.age > anotherPerson.getAge();
    }

    /**
     * Test whether younger than anotherPerson
     * 
     * @param anotherPerson
     * @return true if younger
     */
    public boolean isYoungerThan(Person anotherPerson) {
        return this.age < anotherPerson.getAge();
    }

}
