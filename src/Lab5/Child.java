/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab5;

/**
 *
 * @author tk
 */
public class Child extends Person {
    
    private Person guardian;
    private int age;
    private double weight;
    private int height;
    
    public Child(int age, int height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    public void setGuardian(Person person) {
        guardian = person;
    }
    
    public Person getGuardian() {
        return guardian;
    }
    
}
