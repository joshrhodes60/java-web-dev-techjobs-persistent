package org.launchcode.javawebdevtechjobspersistent.models;


import com.sun.xml.bind.annotation.XmlLocation;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    @NotBlank
    @Size(min=1,max=30)
    private String location;

    public Employer(){

    };

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}