/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev_j110_2;

import java.util.Arrays;

/**
 *
 * @author denis
 */
public class DEV_J110_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person[] students = new Person[3];
        
        students[0] = new Student("2021.2", "Bobrov", "Valers", 35);
        students[1] = new Child("Ivanov", "Ivan", 28);
        students[2] = new Child("Karpov", "Aleksandr", 21);;
        
        Person.printAll(students);
    }
    
}
