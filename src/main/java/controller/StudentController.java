package controller;

import data.model.Student;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "studentController")
@SessionScoped
public class StudentController {
    private Student student = new Student();



    public void setStudent(Student student) {
        this.student = student;
    }
    public String isNextPage(){
        return "success";
    }
}
