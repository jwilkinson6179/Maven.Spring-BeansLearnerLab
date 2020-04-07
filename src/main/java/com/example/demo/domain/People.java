package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public abstract class People <PersonType extends Person> implements Iterable<PersonType>
{
    List<PersonType> personList;

    public People(List<PersonType> personList)
    {
        this.personList = personList;
    }

    public People(PersonType ... people)
    {
        personList = new ArrayList<>();
        for(PersonType person : people)
        {
            personList.add(person);
        }
    }

    public void add(PersonType person)
    {
        personList.add(person);
    }

    public void remove(PersonType person)
    {
        personList.remove(person);
    }

    public Integer size()
    {
        return personList.size();
    }

    public void clear()
    {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> people)
    {
        for(PersonType person : people)
        {
            personList.add(person);
        }
    }

    public PersonType findById(Long id)
    {
        for(PersonType person : personList)
        {
            if(person.getId().equals(id))
            {
                return person;
            }
        }

        return null;
    }

    public List<PersonType> findAll()
    {
        return personList;
    }

    @Override
    public String toString()
    {
        StringJoiner sj = new StringJoiner(", ", "[ ", " ]");

        for(PersonType person : personList)
        {
            sj.add(person.toString());
        }
        return sj.toString();
    }
}
