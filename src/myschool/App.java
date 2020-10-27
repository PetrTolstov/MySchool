/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschool;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tools.manager.JournalManager;
import tools.manager.PersonManager;
import tools.manager.SaveToFile;
import tools.manager.SubjectManager;

/**
 *
 * @author user
 */
public class App {
    private Scanner scanner = new Scanner(System.in);  

    public List<Person> getListPersons() {
        return listPersons;
    }
    private List<Person> listPersons = new ArrayList<>();
    private PersonManager personManager = new PersonManager(listPersons);
    private List<Subject> listSubjects = new ArrayList<>();
    private SubjectManager subjectManager = new SubjectManager(listSubjects);
    private List<Journal> listJournals = new ArrayList<>();
    private JournalManager journalManager = new JournalManager();
    
    public App(){
        System.out.println("---Успешное подключение массива---");
        SaveToFile saveToFile = new SaveToFile();
        this.listPersons = saveToFile.loadFromFilePerson("listPersons");
        this.listSubjects =  saveToFile.loadFromFileSubject("listSubjects");
    }

    public List<Subject> getListSubjects() {
        return listSubjects;
    }
    
    public void run() {
         System.out.println("---My School---");
        boolean repeat = true;
        
        personManager = new PersonManager(listPersons);
        subjectManager = new SubjectManager(listSubjects);
         
         do{
         System.out.println("Задачи:");
         System.out.println("0. Выход из приложения");
         System.out.println("1. Добавить ученика");
         System.out.println("2. Список учеников");
         System.out.println("3. Добавить учителя");
         System.out.println("4. Список учителей");
         System.out.println("5. Добавить предмет");
         System.out.println("6. Список предметов");
         System.out.println("7. Выставить оценку");
         System.out.println("8. Посмотреть оценки ученика");
         System.out.println("9. Оценки по предмету");
         System.out.println("10. Изменить оценку");
         System.out.println("Выберите задачу:");
         
        String task = scanner.nextLine();
        switch(task){
            case "0":
                System.out.println("До свидания");
                repeat = false;
                break;
                
            case "1":
                Person student = personManager.createPerson("STUDENT");
                PersonManager.addToList(student, listPersons);
                break;
                
            case "2":
                personManager.getStudents();
                break;
                
            case "3":
                Person teacher = personManager.createPerson("TEACHER");
                PersonManager.addToList(teacher, listPersons);
                break;

                
            case "4":
                personManager.getTeahers();
                break;
                
            case "5":
                Subject subject = subjectManager.createSubject();
                subjectManager.addToList(subject, listSubjects);
                break;
                
            case "6":
                subjectManager.getSubjects();
                break;
            case "7":
                Journal journal = journalManager.createJournal(listSubjects, listPersons );
                journalManager.addToList(journal, listJournals);
                break;
            case "8":
                journalManager.getJournalByStudent(listJournals);
                break;
            case "9":
                break;
                
            case "10":
                break;
                
            default:
                
                break;
        }     
        
         }while(repeat);
    }


    
}
