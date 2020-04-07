package com.example.demo.config;

import com.example.demo.domain.Instructor;
import com.example.demo.domain.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig
{
    @Bean(name  = "tcUSAInstructors")
    public Instructors tcUsaInstructors()
    {
        return new Instructors(new Instructor(10L, "Doug Williams"));
    }

    @Bean("tcUKInstructors")
    public Instructors tcUkInstructors()
    {
        return new Instructors(new Instructor(20L, "Taryn Allen"));
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors instructors()
    {
        return new Instructors(
                new Instructor(1001L, "Dolio Durant"),
                new Instructor(1002L, "Froilan Miranda"),
                new Instructor(1003L, "Kris Younger"),
                new Instructor(1004L, "Chris Nobles"),
                new Instructor(1005L, "Roberto DeDeus")
        );
    }
}
