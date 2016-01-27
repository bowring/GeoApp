/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cirdles.geoapp;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author evc1996
 */
public class LatLongToUTMTest {
    
    public LatLongToUTMTest() {
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
     * Test of convert method, of class LatLongToUTM.
     */
    @org.junit.Test
    public void testConvert_3args_1() {
        System.out.println("convert");
        BigDecimal latitude = new BigDecimal(84.0);
        BigDecimal longitude = new BigDecimal(102.0);
        String datumName = "WGS84";
        
        UTM resultUTM = LatLongToUTM.convert(latitude, longitude, datumName);
        
        int eastingResult = resultUTM.getEasting().intValue();
        int northingResult = resultUTM.getNorthing().intValue();
        
        int expEasting = 465005;
        int expNorthing = 9329005;
        
        assertEquals(expEasting, eastingResult);
        assertEquals(expNorthing, northingResult);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convert method, of class LatLongToUTM.
     */
    @org.junit.Test
    public void testConvert_3args_2() {
        System.out.println("convert");
        double latitude2 = 0.0;
        double longitude2 = 0.0;
        String datumName2 = "WGS84";
        
        UTM resultUTM2 = LatLongToUTM.convert(latitude2, longitude2, datumName2);
        
        int eastingResult2 = resultUTM2.getEasting().intValue();
        int northingResult2 = resultUTM2.getNorthing().intValue();
        
        int expEasting2 = 166021;
        int expNorthing2 = 0;
        
        assertEquals(expEasting2, eastingResult2);
        assertEquals(expNorthing2, northingResult2);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
