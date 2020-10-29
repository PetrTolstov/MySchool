/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Subject implements Serializable {
    private String name;
    private String duration;
    private String personalTeacher;

    @Override
    public String toString() {
        return "Subject{" + "name=" + name + ", duration=" + duration + ", personalTeacher=" + personalTeacher + '}';
    }
    
    public Subject(String name, String duration, String personalTeacher) {
        this.name = name;
        this.duration = duration;
        this.personalTeacher = personalTeacher;
    }

    public Subject() {
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPersonalTeacher() {
        return personalTeacher;
    }

    public void setPersonalTeacher(String personalTeacher) {
        this.personalTeacher = personalTeacher;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.duration);
        hash = 37 * hash + Objects.hashCode(this.personalTeacher);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Subject other = (Subject) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.duration, other.duration)) {
            return false;
        }
        if (!Objects.equals(this.personalTeacher, other.personalTeacher)) {
            return false;
        }
        return true;
    }


}
