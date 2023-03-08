package com.rd.test.repo;

import com.rd.test.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    void isPersonExitsById() {
        Person person = new Person();

        person.setPersonCity("ITAHARI");
        person.setPersonName("RAMA");
        personRepo.save(person);
        Boolean actualResult = personRepo.isPersonExitsById(11);
        assertThat(actualResult).isTrue();
    }
}