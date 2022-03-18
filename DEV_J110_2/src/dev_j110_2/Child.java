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
public class Child extends Person{

    public Child(String firstName) {
        super(firstName);
    }

    public Child(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Child(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String print(){
        return "Child{" + super.print() + ", is child'}";
    }

    @Override
    public String toString() {
        return "Child{" + super.print() + ", is child'}'";
    }
}
