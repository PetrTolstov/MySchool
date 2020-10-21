/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myschool;

import entity.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tools.manager.PersonManager;
import tools.manager.SaveToFile;

/**
 *
 * @author user
 */
class App {
    private Scanner scanner = new Scanner(System.in);  
    private List<Person> listPersons = new ArrayList<>();
    private PersonManager personManager = new PersonManager();
    
    public App(){
        System.out.println("---Успешное подключение массива---");
        SaveToFile saveToFile = new SaveToFile();
        this.listPersons = saveToFile.loadFromFile("listPersons");
    }
    
    public void run() {
         System.out.println("---My School---");
        boolean repeat = true;
         
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
                for(int i = 0; i < listPersons.size(); i++){
                    String role = listPersons.get(i).getRole();
                    if("STUDENT".equals(role)){
                        System.out.println(listPersons.get(i));
                }
                        
             }
                break;
                
            case "3":
                
                Person teacher = personManager.createPerson("TEACHER");
                PersonManager.addToList(teacher, listPersons);
                break;

                
            case "4":
                for(int i = 0; i < listPersons.size(); i++){
                    if(listPersons.get(i).getRole() == "TEACHER"){
                        System.out.println(listPersons.get(i));
                }}
                break;
                
            case "5":
                break;
                
            case "6":
                
                break;
            case "7":
                
                break;
            case "8":
                
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
