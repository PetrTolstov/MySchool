/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.manager;

import entity.Person;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author user
 */
public class PersonManager {
    private Scanner scanner = new Scanner(System.in);
    
    public static void addToList(Person student, List<Person> listPersons) {
        listPersons.add(student);
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.savingToFile(listPersons, "listPersons");
    }

    public Person createPerson(String role) {
        System.out.println("---Добавление ученика---");
        Person student = new Person();
        System.out.println("Имя: ");
        student.setFirstName(scanner.nextLine());
        
        System.out.println("Фамилия: ");
        student.setLastName(scanner.nextLine());
        
        System.out.println("Номер: ");
        student.setPhone(scanner.nextLine());
        
        student.setRole(role);
        
        return student;
    }
    
}
