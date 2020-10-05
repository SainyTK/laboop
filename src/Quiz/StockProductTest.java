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
public class StockProductTest {
    
    public static void main(String args[]) {
        StockProduct stock1 = new StockProduct("Pen", 10);
        StockProduct stock2 = new StockProduct("Pencil", -1);
        
        System.out.println("Stock: " + stock1.getName() + " has products: " + stock1.getNumProducts());
        System.out.println("Stock: " + stock2.getName() + " has products: " + stock2.getNumProducts());
        
        stock1.addProduct(10);
        stock2.addProduct(-1);
        
        System.out.println("Stock: " + stock1.getName() + " has products: " + stock1.getNumProducts());
        System.out.println("Stock: " + stock2.getName() + " has products: " + stock2.getNumProducts());
    }
    
}
