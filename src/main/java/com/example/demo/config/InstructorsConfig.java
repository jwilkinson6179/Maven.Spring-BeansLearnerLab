package com.example.demo.config;

import com.example.demo.domain.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig
{
    @Bean(name  = "tcUSAInstructors")
    public Instructors tcUsaInstructors()
    {
        return new Instructors();
    }

    @Bean("tcUKInstructors")
    public Instructors tcUkInstructors()
    {
        return new Instructors();
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors instructors()
    {
        return new Instructors();
    }
}
