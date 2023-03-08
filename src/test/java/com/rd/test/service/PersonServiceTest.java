package com.rd.test.service;

import com.rd.test.repo.PersonRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
//import static org.mockito.Mockito.verify;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class PersonServiceTest {


    @Mock
    private PersonRepo pr;

    private PersonService personService;


    @BeforeEach
    void setUp() {

        this.personService= new PersonService(pr);
    }

    @Test
    void getAllPerson() {

        personService.getAllPerson();
        verify(pr).findAll();

    }
}