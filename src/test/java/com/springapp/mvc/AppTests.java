package com.springapp.mvc;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class AppTests {

    @Autowired
    PersonRepository personRepository;

    @Ignore
    @Test
    public void testFindAll(){
        Person person = new Person("Klas", "Eckman");
        List<Jobb> jobbList = new ArrayList<Jobb>();
        jobbList.add(new Jobb("Sjef", "Statoil"));
        person.setJobbList(jobbList);
        personRepository.save(person);

        List<Person> personList = personRepository.findAll();

        System.out.println(personList.size());
    }

    @Test
    public void findByJobbTittel(){
        List<Person> personList = personRepository.findByJobbListTittel("Sjef");
        System.out.println(personList.size());
    }
}