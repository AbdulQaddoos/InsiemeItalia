package com.insieme.manager;


import java.util.List;

public class DB {




    public static Person getPerson(String code, List<Person> people){
        for(Person person : people){
            if(person.getCodice_fiscale().toLowerCase().equals(code)){
                return person;
            }
        }
        return null;
    }
}
