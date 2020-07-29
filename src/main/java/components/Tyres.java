package components;

public class Tyres {

    private String make;
    private int noOfWheels;
    private GripType grip;

    public Tyres(String make, int noOfWheels, GripType grip) {
        this.make = make;
        this.noOfWheels = noOfWheels;
        this.grip = grip;
    }

    public String getMake() {
        return this.make;
    }

    public int getNoOfWheels() {
        return this.noOfWheels;
    }

    public GripType getGrip() {
        return this.grip;
    }

}
