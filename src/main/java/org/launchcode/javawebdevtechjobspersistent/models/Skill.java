package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotNull(message = "Please provide a description")
    @Size(min = 1, max = 500, message = "Description limited to 500 characters.")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs= new ArrayList<>();

    public Skill(String description) {
        this.description = description;
    }

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}