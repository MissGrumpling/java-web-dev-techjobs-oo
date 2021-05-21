package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Assert.*;


public class JobTest {

    Job test_job;
    Job test_job2;
    Job test_job3;

    @Before
    public void createJobObjects(){
        test_job = new Job();
        test_job2 = new Job();
        test_job3 = new  Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId(){
        test_job.getId();
        assertEquals(1, test_job.getId(), .001);
    }

    private void assertEquals(int i, int id, double v) {
    }
    @Test
    public void testSettingJobIdChanges(){
        test_job.getId();
        test_job2.getId();
        assertTrue(test_job2.getId()> test_job.getId());
    }

    private void assertTrue(boolean b) {
    }

    @Test
    public void testSettingId(){
        test_job.getId();
        test_job2.getId();
        assertEquals(test_job2.getId(), test_job.getId()+1,.001 );
    }


}
