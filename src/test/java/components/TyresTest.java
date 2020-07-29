package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    private Tyres tyres;

    @Before
    public void before() {
        tyres = new Tyres("Michelin", 4, GripType.HIGH);
    }

    @Test
    public void canGetMake() {
        assertEquals("Michelin", tyres.getMake());
    }

    @Test
    public void canGetNoOfWheels() {
        assertEquals(4, tyres.getNoOfWheels());
    }

    @Test
    public void canGetGrip() {
        assertEquals(GripType.HIGH, tyres.getGrip());
    }


}
