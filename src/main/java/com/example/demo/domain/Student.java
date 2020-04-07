package com.example.demo.domain;

import com.example.demo.interfaces.Learner;

public class Student extends Person implements Learner
{
    Double totalStudyTime;

    public Student(Long id, String name)
    {
        super(id, name);
        totalStudyTime = 0.0;
    }

    @Override
    public void learn(Double numberOfHours)
    {
        totalStudyTime += numberOfHours;
    }

    public Double totalStudyTime()
    {
        return this.totalStudyTime;
    }
}
