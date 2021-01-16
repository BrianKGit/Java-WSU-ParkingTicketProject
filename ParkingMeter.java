/*
 * Author: Brian Klein
 * Date: 9/11/17
 * Program: ParkingMeter.java
 * Description: user-defined class
 */

public class ParkingMeter {
    private int purchasedTime;

    public ParkingMeter() {
    }

    public ParkingMeter(int purchasedTime) {
        this.purchasedTime = purchasedTime;
    }

    public int getPurchasedTime() {
        return purchasedTime;
    }

    public void setPurchasedTime(int purchasedTime) {
        this.purchasedTime = purchasedTime;
    }

    @Override
    public String toString() {
        return "\nMinutes Purchased: " + purchasedTime;
    }
    
    
}
