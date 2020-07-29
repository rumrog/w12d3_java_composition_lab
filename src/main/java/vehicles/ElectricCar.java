package vehicles;

import components.ElectricMotor;
import components.Tyres;
import components.VehicleEngine;

public class ElectricCar extends Vehicle{

    private ElectricMotor servoMotor;
    private Tyres tyres;


    public ElectricCar(double price, String colour, ElectricMotor servoMotor, Tyres tyres) {
        super(price, colour);
        this.servoMotor = servoMotor;
        this.tyres = tyres;
    }

    public ElectricMotor getElectricMotor() {
        return this.servoMotor;
    }

    public Tyres getTyres(){
        return this.tyres;
    }

    public String makeNoise(String data) {
        return "Please work.";
    }
}
