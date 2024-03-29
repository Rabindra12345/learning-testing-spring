package com.rd.test.service;

//import com.demo.entites.Person;
//import com.demo.repo.PersonRepo;
import com.rd.test.model.Person;
import com.rd.test.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepo repo;

    public List<Person> getAllPerson() {

        return this.repo.findAll();
    }


    //CREATED ONLY FOR TESTING PURPOSE
    public PersonService(PersonRepo personRepo){
        this.repo = personRepo;
    }
}
