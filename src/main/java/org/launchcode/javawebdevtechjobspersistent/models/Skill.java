package org.launchcode.javawebdevtechjobspersistent.models;


import jdk.jfr.Event;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    private String skillsDescription;

    public Skill(){

    };

    public String getSkills() {
        return skillsDescription;
    }

    public void setSkills(String skills) {
        this.skillsDescription = skills;
    }
}