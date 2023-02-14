package Assignment1;

import java.util.UUID;

public class Student extends Person {
    private UUID studentId;
    private int course;
    private double finalScore;
    private String faculty;

    public Student(UUID studentId) {
        this.studentId = studentId;
    }

    public Student(String name, int age, boolean isMan, UUID studentId, int course, double finalScore, String faculty) {
        super(name, age, isMan);
        this.studentId = studentId;
        this.course = course;
        this.finalScore = finalScore;
        this.faculty = faculty;
    }

    public void study() {
        System.out.println("I'm studying");
    }

    public boolean drinkBeerInsteadLessons() {
        if (finalScore > 3) {
            System.out.println("You have good marks, can relax and drink some beer");
            return true;
        }
        System.out.println("You shouldn't miss any lessons! ");
        return false;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}


