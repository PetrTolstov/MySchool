/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.manager;

import entity.Person;
import entity.Subject;
import java.util.List;
import java.util.Scanner;
import myschool.App;

/**
 *
 * @author user
 */
public class SubjectManager {
    private Scanner scanner = new Scanner(System.in);
    private List<Subject> listSubjects;
    
    public SubjectManager(List<Subject> listSubjects) {
        this.listSubjects = listSubjects;
    }
    
    public static void addToList(Subject subject, List<Subject> listSubjects) {
        listSubjects.add(subject);
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.savingToFileSubject(listSubjects, "listSubjects");
    }

    SubjectManager() {
        
    }

    public Subject createSubject() {
        System.out.println("---Добавление предмета---");
        Subject subject = new Subject();
        System.out.println("Название: ");
        subject.setName(scanner.nextLine());
        
        System.out.println("Длительность: ");
        subject.setDuration(scanner.nextLine());
        
        System.out.println("Преподаватель: ");
        subject.setPersonalTeacher(scanner.nextLine());

        
        return subject;
    }

    public void getSubjects(){
        for(int i = 0; i < listSubjects.size(); i++){
                    System.out.println( i + " " + listSubjects.get(i).toString());      
             }
    }

    public List<Subject> getListSubjects() {
        return listSubjects;
    }


}


