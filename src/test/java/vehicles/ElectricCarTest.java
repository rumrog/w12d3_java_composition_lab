package vehicles;

import components.ElectricMotor;
import components.GripType;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    ElectricMotor servoMotor;
    Tyres tyres;

    @Before
    public void before(){
        servoMotor = new ElectricMotor(65, 120, 1000);
        tyres = new Tyres("Goodyear", 4, GripType.MEDIUM);
        electricCar = new ElectricCar(10000, "Yellow", servoMotor, tyres);
    }

    @Test
    public void hasPrice(){
        assertEquals(10000, electricCar.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("Yellow", electricCar.getColour());
    }

    @Test
    public void hasElectricMotor(){
        assertEquals(65, electricCar.getElectricMotor().getRange(), 0.01);
        assertEquals(120, electricCar.getElectricMotor().getChargeSpeed());
        assertEquals(1000, electricCar.getElectricMotor().getTorque(), 0.01);
    }
}
