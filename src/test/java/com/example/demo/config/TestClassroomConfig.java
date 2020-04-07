package com.example.demo.config;

import com.example.demo.domain.Classroom;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig
{
    @Autowired
    @Qualifier("cohort")
    Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    Classroom prevCohort;

    @Test
    public void cohortTest()
    {
        String expected = "Instructors:: [ 1001: Dolio Durant, 1002: Froilan Miranda, 1003: Kris Younger, 1004: Chris Nobles, 1005: Roberto DeDeus ]\n" +
                "Students:: [ 3001: James Wilkinson, 3002: Raheel Upphal, 3003: Emma Beech, 3004: Greg Davis, 3005: Leila Hsiao ]";
        String actual = currentCohort.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void previousCohortTest()
    {
        String expected = "Instructors:: [ 1001: Dolio Durant, 1002: Froilan Miranda, 1003: Kris Younger, 1004: Chris Nobles, 1005: Roberto DeDeus ]\n" +
                "Students:: [ 2001: Sandy Pham, 2002: Caleb Powell, 2003: Joanna Hsiao, 2004: Whitney Martinez, 2005: Dan Zygmund-Felt ]";
        String actual = prevCohort.toString();

        Assert.assertEquals(expected, actual);
    }
}
