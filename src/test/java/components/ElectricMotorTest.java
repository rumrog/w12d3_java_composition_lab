package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricMotorTest {

    private ElectricMotor electricMotor;

    @Before
    public void before() {
        electricMotor = new ElectricMotor(500, 90, 1250);
    }

    @Test
    public void canGetRange() {
        assertEquals(500, electricMotor.getRange(), 0.01);
    }

    @Test
    public void canGetChargeSpeed() {
        assertEquals(90, electricMotor.getChargeSpeed());
    }

    @Test
    public void canGetTorque() {
        assertEquals(1250, electricMotor.getTorque(), 0.01);
    }

}
