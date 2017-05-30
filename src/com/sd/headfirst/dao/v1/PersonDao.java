package com.sd.headfirst.dao.v1;
import java.util.*;
public interface PersonDao{
  public List<Person> getAllPersons();
  public Person getPerson(int id);
  public void updatePerson(Person p);
  public void deletePerson(Person p);
}