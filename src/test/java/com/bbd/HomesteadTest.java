package com.bbd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bbdnet1523 on 2016/12/06.
 */
@SuppressWarnings("DefaultFileTemplate")
public class HomesteadTest {

    private HomeStead homestead;
    private Nkandla nkandla;
    private Politician politicianHZ;
    private Politician politicianJM;
    private Politician JacobZuma;

    @Before
    public void setUp() throws Exception {
        homestead = new HomeStead("Zuma", "Wierda","Gauteng", "ZA");
        nkandla = new Nkandla("Zuma", "Wierda","Gauteng", "ZA");
        politicianHZ = new Politician("Hellen Zille", 50, gender.FEMALE, personType.Politician);
        politicianJM = new Politician("Julius Malema", 38, gender.MALE, personType.Politician);
        JacobZuma = new Politician("Jacob Zuma", 43, gender.MALE, personType.President);

        SwimmingPool pool = new SwimmingPool(50, 20);
        nkandla.setSwimmingPool(pool);
        ChickenRun chikchik = new ChickenRun(95);
        nkandla.setChickenRun(chikchik);
        Ampitheatre amphi = new Ampitheatre(6500);
        nkandla.setAmpitheatre(amphi);
    }

    @Test
    public void testHomestead(){
        String testing = "HomeStead{Name='Zuma', District='Wierda', Province='Gauteng', Country='ZA'}";
        assertEquals(testing, homestead.toString());
    }

    @Test
    public void testPoliticianHZ() {
        String poli = "Person{name='Hellen Zille', age=50, gen=FEMALE, type=Politician}";
        assertEquals(poli, politicianHZ.toString());
    }

    @Test
    public void testPoliticianJM() {
        String poli = "Person{name='Julius Malema', age=38, gen=MALE, type=Politician}";
        assertEquals(poli, politicianJM.toString());
    }

    @Test
    public void testPoliticianJacobZuma() {
        String poli = "Person{name='Jacob Zuma', age=43, gen=MALE, type=President}";
        assertEquals(poli, JacobZuma.toString());
    }

    @Test (expected = RuntimeException.class)
    public void testAcceptHZ(){
        homestead.accept(politicianHZ);
    }

    @Test
    public void testJacob(){
        homestead.accept(JacobZuma);
    }


    @Test
    public void testSwimming(){
        String swim = "SwimmingPool{length=50, width=20}";
        assertEquals(swim, nkandla.getSwimmingPool().toString());
    }

    @Test
    public void testSwimmingPool(){
        assertEquals(50, nkandla.getSwimmingPool().getLength());
        assertEquals(20, nkandla.getSwimmingPool().getWidth());
    }

    @Test
    public void testChickens(){
        assertEquals(95, nkandla.getChickenRun().getNoOfChickens());
    }

    @Test
    public void testAmphi(){
        assertEquals(6500, nkandla.getAmpitheatre().getNoOfSeats());
    }


}
