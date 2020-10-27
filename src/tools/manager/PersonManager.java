/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.manager;

import entity.Person;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import myschool.App;

/**
 *
 * @author user
 */
public class PersonManager {
    private Scanner scanner = new Scanner(System.in);
    List<Person> listPersons;

    public PersonManager(List<Person> listPersons) {
        this.listPersons = listPersons;
    }
    
    
    public static void addToList(Person student, List<Person> listPersons) {
        listPersons.add(student);
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.savingToFilePerson(listPersons, "listPersons");
    }

    PersonManager() {
        
    }

    public List<Person> getListPersons() {
        return listPersons;
    }

    public Person createPerson(String role) {
        System.out.println("---Добавление пользователя---");
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
    
    public void getStudents(){
        for(int i = 0; i < listPersons.size(); i++){
                    String role = listPersons.get(i).getRole();
                    if("STUDENT".equals(role)){
                        System.out.println(i + " " + listPersons.get(i));
                }
        }}
    
    public void getTeahers(){
    for(int i = 0; i < listPersons.size(); i++){
                    String role = listPersons.get(i).getRole();
                    if("TEACHER".equals(role)){
                        System.out.println(i + " " + listPersons.get(i));
                }
                        
             }
    }



}
