package com.example.demo.domain;

import com.example.demo.interfaces.Learner;
import com.example.demo.interfaces.Teacher;

import java.util.stream.StreamSupport;

public class Instructor extends Person implements Teacher
{
    public Instructor(Long id, String name)
    {
        super(id, name);
    }

    @Override
    public void teach(Double numberOfHours, Learner learner)
    {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Double numberOfHours, Iterable<? extends Learner> learners)
    {
        Integer sizeOfLecture = numberOfAttendees(learners);

        for(Learner attendee : learners)
        {
            attendee.learn(numberOfHours / sizeOfLecture);
        }
    }

    private Integer numberOfAttendees(Iterable<? extends Learner> learners)
    {
        return Math.toIntExact(StreamSupport.stream(learners.spliterator(), false).count());
    }
}
