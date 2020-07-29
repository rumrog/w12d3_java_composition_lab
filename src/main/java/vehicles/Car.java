package vehicles;

import components.Tyres;
import components.VehicleEngine;

public class Car extends Vehicle {
    
    private VehicleEngine engine;
    private Tyres tyres;


    public Car(double price, String colour, VehicleEngine engine, Tyres tyres) {
        super(price, colour);
        this.engine = engine;
        this.tyres = tyres;
    }

    public VehicleEngine getEngine() {
        return this.engine;
    }

    public Tyres getTyres(){
        return this.tyres;
    }

    public String makeNoise(String data) {
        return "Please work.";
    }


}
