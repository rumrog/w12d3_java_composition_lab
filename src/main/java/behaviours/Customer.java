package behaviours;

import vehicles.IDrive;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuy{

    private double wallet;
    private ArrayList<IDrive> vehicles;

    public Customer(double wallet){
        this.wallet = wallet;
        this.vehicles = new ArrayList<IDrive>();
    }

    public double getWallet(){
        return this.wallet;
    }

    public ArrayList<IDrive> getVehicles(){
        return this.vehicles;
    }

    public void buyVehicle(IDrive vehicle) {
        this.vehicles.add(vehicle);
    }

    public void addVehicle(Vehicle vehicle) {
        this.wallet -= vehicle.getPrice();
        this.buyVehicle(vehicle);
    }
}
