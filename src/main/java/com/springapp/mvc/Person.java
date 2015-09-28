package com.springapp.mvc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * Created by christerhansen on 28.09.15.
 */
public class Person {
    @Id
    String id;
    String fornavn;
    String etternavn;
    int alder;

    List<Jobb> jobbList;

    public Person(String fornavn, String etternavn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public List<Jobb> getJobbList() {
        return jobbList;
    }

    public void setJobbList(List<Jobb> jobbList) {
        this.jobbList = jobbList;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }
}
