package com.andikscript.runspring.model;

public class Student {

    private Integer idStudent;

    private String name;

    public Student(Integer idStudent, String name) {
        this.idStudent = idStudent;
        this.name = name;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", name='" + name + '\'' +
                '}';
    }
}
