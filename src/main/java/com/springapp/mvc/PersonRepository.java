package com.springapp.mvc;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by christerhansen on 28.09.15.
 */
public interface PersonRepository extends MongoRepository<Person, String> {
    public List<Person> findAll();
    public Person save(Person person);
    public List<Person> findByJobbListTittel(String tittel);
    public List<Person> findByJobbListSted(String sted);
}
