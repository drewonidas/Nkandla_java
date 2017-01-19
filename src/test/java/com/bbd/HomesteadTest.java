package com.bbd;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by bbdnet1574 on 2017/01/18.
 */
public class HomesteadTest {
    //private HomeStead homeStead;
    private Nkandla nkandla;
    private Politician politicianHelen;
    private Politician politicianJulius;
    private Politician zuma;

    @Before
    public void setUp() throws Exception{
        nkandla = new Nkandla("Nkandla", "THIS ONE", "GP", "SA");
        nkandla.setSwimmingPool(new SwimmingPool(10, 15));
        nkandla.setChickenRun(new ChickenRun(36));
        nkandla.setAmpitheatre(new Ampitheatre(500));
        politicianHelen = new Politician("Hellen Zille", 50, gender.FEMALE, personType.Politician);
        politicianJulius = new Politician("Julius Malema", 38, gender.MALE, personType.Politician);
        zuma = new Politician("Jacob Zuma", 43, gender.MALE, personType.President);
    }

    @Test (expected = RuntimeException.class)
    public void testHomesteadHelen() {
        nkandla.accept(politicianHelen);
    }

    @Test (expected = RuntimeException.class)
    public void testHomesteadJulius() {
        nkandla.accept(politicianJulius);
    }

    @Test
    public void testHomesteadValid() {
        nkandla.accept(zuma);
    }
}