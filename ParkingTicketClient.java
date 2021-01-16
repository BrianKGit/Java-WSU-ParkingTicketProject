/*
 * Author: Brian Klein
 * Date: 9/14/17
 * Program: ParkingTicketClient.java
 * Description: Client Program
 */

public class ParkingTicketClient {
    
    public static void main(String[] args) {
                
        Car car1 = new Car("Honda", "CRV", "Green", "1999", "HTD453", 125);
        
        PoliceOfficer officer1 = new PoliceOfficer("Joe", "West", "187911");
        
        ParkingMeter PM1 = new ParkingMeter(60);
        
        //officer1.getTimeOver(car1,PM1);
        
        officer1.getTimeOver(car1, PM1);
    }
    
}
