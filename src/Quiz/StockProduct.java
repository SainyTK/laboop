/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author tk
 */
public class StockProduct {
    private String name ;
    private int numProducts ;
    
    public StockProduct ( String name , int numProducts ) {
    // Implement this
        this.name = name;
        this.numProducts = numProducts;
        if (numProducts < 0)
           this.numProducts = 0;
    }
    
    public void addProduct (int num ) {
        if (num >= 0)
           this.numProducts += num;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getNumProducts() {
        return this.numProducts;
    }
    
}