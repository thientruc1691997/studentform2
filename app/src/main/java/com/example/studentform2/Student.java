package com.example.studentform2;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
   private String name;
   private Date dob;
   private boolean gender;


    public Student(String name, Date dob, boolean gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
