/*
 * Author: Brian Klein
 * Date: 9/11/17
 * Program: Car.java
 * Description:
 */
public class Car {
    private String make;
    private String model;
    private String color;
    private String year;
    private String licenseNum;
    private int minutesParked;

    public Car() {
    }

    public Car(String make, String model, String color, String year, String licenseNum, int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.licenseNum = licenseNum;
        this.minutesParked = minutesParked;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public int getMinutesParked() {
        return minutesParked;
    }

    public void setMinutesParked(int minutesParked) {
        this.minutesParked = minutesParked;
    }

    @Override
    public String toString() {
        return "\nCar Info:\n   Make: " + make + "\n   Model: " + model + 
                "\n   Color: " + color + "\n   Year: " + year + 
                "\n   License Number: " + licenseNum + "\n   Minutes Parked: " + 
                minutesParked;
    }
    
    
}
