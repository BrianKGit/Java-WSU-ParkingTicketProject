/*
 * Author: Brian Klein
 * Date: 9/11/17
 * Program: ParkingTicket.java
 * Description:
 */

public class ParkingTicket {

    private Car car;
    private PoliceOfficer officer;
    private Date issueDate;
    private double fine;
    private int timeOver;

    public ParkingTicket() {
    }

    public ParkingTicket(Car car, PoliceOfficer officer, Date issueDate ) {
        this.car = car;
        this.officer = officer;
        this.issueDate = issueDate;
    }



    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public PoliceOfficer getOfficer() {
        return officer;
    }

    public void setOfficer(PoliceOfficer officer) {
        this.officer = officer;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
    

    public void amountOfFine(int timeOver) {
        this.timeOver = timeOver;
        double fine = 0.0;
        double BASEFINE = 25.0;

        for (int i = 0; timeOver >= 0; i++) {
            
            timeOver -= 60.0;
            fine = BASEFINE + (i * 10);

        }
        this.fine = fine;

    }

    @Override
    public String toString() {
        return "\nMinutes Illegally Parked: " + timeOver + "\nFine: $" 
                + this.fine + "\nIssue Date: " + issueDate;
    }

}
