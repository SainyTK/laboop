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
public class ThaiPerson {
    
    private String firstname;
    private String lastname;
    
    public ThaiPerson(String fullname) {
        int spaceIndex = fullname.indexOf(" ");
        firstname = fullname.substring(0, spaceIndex);
        lastname = fullname.substring(spaceIndex + 1);
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    
}
