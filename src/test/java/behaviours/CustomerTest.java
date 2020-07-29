package behaviours;

import components.GripType;
import components.Tyres;
import components.VehicleEngine;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.IDrive;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CustomerTest {

    Customer customer;
    private Car car;
    private Tyres tyres;
    private VehicleEngine engine;

    @Before
    public void before(){
        engine = new VehicleEngine(65, 120, 300);
        tyres = new Tyres("Goodyear", 4, GripType.MEDIUM);
        car = new Car(10000, "Yellow", engine, tyres);
        customer = new Customer(20000);
    }

    @Test
    public void hasWallet(){
        assertEquals(20000, customer.getWallet(), 0.1);
    }

    @Test
    public void hasVehicles(){
        customer.addVehicle(car);
        assertEquals(1, customer.getVehicles().size());
        assertEquals(10000, customer.getWallet(), 0.01);
    }
}
