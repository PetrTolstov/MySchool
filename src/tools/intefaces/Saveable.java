/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.intefaces;

import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.List;

/**
 *
 * @author user
 */
public interface Saveable {
    public void savingToFilePerson(List<Person> arrayList, String fileName);
    public List loadFromFilePerson(String fileName);
    public void savingToFileSubject(List<Subject> arrayList, String fileName);
    public List loadFromFileSubject(String fileName);
    public void savingToFileJournal(List<Journal> arrayList, String fileName);
    public List loadFromFileJournal(String fileName);
        
    
}
