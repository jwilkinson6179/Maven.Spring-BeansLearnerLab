package com.example.demo.domain;

import com.example.demo.interfaces.Teacher;

public class Classroom
{
    Instructors instructors;
    Students students;

    public Classroom(Instructors instructors, Students students)
    {
        this.instructors = instructors;
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours)
    {
        teacher.lecture(numberOfHours, students);
    }

    @Override
    public String toString()
    {
        return "Instructors:: " + instructors + "\nStudents:: " + students;
    }
}
