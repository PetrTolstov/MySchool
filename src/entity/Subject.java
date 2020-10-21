/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author user
 */
public class Subject {
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


}
