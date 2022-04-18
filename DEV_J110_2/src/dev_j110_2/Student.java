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
public class Student extends Person{
    String number;

    public Student(String number, String firstName) {
        super(firstName);
        this.number = number;
    }

    public Student(String number, String firstName, String lastName) {
        super(firstName, lastName);
        this.number = number;
    }

    public Student(String number, String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.number = number;
    }
    
    @Override
    public String print(){
        return "Student{" + "person=" + super.print() + ", number=" + number + '}';
    }

    @Override
    public String toString() {
        return "Student{" + "number=" + number + '}';
    }

    
}
