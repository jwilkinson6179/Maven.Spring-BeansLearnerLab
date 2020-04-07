package com.example.demo.domain;

public class Person
{
    private final Long id;
    private String name;

    public Person(Long id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Long getId()
    {
        return this.id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return id + ": " + name;
    }
}
