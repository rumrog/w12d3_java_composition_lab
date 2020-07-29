package behaviours;

import vehicles.IDrive;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuy {

    private double till;
    private ArrayList<IDrive> vehicles;

    public Dealership(double till) {
        this.till = till;
        this.vehicles = new ArrayList<IDrive>();
    }

    public double getTill() {
        return this.till;
    }

    public ArrayList<IDrive> getDealershipVehicles() {
        return this.vehicles;
    }

    public void buyVehicle(IDrive vehicle) {
        this.vehicles.add(vehicle);
    }

    public void sellVehicle(Vehicle vehicle, Customer customer){
        this.removeVehicle(vehicle);
        customer.addVehicle(vehicle);
    }

    public void addVehicle(Vehicle vehicle) {
        this.till -= vehicle.getPrice();
        this.buyVehicle(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.till += vehicle.getPrice();
    }

}
