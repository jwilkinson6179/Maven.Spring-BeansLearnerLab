package com.example.demo.domain;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People<Student>
{
    List<Student> studentList;

    public Students(Student ... students)
    {
        super(students);
    }

    @Override
    public Iterator<Student> iterator()
    {
        return studentList.iterator();
    }

    @Override
    public void forEach(Consumer<? super Student> action)
    {
        for(Student student : studentList)
        {
            action.accept(student);
        }
    }

    @Override
    public Spliterator<Student> spliterator()
    {
        return studentList.spliterator();
    }
}
