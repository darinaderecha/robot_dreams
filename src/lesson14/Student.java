package lesson14;

import java.util.UUID;

public class Student extends Human {
    protected String faculty;

    protected StudentCard studentCard;

    private Scholarship scholarship;

    public Student(String name, int age, String faculty, StudentCard studentCard, Scholarship scholarship) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
        this.studentCard = studentCard;
        this.scholarship = scholarship;
    }

    @Override
    public void move() {
        System.out.println("Get by bus");
    }

    public static class Scholarship {
        protected double scholarship;
        protected double averageScore;
        protected double additionalScores;
        protected boolean socialScholarship;

        public double getScholarship() {
            return scholarship;
        }

        public double setScholarship(double averageScore, double additionalScores, boolean socialScholarship) {
            if (averageScore > 165.0) {
                if (additionalScores > 20) {
                    return 3000.0;
                }
                return 1500.0;
            } else if (socialScholarship) {
                return 1000.0;
            }
            return 0;


        }
    }

    private class StudentCard {
        private UUID studentId;


        UUID getStudentId() {
            return studentId;
        }

        void setStudentId(UUID studentId) {
            this.studentId = studentId;
        }
    }


}
