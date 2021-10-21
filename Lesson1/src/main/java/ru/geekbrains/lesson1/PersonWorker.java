package ru.geekbrains.lesson1;

import java.util.Arrays;
import java.lang.reflect.*;

public class PersonWorker {
    private String fio;
    private String jobPosition;
    private String phone;
    private String mail;
    private double salary;
    private int age;

    public PersonWorker(String _fio, String _jobPosition, String _phone, String _mail, double _salary, int _age){
        this.fio =   _fio;
        this.age =   _age;
        this.jobPosition = _jobPosition;
        this.mail = _mail;
        this.phone = _phone;
        this.salary= _salary;
    }

    public void print(){
        System.out.println("Fields:");
        System.out.println("FIO: "+this.fio);
        System.out.println("Age: "+this.age);
        System.out.println("Job position: "+this.jobPosition);
        System.out.println("Mail: "+this.mail);
        System.out.println("Phone: "+this.phone);
        System.out.println("Salary: "+this.salary);
    }

    public int getAge() {
        return age;
    }
}
