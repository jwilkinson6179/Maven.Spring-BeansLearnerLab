package com.example.demo;

import com.example.demo.domain.Instructor;
import com.example.demo.domain.Instructors;
import com.example.demo.domain.Student;
import com.example.demo.domain.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni
{
    private Students students;
    private Instructors instructors;

    @Autowired
    public Alumni(@Qualifier("previousStudents") Students students, Instructors instructors)
    {
        this.students = students;
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootcamp()
    {
        for(Instructor instructor : instructors)
        {
            instructor.lecture(1200.0, students);
        }
    }
}
