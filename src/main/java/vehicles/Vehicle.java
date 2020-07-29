package vehicles;

public abstract class Vehicle implements IDrive {

    protected double price;
    protected String colour;

    public Vehicle(double price, String colour) {
        this.price = price;
        this.colour = colour;
    }

    public double getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

}
