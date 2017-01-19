package com.bbd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Andrew on 2017/01/19.
 */
public class PersonTest {

    private Politician HelenZille;
    private Politician JuliusMalema;
    private Lawyer BarryRoux;

    @Before
    public void setUp() throws Exception {
        HelenZille = new Politician("Hellen Zille", 50, gender.FEMALE, personType.Politician);
        JuliusMalema = new Politician("Julius Malema", 38, gender.MALE, personType.Politician);
        BarryRoux = new Lawyer("Barry Roux", 55, gender.MALE, personType.Lawyer);

    }

    @Test
    public void testNames() {
        assertEquals("Hellen Zille", HelenZille.getName());
        assertEquals("Julius Malema", JuliusMalema.getName());
        assertEquals("Barry Roux", BarryRoux.getName());
    }

    @Test
    public void testAges() {
        assertEquals(50, HelenZille.getAge());
        assertEquals(38, JuliusMalema.getAge());
        assertEquals(55, BarryRoux.getAge());
    }

    @Test
    public void testGender() {
        assertEquals(gender.FEMALE, HelenZille.getGen());
        assertEquals(gender.MALE, JuliusMalema.getGen());
        assertEquals(gender.MALE, BarryRoux.getGen());
    }

    @Test
    public void testType() {
        assertEquals(personType.Politician, HelenZille.getType());
        assertEquals(personType.Politician, JuliusMalema.getType());
        assertEquals(personType.Lawyer, BarryRoux.getType());
    }
}