package behaviours;

import components.ElectricMotor;
import components.GripType;
import components.Tyres;
import components.VehicleEngine;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private Car car;
    private ElectricCar electricCar;
    private Tyres tyresCar;
    private Tyres tyresElectricCar;
    private VehicleEngine engine;
    private ElectricMotor electricMotor;

    @Before
    public void before(){
        engine = new VehicleEngine(65, 120, 300);
        electricMotor = new ElectricMotor(65, 120, 1000);
        tyresCar = new Tyres("Goodyear", 4, GripType.MEDIUM);
        tyresElectricCar = new Tyres("Michelin", 4, GripType.HIGH);
        car = new Car(10000, "Yellow", engine, tyresCar);
        electricCar = new ElectricCar(10000, "Yellow", electricMotor, tyresElectricCar);
        dealership = new Dealership(100000);
    }

    @Test
    public void hasTill(){
        assertEquals(100000, dealership.getTill(), 0.1);
    }

    @Test
    public void hasVehicles(){
        dealership.addVehicle(car);
        dealership.addVehicle(electricCar);
        assertEquals(2, dealership.getDealershipVehicles().size());
        assertEquals(80000, dealership.getTill(), 0.01);
    }
}
