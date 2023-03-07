package com.rd.test.repo;
//import com.demo.entites.Person;
import com.rd.test.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepo extends JpaRepository<Person, Integer> {
    @Query(value="SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM person s WHERE s.personId = ?1",nativeQuery=true)
    Boolean isPersonExitsById(Integer id);

}

