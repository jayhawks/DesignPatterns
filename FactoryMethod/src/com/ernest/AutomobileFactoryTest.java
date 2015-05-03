package com.ernest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by james on 5/1/15.
 */
public class AutomobileFactoryTest {

    private AutomobileFactory factory;

    @Before
    public void setUp() {
        factory = new AutomobileFactory();
    }

    @Test
    public void canCreateFactoryTest() {
        assertNotNull(factory);
    }

    @Test
    public void testGetAutomobile() throws Exception {
        Automobile sedan = null;
        assertNull(sedan);

        sedan = factory.getAutomobile("sedan");

        assertNotNull(sedan);
        assertTrue(sedan instanceof Automobile);
        assertTrue(sedan instanceof SedanCar);

    }

    @Test
    public void invalidAutomobileTypeReturnsNull() {

        // James is not an automobile
        Automobile james;

        // Try to get Automobile with type of James
        james = factory.getAutomobile("James");
        
        assertNull(james);
    }
}