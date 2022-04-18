/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev_j110_2;

/**
 *
 * @author denis
 */
public class Person {
    private String firstName = null;
    private String lastName = "";
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName!=null && !firstName.isEmpty()){
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    public Person(String firstName) {
        setFirstName(firstName);
    }

    public Person(String firstName, String lastName) {
        this(firstName);
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }
    
    
    public String print(){
        return firstName + " " + lastName + ", age=" + age;
        
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", age=" + age;
    }
    
    public static void printAll(Person[] persons){
        for(Person person : persons){
            System.out.println(person.print());
        }
    }
}
