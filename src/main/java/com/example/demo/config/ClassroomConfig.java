package com.example.demo.config;

import com.example.demo.domain.Classroom;
import com.example.demo.domain.Instructors;
import com.example.demo.domain.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig
{
    @Bean(name = "cohort")
    @DependsOn( { "instructors", "students"} )
    public Classroom currentCohort(@Qualifier("instructors") Instructors instructors, @Qualifier("students") Students students)
    {
        return new Classroom(instructors, students);
    }

    @Bean(name = "previousCohort")
    @DependsOn( { "instructors", "previousStudents"} )
    public Classroom previousCohort(@Qualifier("instructors") Instructors instructors, @Qualifier("previousStudents") Students students)
    {
        return new Classroom(instructors, students);
    }
}
