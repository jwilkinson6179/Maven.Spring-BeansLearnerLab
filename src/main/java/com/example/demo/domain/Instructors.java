package com.example.demo.domain;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends People<Instructor>
{
    List<Instructor> instructorList;

    public Instructors(Instructor ... instructors)
    {
        super(instructors);
    }

    @Override
    public Iterator<Instructor> iterator()
    {
        return instructorList.iterator();
    }

    @Override
    public void forEach(Consumer<? super Instructor> action)
    {
        for(Instructor instructor : instructorList)
        {
            action.accept(instructor);
        }
    }

    @Override
    public Spliterator<Instructor> spliterator()
    {
        return instructorList.spliterator();
    }
}
