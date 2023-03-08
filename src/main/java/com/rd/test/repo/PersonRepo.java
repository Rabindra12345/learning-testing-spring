package com.rd.test.repo;
//import com.demo.entites.Person;
import com.rd.test.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


//@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
//    @Query(value="SELECT CASE WHEN COUNT(*) > 0 THEN TRUE ELSE FALSE END FROM person WHERE personId :id",nativeQuery=true)
    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Person s WHERE s.personId =?1")
    Boolean isPersonExitsById(Integer id);

}

