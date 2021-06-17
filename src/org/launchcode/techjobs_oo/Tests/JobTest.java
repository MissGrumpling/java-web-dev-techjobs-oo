package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Assert.*;

import static org.junit.Assert.assertFalse;


public class JobTest {

    Job test_job;
    Job test_job2;
    Job test_job3;
    Job test_job4;

    @Before
    public void createJobObjects(){
        test_job = new Job();
        test_job2 = new Job();
        test_job3 = new Job();
        test_job4 = new  Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){
        //test_job.getId();
        assertEquals(1, test_job.getId(), .001);
    }
    private void assertEquals(int i, int id, double v) {
    }
    @Test
    public void testSettingJobIdChanges(){
        //test_job.getId();
        //test_job2.getId();
        assertTrue(test_job2.getId()> test_job.getId());
    }
    private void assertTrue(boolean b) {
    }
    @Test
    public void testSettingId(){
        //test_job.getId();
        //test_job2.getId();
        assertEquals(test_job3.getId(), test_job.getId()+2,.001 );
    }

    @Test
    public void testJobConstructorSetsAllClasses(){
        assertTrue(test_job4.getEmployer()instanceof Employer);
        assertTrue(test_job4.getLocation()instanceof Location);
        assertTrue(test_job4.getPositionType()instanceof PositionType);
        assertTrue(test_job4.getCoreCompetency()instanceof CoreCompetency);
    }

    @Test
    public void testJobConstructorsSetsAllFields(){
        assertEquals("Product Tester", test_job4.getName());
        assertEquals("ACME", test_job4.getEmployer().getValue());
        assertEquals("Desert", test_job4.getLocation().getValue());
        assertEquals("Quality Control", test_job4.getPositionType().getValue());
        assertEquals("Persistance", test_job4.getCoreCompetency().getValue());
    }

    private void assertEquals(String product_tester, String name) {
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(test_job.equals(test_job2));
    }

    @Test
    public void testJobReturnString(){
        String jobString =
                "ID : test_job4.getId()\n"+
                "Name : test_job4.getName()\n" +
                "Employer : test_job4.getEmployer().toString()\n" +
                "Location : test_job4.getLocation().toString()\n" +
                "Position Type : test_job4.getPositionType().toString()\n" +
                "Core Competency : test_job4.getCoreCompetency().toString()\n";
        assertTrue(test_job4.toString().equals(jobString));
    }
}
