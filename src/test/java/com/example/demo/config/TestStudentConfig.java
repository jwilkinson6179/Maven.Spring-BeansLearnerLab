package com.example.demo.config;

import com.example.demo.domain.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig
{
    @Autowired
    @Qualifier("students")
    Students students;

    @Autowired
    @Qualifier("previousStudents")
    Students graduates;

    @Test
    public void currentStudentsTest()
    {
        String expected = "[ 3001: James Wilkinson, 3002: Raheel Upphal, 3003: Emma Beech, 3004: Greg Davis, 3005: Leila Hsiao ]";
        String actual = students.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void previousStudentsTest()
    {
        String expected = "[ 2001: Sandy Pham, 2002: Caleb Powell, 2003: Joanna Hsiao, 2004: Whitney Martinez, 2005: Dan Zygmund-Felt ]";
        String actual = graduates.toString();

        Assert.assertEquals(expected, actual);
    }
}
