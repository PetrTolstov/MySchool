/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.manager;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class JournalManager {
    private Scanner scanner = new Scanner(System.in);
   
    private Calendar c = new GregorianCalendar();
    
    public void addToList(Journal journal, List<Journal> listJournals) {
        listJournals.add(journal);
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.savingToFileJournal(listJournals, "listJournals");
    }

    public Journal createJournal(List<Subject> listSubjects, List<Person> listPersons) {
        System.out.println("---Добавление отметки в журнал---");
        
        PersonManager personManager =  new PersonManager(listPersons);
        SubjectManager subjectManager =  new SubjectManager(listSubjects);
        
        Journal journal = new Journal();
        System.out.println("Предмет: ");
        subjectManager.getSubjects();
        journal.setSubject(subjectManager.getListSubjects().get(scanner.nextInt()));
       
        System.out.println("Ученик: ");
        personManager.getStudents();
        journal.setStudent(personManager.getListPersons().get(scanner.nextInt()));
        
        System.out.println("Оценка: ");
        journal.setMark(scanner.nextInt());
        
        journal.setDate(c.getTime());
        return journal;
    }

    public void getJournalByStudent( List<Journal> listJournals,  List<Person> listPersons) {
        System.out.println("Ученик: ");
        Journal journal = new Journal();
        
        PersonManager personManager =  new PersonManager(listPersons);
        personManager.getStudents();
        
        Person person = personManager.getListPersons().get(scanner.nextInt());
        journal.getByStudent( person , listJournals);
}
public void getJournalBySubject( List<Journal> listJournals,  List<Subject> listSubjects) {
        System.out.println("Предмет: ");
        Journal journal = new Journal();
        
        SubjectManager subjectManager =  new SubjectManager(listSubjects);
        subjectManager.getSubjects();
        
        Subject subject = subjectManager.getListSubjects().get(scanner.nextInt());
        journal.getBySubject( subject , listJournals);
}

    public void getJournalByStudentWC(List<Journal> listJournals, List<Person> listPersons) {
        System.out.println("Ученик: ");
        Journal journal = new Journal();
        
        PersonManager personManager =  new PersonManager(listPersons);
        personManager.getStudents();
        
        Person person = personManager.getListPersons().get(scanner.nextInt());
        journal.getChangeMark( person , listJournals);
    }

}
