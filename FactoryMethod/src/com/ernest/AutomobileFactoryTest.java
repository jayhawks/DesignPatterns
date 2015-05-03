package com.ernest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test the automobile factory
 */
public class AutomobileFactoryTest {

    private AutomobileFactory factory;

    @Before
    public void setUp() {
        factory = new AutomobileFactory();
    }

    @After
    public void tearDown() {
        factory = null;
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