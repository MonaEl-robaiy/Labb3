package kyh.labs.lab3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class testP {

    @Test
   public void testName(){
        Patient p = new Patient("Olle");
        assertEquals("Olle", p.getName());
        assertNotEquals("hej", p.getName());
    }

   @Test
   public void testSickness(){
       Disease d = new disease("Olle");
        assertEquals("Olle", s.getSickness());
        assertNotEquals("hej", s.getSickness());
    }

}
