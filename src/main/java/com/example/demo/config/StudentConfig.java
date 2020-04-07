package com.example.demo.config;

import com.example.demo.domain.Student;
import com.example.demo.domain.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig
{
    @Bean(name = "students")
    public Students currentStudents()
    {
        return new Students(
            new Student(3001L, "James Wilkinson"),
            new Student(3002L, "Raheel Upphal"),
            new Student(3003L, "Emma Beech"),
            new Student(3004L, "Greg Davis"),
            new Student(3005L, "Leila Hsiao")
        );
    }

    @Bean(name = "previousStudents")
    public Students previousStudents()
    {
        return new Students(
                new Student(2001L, "Sandy Pham"),
                new Student(2002L, "Caleb Powell"),
                new Student(2003L, "Joanna Hsiao"),
                new Student(2004L, "Whitney Martinez"),
                new Student(2005L, "Dan Zygmund-Felt")
        );
    }
}
