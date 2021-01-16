/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */

public class PoliceOfficer {
    
    private String firstName;
    private String lastName;
    private String badge;

    public PoliceOfficer() {
    }

    public PoliceOfficer(String firstName, String lastName, String badge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.badge = badge;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }
    

    public void getTimeOver(Car car1, ParkingMeter PM1) {
        
        int timeOver = car1.getMinutesParked() - PM1.getPurchasedTime();
        if(timeOver > 0) {
            //create date object
            Date issueDate = new Date ( 9, 18, 2017);
            //create parking ticket object
            ParkingTicket ticket1 = new ParkingTicket(car1, this, issueDate);
            ticket1.amountOfFine(timeOver);
            System.out.println(car1 + "\n" + this + "\n" + PM1 + "\n" + ticket1);
        }
        else{
            System.out.println(car1 + "\n" + PM1 + "\n" 
                    + "There is no fine, have a good day!");
        }
    }
    
    @Override
    public String toString() {
        return "\nOfficer Info:\nName: " + firstName + " " + lastName 
                + "\nBadge Number: " + badge;
    } 
}//end class
