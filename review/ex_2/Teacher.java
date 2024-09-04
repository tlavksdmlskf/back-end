package review.ex_2;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Person{
    private String name;
    private String subject;
    private int experience;
    private List<Student> students;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
        student.setTeacher(this);
    }

    public void showStudents(){
        System.out.println("Mr. " + name + " teaches the following students:");
        for (Student s : students){
            System.out.println("- " + s.getName());
        }
    }

    public void teach(){
        System.out.println(name + " is teaching " + subject);
    }


    @Override
    public void showInfo(){
        System.out.println("Teacher Name: Mr. " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience);
        showStudents();
        teach();
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
