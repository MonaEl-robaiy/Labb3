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




}
