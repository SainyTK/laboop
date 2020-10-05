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
public class ClockTimeTest {
    
    public static void main(String args[]) {
        ClockTime clock = new ClockTime();
        ClockTime clock2 = new ClockTime(10, 50, 50);
        
        clock.displayTime();
        clock2.displayTime();
        
        clock.setHour(10);
        clock.setMinute(20);
        
        clock2.reset();
        
        clock.displayTime();
        clock2.displayTime();
        
    }
    
}
