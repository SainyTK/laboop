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
public class ClockTime {
    
    private int hour, minute, second;
    
    public ClockTime() {
        hour = 1;
        minute = 1;
        second = 1;
    }
    
    public ClockTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23)
            this.hour = hour;
    }
    
    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59)
            this.minute = minute;
    }
    
    public void reset() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
    public void displayTime() {
        System.out.println(hour+":"+minute+":"+second);
    }
    
}
