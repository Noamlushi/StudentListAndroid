package com.example.ex2.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

public class Model {
    private static final Model _instance = new Model();

    public static Model instance(){
        return _instance;
    }
    private Model(){

            addStudent(new Student("Noam Lushi " ,"26441258","","050-00000000","Ramat-Gan",false));
            addStudent(new Student("Hadar Basson " ,"26442688","","050-00240000","Ramat-Gan",false));
            addStudent(new Student("Eliav Menashe  " ,"21357968","","050-00540000","Rishon-Lezion",false));
            addStudent(new Student("Gal Jacobson " ,"298125214","","050-00320000","Rishon-Lezion",false));
            addStudent(new Student("Igor Rochlin " ,"29987853","","050-00001200","Ashdod",false));
            addStudent(new Student("Efi Props " ,"21567898","","050-00012000","Tel-Aviv",false));

    }

    List<Student> data = new LinkedList<>();

    public List<Student> getAllStudents(){
        return data;
    }

    public void addStudent(Student st){
        data.add(st);
    }





}
