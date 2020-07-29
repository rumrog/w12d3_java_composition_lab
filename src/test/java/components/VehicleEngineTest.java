package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleEngineTest {

    VehicleEngine engine;

    @Before
    public void before() {
        engine = new VehicleEngine(65, 120, 300);
    }

    @Test
    public void testGetFuelEfficiency(){
        assertEquals(65, engine.getFuelEfficiency());
    }
    
    @Test
    public void testGetHorsePower() {
        assertEquals(120, engine.getHorsePower());
  }
 
    @Test
    public void teGetMileage(){
        assertEquals(300, engine.getMileage());
    }


}




