/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.modelo.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author grleyva
 */
public class MotherBoardTest {
    
    public MotherBoardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMemoria method, of class MotherBoard.
     */
    @Test
    public void testGetMemoria() {
        System.out.println("getMemoria");
        MotherBoard instance = new MotherBoard("","");
        int expResult = 0;
        int result = instance.getMemoria();
        assertNotEquals(expResult, result);
        
        // prueba 2
        // prueba 3
        // prueba N
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProcesador method, of class MotherBoard.
    @Test
    public void testGetProcesador() {
        System.out.println("getProcesador");
        MotherBoard instance = null;
        String expResult = "";
        String result = instance.getProcesador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     */

    /**
     * Test of setProcesador method, of class MotherBoard.
    @Test
    public void testSetProcesador() {
        System.out.println("setProcesador");
        String procesador = "";
        MotherBoard instance = null;
        instance.setProcesador(procesador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     */

    /**
     * Test of getSlots method, of class MotherBoard.
    @Test
    public void testGetSlots() {
        System.out.println("getSlots");
        MotherBoard instance = null;
        Ram[] expResult = null;
        Ram[] result = instance.getSlots();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     */

    /**
     * Test of setSlots method, of class MotherBoard.
    @Test
    public void testSetSlots() {
        System.out.println("setSlots");
        Ram[] slots = null;
        MotherBoard instance = null;
        instance.setSlots(slots);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     */

    /**
     * Test of getMarca method, of class MotherBoard.
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        MotherBoard instance = null;
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     */

    /**
     * Test of setMarca method, of class MotherBoard.
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        MotherBoard instance = null;
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     */
    
}
