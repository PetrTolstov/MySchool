/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author user
 */
public class Journal {
        private Person student;
        private Subject subject;
        private Integer mark;
        private Date date;

    public Journal(Person person, Subject subject, Integer mark, Date date) {
        this.student = person;
        this.subject = subject;
        this.mark = mark;
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.YYYY");
        String dateStr = sdf.format(date);
        return "Journal{" + "student=" + student + ", subject=" + subject + ", mark=" + mark + ", date=" + date + '}';
    }
    
    public Journal() {
    }

   

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

}
