
package nic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NICTest {
    @Test
    public void testGetYear() {
         NIC instance = new NIC();
        System.out.println("getYear");
        String input = "901151113V";
        int expResult = 1990;
        int result = instance.getYear(input);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetMonth() {
         NIC instance = new NIC();
        System.out.println("getMonth");
        String input = "901151113V";
        int expResult = 4;
        int result = instance.getMonth(input);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetDate() {
         NIC instance = new NIC();
        System.out.println("getDate");
        String input = "901151113V";
        int expResult = 24;
        int result = instance.getDate(input);
        assertEquals(expResult, result);
    }
    @Test
     public void testGender() {
          NIC instance = new NIC();
        System.out.println("gender");
        String input = "901151113V";
        String expResult = "Male";
        String result = instance.gender(input);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsVoter() {
         NIC instance = new NIC();
        System.out.println("isVoter");
        String input = "901151113V";
        boolean expResult = true;
        boolean result = instance.isVoter(input);
        assertEquals(expResult, result);
    }
}
