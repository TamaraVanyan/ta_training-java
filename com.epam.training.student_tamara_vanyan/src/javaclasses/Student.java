package javaclasses;

import java.time.LocalDate;

class Student{
    private int id;
    private String name;
    private String surname;
    private String middleName;
    private  LocalDate date;
    private String address;
    private String tell;
    private String faculty;
    private int course;
    private  int group;

    public Student(long id, String name, String surname, String middleName, LocalDate date, String address, String tell,
                   String faculty, int course, int group){
        this.id = (int) id;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.date = date;
        this.address = address;
        this.tell = tell;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getName(){
        return name;
    }
    public  String getSurname() { return surname; }
    public String getFaculty(){
        return faculty;
    }
    public int getCourse() { return course; }
    public int getGroup() { return group; }
    public LocalDate  getDate(){
        return date;
    }
}
