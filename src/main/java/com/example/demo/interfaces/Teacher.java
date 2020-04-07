package com.example.demo.interfaces;

public interface Teacher
{
    public void teach(Double numberOfHours, Learner learner);

    public void lecture(Double numberOfHours, Iterable<? extends Learner> learners);
}