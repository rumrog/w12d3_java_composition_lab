package vehicles;

import components.GripType;
import components.Tyres;
import components.VehicleEngine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    VehicleEngine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new VehicleEngine(65, 120, 300);
        tyres = new Tyres("Goodyear", 4, GripType.MEDIUM);
        car = new Car(10000, "Yellow", engine, tyres);
    }

    @Test
    public void hasPrice(){
        assertEquals(10000, car.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("Yellow", car.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals(65, car.getEngine().getFuelEfficiency());
        assertEquals(120, car.getEngine().getHorsePower());
        assertEquals(300, car.getEngine().getMileage());
    }

    @Test
    public void hasTyres(){
        assertEquals("Goodyear", car.getTyres().getMake());
        assertEquals(4, car.getTyres().getNoOfWheels());
        assertEquals(GripType.MEDIUM, car.getTyres().getGrip());
    }
}
