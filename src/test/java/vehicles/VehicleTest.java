package vehicles;

import components.GripType;
import components.Tyres;
import components.VehicleEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicle vehicle;
    VehicleEngine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new VehicleEngine(100, 100, 100);
        tyres = new Tyres("Goodyear", 4, GripType.MEDIUM);
        vehicle = new Car(10000, "Yellow", engine, tyres);
    }

    @Test
    public void hasPrice(){
        assertEquals(10000, vehicle.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("Yellow", vehicle.getColour());
    }
}
