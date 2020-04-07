package com.example.demo.config;

import com.example.demo.domain.Instructors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestInstructorsConfig
{
    @Autowired
    Instructors instructors;

    @Autowired
    @Qualifier("tcUSAInstructors")
    Instructors usaInstructors;

    @Autowired
    @Qualifier("tcUKInstructors")
    Instructors ukInstructors;

    @Test
    public void tcUsaTest()
    {
        String expected = "[ 10: Doug Williams ]";
        String actual = usaInstructors.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ucUkTest()
    {
        String expected = "[ 20: Taryn Allen ]";
        String actual = ukInstructors.toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void zipCodeTest()
    {
        String expected = "[ 1001: Dolio Durant, 1002: Froilan Miranda, 1003: Kris Younger, 1004: Chris Nobles, 1005: Roberto DeDeus ]";
        String actual = instructors.toString();

        Assert.assertEquals(expected, actual);
    }
}
