package org.afyahmis.chapter01;

import org.afyahmis.chapter01.artifacts.Country;
import org.afyahmis.chapter01.artifacts.County;
import org.afyahmis.chapter01.artifacts.PhoneNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lesson101Test {
    Lesson101 lesson101;
   @BeforeEach
    public void setup(){
        lesson101=new Lesson101();
    }
    @Test
    public void shouldUseTelescope() {
        Country country=lesson101.useTelescope("ke","Kenya","africa");
        assertNotNull(country);
        assertEquals("KE",country.getCode());
        assertEquals("Kenya",country.getName());
        assertEquals("africa",country.getRegion());
        System.out.println(country.toString());
    }

    @Test
    public void shouldUseBuilder() {
        County county=lesson101.useBuilder(47,"Nairobi","Sakaja","Dp","Sn","Wr");
        assertNotNull(county);
        assertEquals(47,county.getCode());
        assertEquals("Nairobi",county.getName());
        assertEquals("Sakaja",county.getGovernor());
        assertEquals("Dp",county.getDeputyGovernor());
        assertEquals("Sn",county.getSenator());
        assertEquals("Wr",county.getWomenRep());
        System.out.println(county.toString());
    }

    @Test
    public void shouldCheckIfEqual() {
        PhoneNumber a=new PhoneNumber(1,1,1);
        PhoneNumber b=a;
        PhoneNumber c=new PhoneNumber(1,1,2);
        PhoneNumber d=new PhoneNumber(1,1,2);

        assertTrue(lesson101.checkIfEqual(a,b));
        assertFalse(lesson101.checkIfEqual(a,c));
        assertTrue(lesson101.checkIfEqual(c,d));

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
    }

    @Test
    public void shouldCheckCone() {
        PhoneNumber a=new PhoneNumber(1,1,1);
        PhoneNumber b=a.clone();

        assertTrue(lesson101.checkIfEqual(a,b));

        System.out.println(a);
        System.out.println(b);
    }
}